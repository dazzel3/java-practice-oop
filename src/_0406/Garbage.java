package _0406;

public class Garbage {

	public static void main(String[] args) {
		
		String s = null;
		for(int i = 0; i<10; i++) {
			s = new String("Hello"+i);
			System.out.println(s);
		}
		
		//가비지 9개 생김
	}

}
