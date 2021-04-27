package hw2;

import java.util.Scanner;

abstract class Shape {
	
	private Shape next;
	public Shape() { next = null;}
	public void setNext(Shape obj) {next = obj;} //링크 연결
	public Shape getNext() {return next;}
	public abstract void draw();
}

class Circle extends Shape {
	
	@Override
	public void draw() {
		 System.out.println("Circle");
	}

}

class Line extends Shape {
	
	@Override
	public void draw() {
		 System.out.println("Line");
	}
}

class Rect extends Shape {

	@Override
	public void draw() {
		 System.out.println("Rect");
	}

}

class GraphicEditor { //필요하다면 메소드 추가 가능

	//필드 선언
	private String name;
	private Scanner scanner = new Scanner(System.in);
	private Shape start=null, end=null;

	//생성자 작성
	public GraphicEditor(String name) {
		this.name = name;
	}

	public void run() {
		System.out.println("그래픽 에디터 " + name + "을 실행합니다.");
			
		int choice = 0;
			
		while (choice != 4) { 	
			int type, index;
			System.out.print("삽입(1), 삭제(2), 모두 보기(3), 종료(4)>>");
			
			choice = scanner.nextInt();
			switch (choice) {
				case 1:	//삽입
					System.out.print("Line(1), Rect(2), Circle(3)>>");
					type = scanner.nextInt();
					if (type < 1 || type > 3) {
						System.out.println("잘못 선택하셨습니다.");
						break;
					}
					insert(type);
					break;
					
				case 2:	//삭제
					System.out.print("삭제할 도형의 위치>>");
					index = scanner.nextInt();
					if (!delete(index)) {
						System.out.println("삭제할 수 없습니다.");
					}
					break;
					
				case 3:	//모두 보기
					Shape p = start;
					while(p != null) {
						p.draw();
						p = p.getNext();
					}
					break;
					
				case 4:	//끝내기
					break;
					
				default:
					System.out.println("잘못 입력하셨습니다.");
			}
		}
		System.out.println(name + "을 종료합니다.");
		

	}

	private boolean delete(int index) {
		
		Shape current = start, previous = start;
		
		if (start == null) //리스트가 빈 경우
			return false;
		
		for (int i=0; i<index; i++) {
			previous = current;
			current = current.getNext(); //다음 원소로 이동
			if (current == null) //인덱스가 리스트 원소 갯수보다 큰 경우
				return false;
		}
		
		if (start == end) { //리스트에 원소가 한개밖에 없는 경우
			start = end = null;
			return true;
		}
		
		if (current == start) {	//첫번째 원소를 삭제하는 경우
			start = start.getNext(); //다음 원소가 첫번째 원소가 됨
		}
		
		else if (current == end) {	//마지막 원소를 삭제하는 경우
			end = previous; //이전 원소가 마지막 원소가 됨
			end.setNext(null);
		} else {
			previous.setNext(current.getNext()); //현재 원소를 리스트에서 삭제
		}
		
		return true;
	}

	private void insert(int choice) {
		
		Shape obj=null;
		
		switch (choice) {
			case 1: //Line
				 obj = new Line();
				 break;
			case 2: //Rect
				obj = new Rect();
				break;
			case 3: //Circle
				obj = new Circle();
		}
		
		if (start == null) { //리스트가 비었을 때
			start = end = obj;
		} else {
			end.setNext(obj); //마지막 원소 뒤에 삽입
			end = obj;
		}
	
	}

}

public class Practice5_12 {

	public static void main(String[] args) {

		GraphicEditor ge = new GraphicEditor("beauty");
		ge.run();

	}

}