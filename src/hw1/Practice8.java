package hw1;

import java.util.Scanner;

public class Practice8 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수 몇개?");
		int num = scanner.nextInt();
		int[] array = new int[num];
		
		 for(int i=0; i<array.length; i++) {
	         int temp = (int)(Math.random()*100+1);
	         int check = 0;
	         for(int j=0; j<array.length; j++) {
	        	 if(temp == array[j]) {
	        		 check=1;
	        		 break;
	        	 }
	         }
	         if(check == 1) {
	        	 i--;
	        	 continue;
	         }
	         array[i] = temp;
	      }
	      
	      for(int i=0; i<array.length; i++) {
	         if(i%10 == 0 && i != 0) {
	        	 System.out.println("");
	         }
	         System.out.print(array[i] + " ");
	      }
	      
	      scanner.close();
	}

}
