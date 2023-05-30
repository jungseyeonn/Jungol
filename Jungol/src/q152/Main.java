package q152;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int num [] = new int [10];
		Scanner sc = new Scanner(System.in);
		int odd = 0, even = 0;
		for(int i=0;i<num.length;i++) {
			num[i] = sc.nextInt();
			if(i%2==0) {
				odd += num[i];
			} else {
				even += num[i];
			}
		}
		sc.close();
		System.out.println("odd : " + odd);
		System.out.println("even : " + even);
	}
}
