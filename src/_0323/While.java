package _0323;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("exit�� �Է��ϸ� �����մϴ�.");
		while(true) {
			System.out.print(">>");
			String text = scanner.next();
			if (text.equals("exit")) {
				break;
			}
		}System.out.println("�����մϴ�.....");
		
		scanner.close();
	}

}
