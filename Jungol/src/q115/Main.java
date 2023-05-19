package q115;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ms_h = sc.nextInt();
		int ms_w = sc.nextInt();
		int ky_h = sc.nextInt();
		int ky_w = sc.nextInt();
		sc.close();
		
		if(ms_h>ky_h && ms_w>ky_w) {
			System.out.print(true);
		} else {
			System.out.print(false);
		}
	}
}
