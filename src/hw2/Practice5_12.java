package hw2;

import java.util.Scanner;

abstract class Shape {
	
	private Shape next;
	public Shape() { next = null;}
	public void setNext(Shape obj) {next = obj;} //��ũ ����
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

class GraphicEditor { //�ʿ��ϴٸ� �޼ҵ� �߰� ����

	//�ʵ� ����
	private String name;
	private Scanner scanner = new Scanner(System.in);
	private Shape start=null, end=null;

	//������ �ۼ�
	public GraphicEditor(String name) {
		this.name = name;
	}

	public void run() {
		System.out.println("�׷��� ������ " + name + "�� �����մϴ�.");
			
		int choice = 0;
			
		while (choice != 4) { 	
			int type, index;
			System.out.print("����(1), ����(2), ��� ����(3), ����(4)>>");
			
			choice = scanner.nextInt();
			switch (choice) {
				case 1:	//����
					System.out.print("Line(1), Rect(2), Circle(3)>>");
					type = scanner.nextInt();
					if (type < 1 || type > 3) {
						System.out.println("�߸� �����ϼ̽��ϴ�.");
						break;
					}
					insert(type);
					break;
					
				case 2:	//����
					System.out.print("������ ������ ��ġ>>");
					index = scanner.nextInt();
					if (!delete(index)) {
						System.out.println("������ �� �����ϴ�.");
					}
					break;
					
				case 3:	//��� ����
					Shape p = start;
					while(p != null) {
						p.draw();
						p = p.getNext();
					}
					break;
					
				case 4:	//������
					break;
					
				default:
					System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			}
		}
		System.out.println(name + "�� �����մϴ�.");
		

	}

	private boolean delete(int index) {
		
		Shape current = start, previous = start;
		
		if (start == null) //����Ʈ�� �� ���
			return false;
		
		for (int i=0; i<index; i++) {
			previous = current;
			current = current.getNext(); //���� ���ҷ� �̵�
			if (current == null) //�ε����� ����Ʈ ���� �������� ū ���
				return false;
		}
		
		if (start == end) { //����Ʈ�� ���Ұ� �Ѱ��ۿ� ���� ���
			start = end = null;
			return true;
		}
		
		if (current == start) {	//ù��° ���Ҹ� �����ϴ� ���
			start = start.getNext(); //���� ���Ұ� ù��° ���Ұ� ��
		}
		
		else if (current == end) {	//������ ���Ҹ� �����ϴ� ���
			end = previous; //���� ���Ұ� ������ ���Ұ� ��
			end.setNext(null);
		} else {
			previous.setNext(current.getNext()); //���� ���Ҹ� ����Ʈ���� ����
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
		
		if (start == null) { //����Ʈ�� ����� ��
			start = end = obj;
		} else {
			end.setNext(obj); //������ ���� �ڿ� ����
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