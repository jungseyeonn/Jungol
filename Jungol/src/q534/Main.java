package q534;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char c = sc.next().charAt(0);
		sc.close();
		if (c=='A') {
			System.out.print("Excellent");
		} else if (c=='B') {
			System.out.print("Good");
		} else if (c=='C') {
			System.out.print("Usually");
		} else if (c=='D') {
			System.out.print("Effort");
		} else if (c=='F') {
			System.out.print("Failure");
		} else {
			System.out.print("error");
		}	
	}
}
