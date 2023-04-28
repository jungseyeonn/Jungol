package q529;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int height = sc.nextInt();
		int weight = sc.nextInt();
		int b = (weight + 100 - height);
		sc.close();
		
		System.out.println(b);
		if(b>0) {
			System.out.println("Obesity");
		}
	}
}
