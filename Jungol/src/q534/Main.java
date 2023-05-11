package q534;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char c = sc.next().charAt(0);

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
		
		System.out.println();
		
		switch(c) {
		case 65 : System.out.print("Excellent");
		break;
		case 66 : System.out.print("Good");
		break;
		case 67 : System.out.print("Usually");
		break;
		case 68 : System.out.print("Effort");
		break;
		case 70 : System.out.print("Failure");
		break;
		default : System.out.print("error");
		}
		
		sc.close();
	}
}
