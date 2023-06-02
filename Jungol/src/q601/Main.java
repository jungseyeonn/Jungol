package q601;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		sc.close();

		// 쌤풀이
		String str2 = str + str;
		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.println(str2.substring(i, i + str.length()));
		}

		// 유미님풀이
		for (int i = str.length() - 1; i >= 0; i--) {
			for (int j = i; j < str.length(); j++) {
				System.out.print(str.charAt(j));
			}
			for (int j = 0; j <= i - 1; j++) {
				System.out.print(str.charAt(j));
			}
			System.out.println();
//	      }
		}
	}
}
