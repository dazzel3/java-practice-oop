package _0323;

public class ForEach {

	public static void main(String[] args) {
		
		int n[] = {1,3,4,5,6};
		String names[] = {"���", "�ٳ���", "��"};
		
		int sum = 0;
		for (int i: n) {
			System.out.println(i);
			sum += i;
		}
		System.out.println("���� "+sum);
		
		for (String s: names) {
			System.out.println(s);
		}
	}

}
