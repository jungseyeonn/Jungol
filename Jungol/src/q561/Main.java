package q561;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		int min = 10000;
		int max = 1;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			if (arr[i] <= min && arr[i]>=100) {
				min = arr[i];
			}
			if (arr[i] > max && arr[i]<100) {
				max = arr[i];
			}
		}		
		if (min == 10000) {
			min = 100;
		}
		if (max == 1) {
			max = 100;
		}
		System.out.print(max+" "+min);
		sc.close();
	}
}
