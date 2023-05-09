package q558;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] ar = new int[100];
		for (int i = 0; i < ar.length; i++) {
			ar[i] = sc.nextInt();
			if (ar[i] == 0) {
				for (int j = i-1; j >= 0; j--) {
					System.out.print(ar[j] + " ");
				} break;
			}
		}
		sc.close();
	}
}
