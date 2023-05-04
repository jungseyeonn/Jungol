package q9015;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.print("두 수를 입력하시오. ");
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		sc.close();
		int sum = num1+num2;
		int muti = num1*num2;
		
		System.out.println(num1 + " + " + num2 + " = " + sum);
		System.out.println(num1 + " * " + num2 + " = " + muti);
	}
}
