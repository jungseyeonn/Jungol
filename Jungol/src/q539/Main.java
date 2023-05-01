package q539;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		int cnt = 0;
		while (true) {
			int i = sc.nextInt();
			sum += i;
			cnt++;
			if (i>=100) {
				break;
			}
		}
		sc.close();
		
		System.out.println(sum);
		System.out.printf("%.1f",(double)sum / cnt);
	}
}
