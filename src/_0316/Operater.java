package _0316;

import java.util.Scanner;

public class Operater {

	public static void main(String[] args) {
		
		//���ǹ�, ���׿�����
				Scanner scanner = new Scanner(System.in);
				
				int n = scanner.nextInt();
				int result = (n>5) ? n : 5;
				System.out.println(result);
				
				scanner.close();
	}

}
