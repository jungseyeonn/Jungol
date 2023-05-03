package q110;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.print("yard? ");
		
		Scanner sc = new Scanner(System.in);
		
		double c = 91.44;
		double y = sc.nextDouble();
		sc.close();
		System.out.printf("%.1fyard = %.1fcm", y,c*y);
	}
}
