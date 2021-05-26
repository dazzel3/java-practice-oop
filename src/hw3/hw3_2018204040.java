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
	
	// ��ȭ��ȣ ���� ���α׷� �۵� �޼���
	public void run() {
		System.out.println("<< ��ȭ��ȣ ���� ���α׷� ���� >>");
		readPhoneBook();
		showAll();
		while(true) {
			System.out.print("1.�߰� 2.���� 3.���� 4.�˻� 5.���� : ");
			int menu = readNumber();
			switch(menu) {
				case 1: insert(); saveFile(); showAll(); break; //�߰�
				case 2: delete(); saveFile(); showAll(); break; //����
				case 3: update(); saveFile(); showAll(); break; //����
				case 4: search(); saveFile(); showAll(); break;	//�˻�
				case 5: System.out.println("���α׷� ����..."); return; //����				
				default: System.out.println("�߸��� �Է��Դϴ�. �ٽ� �Է��ϼ���."); continue;
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
					break; //���� ���� ������ ��� close
				}
			} 
			catch (IOException e) {
				System.exit(1);
			}
		}
	}

	//������ �о� �����ϴ� �޼���
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

	//�̸�, ��ȭ��ȣ �߰� �޼���
	private void insert() {
		System.out.print("- �̸� �Է�: ");
		String name = scanner.next();
		if(table.get(name)!=null) {
			System.out.println("�̹� �����մϴ�.");
			return;
		}
		
		System.out.print("- ��ȭ��ȣ �Է�: ");
		String telNum = scanner.next();		
		
		//�ؽ� ���̺� �߰�
		table.put(name, new Phone(name, telNum));
	}
	
	//��ϵ� �̸��� ã�� �����ϴ� �޼���
	private void delete() {
		System.out.print("- ������ �̸� �Է�: ");
		String name = scanner.next();
		Phone p = table.remove(name); //�ؽ� ���̺��� ����
		if(p == null)
			System.out.println(name +"���� ��ϵǾ� ���� �ʽ��ϴ�.");
		else {
			System.out.println(name+"���� �����Ǿ����ϴ�.");
		}
	}
	
	//��ϵ� �̸��� ã�� �����ϴ� �޼���
	private void update() {
		System.out.print("- ������ �̸� �Է�: ");
		String name = scanner.next();
		Phone p = table.remove(name); //�ؽ� ���̺��� ����
		if(p == null)
			System.out.println(name+"���� ��ϵǾ� ���� �ʽ��ϴ�.");
		else {
			System.out.print("- ��ȭ��ȣ �Է�: ");
			String telNum = scanner.next();
			table.put(name, new Phone(name, telNum)); //������ ���� �ؽ� ���̺� �߰�
		}
	}
	
	//��ϵ� �̸��� ã�� �ش� ��ȭ��ȣ�� ���� �޼���
	private void search() {
		System.out.print("- �˻��� �̸� �Է�: ");
		String name = scanner.next();
		Phone p = table.get(name); //�ؽ� ���̺��� �˻�
		if(p == null)
			System.out.println(name +"���� ��ϵǾ� ���� �ʽ��ϴ�.");
		else
			System.out.println(p.getTelNum());
			System.out.println("");
	}
	
	//������� �ݿ��� ��ü ���� ��� �޼���
	private void showAll() {
		System.out.println("[�̸�]	[��ȭ��ȣ]");
		
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

//��ȭ��ȣ ���� ���α׷��� ���� Ŭ����
class Phone {
	private String name; //�̸�
	private String telNum; //��ȭ��ȣ
	
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
