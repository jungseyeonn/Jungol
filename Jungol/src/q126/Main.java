package q126;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int odd = 0;
		int even = 0;
		while (true) {
			int num = sc.nextInt();
			if (num == 0) {
				break;
			}
			if (num % 2 != 0) {
				odd += 1;
			} else {
				even += 1;
			}
		}
		System.out.println("odd : " + odd);
		System.out.println("even : " + even);
		sc.close();
	}
}
