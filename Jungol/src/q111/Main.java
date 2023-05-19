package q111;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int kor = sc.nextInt();
		int eng = sc.nextInt();
		int mat = sc.nextInt();
		int com = sc.nextInt();
		sc.close();
		int sum = kor+eng+mat+com;
		
		System.out.println("sum : " + sum);
		System.out.println("avg : " + sum/4);
	}
}
