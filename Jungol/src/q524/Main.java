package q524;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		sc.close();
		
		boolean a = (num1*num2) != 0 ? true : false;
		boolean b = (num1+num2) != 0 ? true : false;
		System.out.println(a + " " + b);
	}
}
