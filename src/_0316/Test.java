package _0316;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		//6��
		Scanner scanner = new Scanner(System.in);
		System.out.print("1~99 ������ ������ �Է��Ͻÿ�>>");
		int num = scanner.nextInt();
		int count = 0;
		if ((num / 10) % 3 == 0) {
			count++;		
		} 
		if ((num % 10) == 3 || (num % 10) == 6 || (num % 10) == 9) {
			count++;		
		} 
		
		if (count == 2) {
			System.out.println("�ڼ�¦¦");
		} else if (count == 1) {
			System.out.println("�ڼ�¦");
		} else {
			System.out.println("pass");
		}
			
		
		scanner.close();
	}

}
