package q562;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		int sum = 0;
		int avg = 0;

		//for문 사용
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 1; i < arr.length; i += 2) {
			sum += arr[i];
			avg += arr[i-1];
		}
//		for (int i = 0; i < arr.length; i += 2) {
//			avg += arr[i];
//		}
		System.out.println("sum : " + sum);
		System.out.printf("avg : %.1f", (double) avg / 5);

		//if문 사용
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			if (i % 2 == 1) {
				sum += arr[i];
			} else {
				avg += arr[i];
			}
		}
		System.out.println("sum : " + sum);
		System.out.printf("avg : %.1f", (double) avg / 5);
		sc.close();
	}
}
