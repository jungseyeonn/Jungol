package q537;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inp = sc.nextInt();
		sc.close();
		
		//while
		int sum = 0;
		int i = 0;
		while (i<=inp) {
			sum += i++;
		}
		System.out.println(sum);
		
		//for
		int sum2 = 0;
		for (int i2=1;i2<=inp;i2++) {
			sum2 += i2;
		}
		System.out.println(sum2);
		
		//do while
		int sum3 = 0;
		int i3 = 0;
		do {
			sum3 += i3++;
		} while (i3 <= inp);
		System.out.println(sum3);
	}
}
