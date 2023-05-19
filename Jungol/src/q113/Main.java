package q113;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		sc.close();
		
		System.out.println("width = " + (x+5));
		System.out.println("length = " + (y*2));
		System.out.println("area = " + (x+5)*(y*2));
	}
}
