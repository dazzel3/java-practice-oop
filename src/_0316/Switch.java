package _0316;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("����>>");
		int n1 = scanner.nextInt();
		String str = scanner.next();
		char op = str.charAt(0); //���ڿ����� �� ���ڸ� �������� �޼���
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
				System.out.println("�߸� �Է��߽��ϴ�.");
				break;
		}
		
		System.out.println(n1+str+n2+"�� ��� ����� "+result);
		
		scanner.close();
	}

}
