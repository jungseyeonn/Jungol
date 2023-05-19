package q525;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		sc.close();
		
		if (a>b && a>c) {
			System.out.print(true + " ");
		} else {
			System.out.print(false + " ");
		}
		if (a==b || a==c || b==c) {
			System.out.print(false);
		}
	}
}
