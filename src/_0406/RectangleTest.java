package _0406;

class Rectangle {
	private int x, y, width, height; 
	
	public Rectangle(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	
	public void show() { // �簢���� ��ǥ�� ���̸� ȭ�鿡 ����ϴ� �޼ҵ� �ϼ�
		System.out.println("("+x+","+y+")���� ũ�Ⱑ "+width+"x"+height+"�� �簢��");
	}
	
	public int square() { //�簢�� ���� �����ϴ� �޼ҵ� �ϼ�
		int sq = width * height;
		return sq;
	}
	
	public boolean contains(Rectangle r) { // �Ű������� ���� r�� �� �簢�� �ȿ� ������ true ����, �׷��� ������ false ����
		if(this.x < r.x && this.y < r.y && this.x+this.width > r.x+r.width && this.y+this.height > r.y+r.height) {
			return true;
		} else {
			return false;
		}
	}
}

public class RectangleTest {

	public static void main(String[] args) {
		Rectangle r = new Rectangle(2, 2, 8, 7);
		Rectangle s = new Rectangle(5, 5, 6, 6);
		Rectangle t = new Rectangle(1, 1, 10, 10);

		r.show();
		System.out.println("s�� ������ " + s.square());
		if(t.contains(r)) System.out.println("t�� r�� �����մϴ�.");
		if(t.contains(s)) System.out.println("t�� s�� �����մϴ�.");
	}

}
