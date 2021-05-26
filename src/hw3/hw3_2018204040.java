package hw3;

import java.io.*;
import java.util.*;

public class hw3_2018204040 {

	private Scanner scanner;
	private BufferedReader br = null; 
	private BufferedWriter bw = null;
	private Hashtable<String, Phone> table = new Hashtable<String, Phone>();
	File text = new File("phoneNum.txt");
		
	public hw3_2018204040() {
		scanner = new Scanner(System.in);		
	}
	
	// 전화번호 관리 프로그램 작동 메서드
	public void run() {
		System.out.println("<< 전화번호 관리 프로그램 시작 >>");
		readPhoneBook();
		showAll();
		while(true) {
			System.out.print("1.추가 2.삭제 3.수정 4.검색 5.종료 : ");
			int menu = readNumber();
			switch(menu) {
				case 1: insert(); saveFile(); showAll(); break; //추가
				case 2: delete(); saveFile(); showAll(); break; //삭제
				case 3: update(); saveFile(); showAll(); break; //수정
				case 4: search(); saveFile(); showAll(); break;	//검색
				case 5: System.out.println("프로그램 종료..."); return; //종료				
				default: System.out.println("잘못된 입력입니다. 다시 입력하세요."); continue;
			}
		}	
	}
	
	private void readPhoneBook() {
		
		try {
			br = new BufferedReader(new FileReader(text));
		} catch (FileNotFoundException e) {
			return;
		}
		while (true) {
			String name = null;
			String telNum = null;

			try {
				name = (String)br.readLine();
				telNum = (String)br.readLine();
				if (name != null && telNum != null)
					table.put(name, new Phone(name, telNum));
				else {
					br.close();
					break; //파일 끝에 도달한 경우 close
				}
			} 
			catch (IOException e) {
				System.exit(1);
			}
		}
	}

	//파일을 읽어 저장하는 메서드
	private void saveFile() {
		try {
			bw = new BufferedWriter(new FileWriter(text, false));
		} catch (FileNotFoundException e) {
			return;
		} catch (IOException e) {
			return;
		}
		
		Vector<String> v = new Vector<String>(table.keySet());
		Collections.sort(v);
		
		Enumeration<String> e = v.elements();
		
		while(e.hasMoreElements()) {
			String name = e.nextElement();
			Phone p = table.get(name);
			try {
				bw.write(name+"\n");
				bw.write(p.getTelNum()+"\n");
			} catch (IOException e1) {
				System.exit(1);
			}	
		}
		try {
			
			bw.close();
		} catch (IOException e1) {
		}
	}

	//이름, 전화번호 추가 메서드
	private void insert() {
		System.out.print("- 이름 입력: ");
		String name = scanner.next();
		if(table.get(name)!=null) {
			System.out.println("이미 존재합니다.");
			return;
		}
		
		System.out.print("- 전화번호 입력: ");
		String telNum = scanner.next();		
		
		//해쉬 테이블에 추가
		table.put(name, new Phone(name, telNum));
	}
	
	//등록된 이름을 찾아 삭제하는 메서드
	private void delete() {
		System.out.print("- 삭제할 이름 입력: ");
		String name = scanner.next();
		Phone p = table.remove(name); //해쉬 테이블에서 삭제
		if(p == null)
			System.out.println(name +"님은 등록되어 있지 않습니다.");
		else {
			System.out.println(name+"님이 삭제되었습니다.");
		}
	}
	
	//등록된 이름을 찾아 수정하는 메서드
	private void update() {
		System.out.print("- 수정할 이름 입력: ");
		String name = scanner.next();
		Phone p = table.remove(name); //해쉬 테이블에서 삭제
		if(p == null)
			System.out.println(name+"님은 등록되어 있지 않습니다.");
		else {
			System.out.print("- 전화번호 입력: ");
			String telNum = scanner.next();
			table.put(name, new Phone(name, telNum)); //수정된 내용 해쉬 테이블에 추가
		}
	}
	
	//등록된 이름을 찾아 해당 전화번호를 보는 메서드
	private void search() {
		System.out.print("- 검색할 이름 입력: ");
		String name = scanner.next();
		Phone p = table.get(name); //해쉬 테이블에서 검색
		if(p == null)
			System.out.println(name +"님은 등록되어 있지 않습니다.");
		else
			System.out.println(p.getTelNum());
			System.out.println("");
	}
	
	//현재까지 반영된 전체 내용 출력 메서드
	private void showAll() {
		System.out.println("[이름]	[전화번호]");
		
		Vector<String> v = new Vector<String>(table.keySet());
		Collections.sort(v);
		
		Enumeration<String> e = v.elements();
		while(e.hasMoreElements()) {
			String name = e.nextElement();
			Phone p = table.get(name);
			System.out.println(p.toString());
		}
	}
	
	private int readNumber() {
		int n=-1;
		try {
			n = scanner.nextInt();
		}
		catch(InputMismatchException e) {
			return -1;
		}
		return n;
	}

	public static void main(String args[]) {
		hw3_2018204040 pb = new hw3_2018204040();
		pb.run();
	}
}

//전화번호 관리 프로그램의 정보 클래스
class Phone {
	private String name; //이름
	private String telNum; //전화번호
	
	public Phone(String name, String telNum) {
		this.name = name;
		this.telNum = telNum;
	}
	
	public String getName() {return name;}
	public String getTelNum() {return telNum;}	
	
	public String toString() {
		return name + "	" + telNum;
		
	}
}
