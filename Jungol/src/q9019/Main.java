package q9019;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("5개의 수를 입력하시오. ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		int n4 = sc.nextInt();
		int n5 = sc.nextInt();
		sc.close();
		System.out.printf("%d %d %d %d %d",(n1+3),(n2-3),(n3*3),(n4/3),(n5%3));
		
	}
}
