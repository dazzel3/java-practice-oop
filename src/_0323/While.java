package _0323;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("exit을 입력하면 종료합니다.");
		while(true) {
			System.out.print(">>");
			String text = scanner.next();
			if (text.equals("exit")) {
				break;
			}
		}System.out.println("종료합니다.....");
		
		scanner.close();
	}

}
