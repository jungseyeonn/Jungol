package q1291;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s = 0, e = 0;
		do {
			s = sc.nextInt();
			e = sc.nextInt();

			if ((2 <= s && s <= 9) && (2 <= e && e <= 9)) {
				break;
			}
			System.out.println("INPUT ERROR!");
		} while (true);
		sc.close();
		if (s < e) {
			for (int j = 1; j <= 9; j++) {
				for (int i = s; i <= e; i++) {
					System.out.print(i + " * " + j + " = ");
					System.out.printf("%2d   ",(i * j));
				}
				System.out.println();
			}
		} else {
			for (int j = 1; j <= 9; j++) {
				for (int i = s; i >= e; i--) {
					System.out.print(i + " * " + j + " = ");
					System.out.printf("%2d   ",(i*j));
				}
				System.out.println();
			}
		}
	}
}
