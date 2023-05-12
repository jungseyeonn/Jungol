package q559;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		double[] scores = { 0, 85.6, 79.5, 83.1, 80.0, 78.2, 75.0 };
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		sc.close();
		
		System.out.printf("%.1f", scores[n1]+scores[n2]);
		
		// scores[n1-1]도 가능
	}
}
