package hw2;

import java.util.Scanner;

public class Practice6_8 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("문자열을 입력하세요. 빈 칸이 있어도 되고 영어 한글 모두 됩니다.");
		//사용자에게 문자열 입력 받기
		String str = scanner.nextLine();
		
		//문자열 길이 만큼 반복문 실행
		for(int i=0; i<str.length(); i++) {
			String s1 = str.substring(0, 1); //0부터 1 index전까지의 문자열 잘라서 저장
			String s2 = str.substring(1); //1 index부터 끝까지 문자열 잘라서 저장
			str = s2 + s1;
			System.out.println(str);
		}

		scanner.close();
		
	}

}
