package _0406;

import java.util.Scanner;

class Grade {
	public int math;
	public int science;
	public int english;
	
	public Grade(int math, int science, int english) {
		this.math = math;
		this.science = science;
		this.english = english;
	}
	
	public int average() {
		int ave = (math+science+english)/3;
		return ave;
	}
}

public class GradeTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("����, ����, ���� ������ 3���� ���� �Է�>>");
		int math = scanner.nextInt();
		int science = scanner.nextInt();
		int english = scanner.nextInt();
		Grade me = new Grade(math, science, english);
		System.out.println("����� " + me.average()); // average()�� ����� ����Ͽ� ����
		scanner.close();
	}

}
