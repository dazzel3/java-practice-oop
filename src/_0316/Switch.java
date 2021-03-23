package _0316;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("연산>>");
		int n1 = scanner.nextInt();
		String str = scanner.next();
		char op = str.charAt(0); //문자열에서 한 문자만 가져오는 메서드
		int n2 = scanner.nextInt();
		float result = 0;
		switch(str) {
			case "+":
				result = n1 + n2;
				break;
			case "-":
				result = n1 - n2;
				break;
			case "/":
				result = (float) n1 / n2;
				break;
			case "*":
				result = n1 * n2;
				break;
			default:
				System.out.println("잘못 입력했습니다.");
				break;
		}
		
		System.out.println(n1+str+n2+"의 계산 결과는 "+result);
		
		scanner.close();
	}

}
