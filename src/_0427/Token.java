package _0427;

import java.util.StringTokenizer;

public class Token {

	public static void main(String[] args) {
		
		StringTokenizer st = new StringTokenizer("a=3,b=5,c=6", ",=");
		
		int sum = 0;
		int i = 1;
		while (st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token);
			
			if (i % 2 == 0) {
				sum += Integer.parseInt(token);
			}
			i++;
		}
		System.out.println("гую╨ "+sum);
	}

}
