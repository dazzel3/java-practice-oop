package hw2;

import java.util.Scanner;

public class Practice6_8 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("���ڿ��� �Է��ϼ���. �� ĭ�� �־ �ǰ� ���� �ѱ� ��� �˴ϴ�.");
		//����ڿ��� ���ڿ� �Է� �ޱ�
		String str = scanner.nextLine();
		
		//���ڿ� ���� ��ŭ �ݺ��� ����
		for(int i=0; i<str.length(); i++) {
			String s1 = str.substring(0, 1); //0���� 1 index�������� ���ڿ� �߶� ����
			String s2 = str.substring(1); //1 index���� ������ ���ڿ� �߶� ����
			str = s2 + s1;
			System.out.println(str);
		}

		scanner.close();
		
	}

}
