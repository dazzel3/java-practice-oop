package hw1;

import java.util.Scanner;

public class Practice16 {

	public static void main(String[] args) {
		
		System.out.println("��ǻ�Ϳ� ���� ���� �� ������ �մϴ�.");
		
		Scanner scanner = new Scanner(System.in);
		String game[] = {"����", "����", "��"};
	    
		while(true) {
			System.out.print("���� ���� ��!>>");
			String user = scanner.nextLine();
			
			if(user.equals("�׸�")) {
				System.out.println("������ �����մϴ�...");
				break;
			}
			
			int i = (int)(Math.random()*3);
			String com = game[i];
			
			System.out.print("����� = "+user+", ��ǻ�� = "+com);
			
			if(user.equals("����")) {
				if(com.equals("����")) {
					System.out.println(", �����ϴ�.");
				} else if (com.equals("����")) {
					System.out.println(", ��ǻ�Ͱ� �̰���ϴ�.");
				} else if (com.equals("��")) {
					System.out.println(", ����ڰ� �̰���ϴ�.");
				}
			} else if(user.equals("����")) {
				if(com.equals("����")) {
					System.out.println(", ����ڰ� �̰���ϴ�.");
				} else if (com.equals("����")) {
					System.out.println(", �����ϴ�.");
				} else if (com.equals("��")) {
					System.out.println(", ��ǻ�Ͱ� �̰���ϴ�.");
				}
			} else if(user.equals("��")) {
				if(com.equals("����")) {
					System.out.println(", ��ǻ�Ͱ� �̰���ϴ�.");
				} else if (com.equals("����")) {
					System.out.println(", ����ڰ� �̰���ϴ�.");
				} else if (com.equals("��")) {
					System.out.println(", �����ϴ�.");
				}
			} else {
				System.out.println(", �߸� �Է��߽��ϴ�.");
			}
			
		}
		scanner.close();
		
		
	}

}
