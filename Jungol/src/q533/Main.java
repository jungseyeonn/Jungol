package q533;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char mf = sc.next().charAt(0);
		int age = sc.nextInt();
		if (mf=='M' && age>=18) {
			System.out.println("MAN");
		} else if (mf=='F' && age>=18) {
			System.out.println("WOMAN");
		} else if (mf=='M' && age<18) {
			System.out.println("BOY");
		} else {
			System.out.println("GIRL");
		}
		sc.close();
	}
}
