package _0330;

import java.util.Scanner;

public class ArrayTest {

	public static void main(String[] args) {
		
		int[] num = new int[5];
		
		Scanner scanner = new Scanner(System.in);
		for (int i=0; i<num.length; i++) {
			num[i] = scanner.nextInt();
		}
		
		int total = 0;
		for (int k: num) {
			total += k;
		}
		double ave = (float)total / num.length;
		int count = 0;
		for (int k: num) {
			if (k > ave) {
				count++;
			}
		}
		
		System.out.println("평균: "+ave+", 평균보다 큰 수의 개수: "+count);
		scanner.close();
	}

}
