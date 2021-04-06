package _0406;

class Rectangle {
	private int x, y, width, height; 
	
	public Rectangle(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	
	public void show() { // 사각형의 좌표와 넓이를 화면에 출력하는 메소드 완성
		System.out.println("("+x+","+y+")에서 크기가 "+width+"x"+height+"인 사각형");
	}
	
	public int square() { //사각형 넓이 리턴하는 메소드 완성
		int sq = width * height;
		return sq;
	}
	
	public boolean contains(Rectangle r) { // 매개변수로 받은 r이 현 사각형 안에 있으면 true 리턴, 그렇지 않으면 false 리턴
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
		System.out.println("s의 면적은 " + s.square());
		if(t.contains(r)) System.out.println("t는 r을 포함합니다.");
		if(t.contains(s)) System.out.println("t는 s를 포함합니다.");
	}

}
