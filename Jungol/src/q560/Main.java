package q560;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[10];
		int min = 1000;
		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
			if (num[i]<min) {
				min=num[i];
			}
		}
		System.out.println(min);
		sc.close();
	}
}
