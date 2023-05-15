package q523;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		
		if (a>b) {
			System.out.printf("%d > %d --- 1\n", a,b);
		} else {
			System.out.printf("%d > %d --- 0\n", a,b);
		}
		if (a<b) {
			System.out.printf("%d < %d --- 1\n", a,b);
		} else {
			System.out.printf("%d < %d --- 0\n", a,b);
		}
		if (a>=b) {
			System.out.printf("%d >= %d --- 1\n", a,b);
		} else {
			System.out.printf("%d >= %d --- 0\n", a,b);
		}
		if (a<=b) {
			System.out.printf("%d <= %d --- 1\n", a,b);
		} else {
			System.out.printf("%d <= %d --- 0\n", a,b);
		}
		
		//삼항연산자
		System.out.print(a + " > " + b + " --- ");
		boolean bl = (a>b) ? true : false;
		System.out.println(bl);
	}
}
