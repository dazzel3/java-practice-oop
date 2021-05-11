package _0511;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTest {

	public static void main(String[] args) {
		
		ArrayList<Character> al = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("6개의 학점을 빈 칸으로 분리 입력(A/B/C/D/F)>>");
		
		for(int i=0; i<6; i++) {
			char c = scanner.next().charAt(0); //문자열로 입력받은 후 charAt으로 한 문자처리
			if (c >= 'A' && c <= 'F') {
				al.add(c);
			}
		}
		
		double grade = 0.0;
		
		for(int i=0; i<al.size(); i++) {
			switch(al.get(i)) {
				case 'A':
					grade += 4.0;
					break;
				case 'B':
					grade += 3.0;
					break;
				case 'C':
					grade += 2.0;
					break;
				case 'D':
					grade += 1.0;
					break;
				case 'F':
					break;
			}
		}
		
		System.out.println(grade/al.size());
		
		scanner.close();
		
	}

}
