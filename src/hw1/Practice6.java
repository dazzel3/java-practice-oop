package hw1;

import java.util.Scanner;

public class Practice6 {

	public static void main(String[] args) {
		
		int [] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1};
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("�ݾ��� �Է��Ͻÿ�>>");
		int num = scanner.nextInt();
		
		 for(int i=0; i<unit.length; i++) {
	         System.out.println(unit[i]+"�� ¥�� : "+num/unit[i]+"��");
	         num = num - (num / unit[i]) * unit[i];
	      }
	      
	      scanner.close();
		
	}

}
