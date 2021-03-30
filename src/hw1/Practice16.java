package hw1;

import java.util.Scanner;

public class Practice16 {

	public static void main(String[] args) {
		
		System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
		
		Scanner scanner = new Scanner(System.in);
		String game[] = {"가위", "바위", "보"};
	    
		while(true) {
			System.out.print("가위 바위 보!>>");
			String user = scanner.nextLine();
			
			if(user.equals("그만")) {
				System.out.println("게임을 종료합니다...");
				break;
			}
			
			int i = (int)(Math.random()*3);
			String com = game[i];
			
			System.out.print("사용자 = "+user+", 컴퓨터 = "+com);
			
			if(user.equals("가위")) {
				if(com.equals("가위")) {
					System.out.println(", 비겼습니다.");
				} else if (com.equals("바위")) {
					System.out.println(", 컴퓨터가 이겼습니다.");
				} else if (com.equals("보")) {
					System.out.println(", 사용자가 이겼습니다.");
				}
			} else if(user.equals("바위")) {
				if(com.equals("가위")) {
					System.out.println(", 사용자가 이겼습니다.");
				} else if (com.equals("바위")) {
					System.out.println(", 비겼습니다.");
				} else if (com.equals("보")) {
					System.out.println(", 컴퓨터가 이겼습니다.");
				}
			} else if(user.equals("보")) {
				if(com.equals("가위")) {
					System.out.println(", 컴퓨터가 이겼습니다.");
				} else if (com.equals("바위")) {
					System.out.println(", 사용자가 이겼습니다.");
				} else if (com.equals("보")) {
					System.out.println(", 비겼습니다.");
				}
			} else {
				System.out.println(", 잘못 입력했습니다.");
			}
			
		}
		scanner.close();
		
		
	}

}
