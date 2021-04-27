package hw2;

interface Shape {

	final double PI = 3.14;
	void draw(); // ������ �׸��� �߻� �޼ҵ�
	double getArea(); // ������ ������ �����ϴ� �߻� �޼ҵ�
	
	default public void redraw() { // ����Ʈ �޼ҵ�
		System.out.print("--- �ٽ� �׸��ϴ�. ");
		draw();	
	}
}

class Circle implements Shape {
	
	   private int r;
	   
	   //������
	   public Circle(int r) {
	      this.r = r;
	   }
	   
	   //�������̽� ���� �׸��� �߻�޼ҵ� ����
	   public void draw() {
	      System.out.println("�������� "+r+"�� ���Դϴ�.");
	   }
	   
	   //�������̽� ���� ���� ���ϴ� �߻�޼ҵ� ����
	   public double getArea() {
	      return PI*r*r;
	   }
}

class Oval implements Shape {
	
	private int r1, r2;
	
	//������
	public Oval(int r1, int r2) {
		this.r1  = r1;
      	this.r2 = r2;
	}
	
	//�������̽� ���� �׸��� �߻�޼ҵ� ����
	public void draw() {
		System.out.println(r1+"x"+r2+"�� �����ϴ� Ÿ���Դϴ�.");
	}
	
	//�������̽� ���� ���� ���ϴ� �߻�޼ҵ� ����
	public double getArea() {
		return PI*r1*r2;
	}
}

class Rect implements Shape {
	
	private int x, y;
	
	//������
	public Rect(int x, int y) {
		this.x  = x;
		this.y = y;
	}
	
	//�������̽� ���� �׸��� �߻�޼ҵ� ����
	public void draw() {
		System.out.println(x+"x"+y+"ũ���� �簢�� �Դϴ�.");
	}
	
	//�������̽� ���� ���� ���ϴ� �߻�޼ҵ� ����
	public double getArea() {
		return x*y;
	}
}

public class Practice5_14 {

	public static void main(String[] args) {
		
		Shape [] list = new Shape[3]; // Shape�� ��ӹ��� Ŭ���� ��ü�� ���۷��� �迭

		list[0] = new Circle(10); // �������� 10�� �� ��ü
		list[1] = new Oval(20, 30); // 20x30 �簢���� �����ϴ� Ÿ��
		list[2] = new Rect(10, 40); // 10x40 ũ���� �簢��


		for(int i=0; i<list.length; i++)
			list[i].redraw();

		for(int i=0; i<list.length; i++)
			System.out.println("������ " + list[i].getArea());

	}

}
