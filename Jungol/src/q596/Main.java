package q596;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nat = sc.next();
		int num = sc.nextInt();
		sc.close();

		//나은쌤 답안
		if (num < nat.length()) {
			for (int i = nat.length() - 1; i >= nat.length()-num; i--) {
				System.out.print(nat.charAt(i));
			}
		} else {
			for (int i = nat.length() - 1; i >= 0; i--) {
				System.out.print(nat.charAt(i));
			}
		}
		
		//선생님 답안
		for(int i = nat.length()-1;(num>0&&i>=0);i--,num--) {
			System.out.print(nat.charAt(i));
		}
	}
}
