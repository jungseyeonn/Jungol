package q522;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		sc.close();
		
		if (n1==n2) {
			System.out.println(1);
		} else {
			System.out.println(0);
		} 
		if (n1!=n2) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
		
		//삼항연산자
		int thr = (n1==n2) ? 1 : 0;
		System.out.println(thr);
		thr = (n1!=n2) ? 1 : 0;
		System.out.println(thr);
		
		//태호님 답안
		boolean bS = n1 == n2;
		System.out.println(bS);
		System.out.println(!bS);
		
	}
}
