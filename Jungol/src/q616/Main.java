package q616;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		int x3 = sc.nextInt();
		int y3 = sc.nextInt();
		sc.close();
		Triangle tri = new Triangle((double)(x1+x2+x3)/3, (double)(y1+y2+y3)/3);
		System.out.printf("(%.1f, %.1f)",tri.x,tri.y);
	}
}
