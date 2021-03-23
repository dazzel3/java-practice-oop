package _0316;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		//6번
		Scanner scanner = new Scanner(System.in);
		System.out.print("1~99 사이의 정수를 입력하시오>>");
		int num = scanner.nextInt();
		int count = 0;
		if ((num / 10) % 3 == 0) {
			count++;		
		} 
		if ((num % 10) == 3 || (num % 10) == 6 || (num % 10) == 9) {
			count++;		
		} 
		
		if (count == 2) {
			System.out.println("박수짝짝");
		} else if (count == 1) {
			System.out.println("박수짝");
		} else {
			System.out.println("pass");
		}
			
		
		scanner.close();
	}

}
