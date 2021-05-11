package _0511;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

public class Rain {
	
	static public void print(Vector<Integer> v) {
		Iterator<Integer> it = v.iterator();
		
		int sum = 0;
		
		while(it.hasNext()) {
			int n = it.next();
			System.out.print(n+" ");
			sum += n;
		}
		System.out.println();
		System.out.println("���� ��� "+sum/v.size());
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Vector<Integer> v = new Vector<>();
		
		while(true) {
			System.out.print("������ �Է� (0 �Է½� ����)>> ");
			int n = scanner.nextInt();
			if (n == 0)
				break;
			
			v.add(n);
			print(v);
		}
		
		scanner.close();
	}

}
