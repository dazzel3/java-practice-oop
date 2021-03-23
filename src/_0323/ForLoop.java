package _0323;

public class ForLoop {

	public static void main(String[] args) {
		
		
		int i;
		for (i=0; i<100; i++) {
			if (i%2 == 0)
				continue; //2의 배수 제외
			System.out.print(i+" ");
		}
		System.out.println();
		
		for (i=0; i<100; i+=2) {
			System.out.print(i+" ");
		}
	}

}
