package q518;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		int c = sc.nextInt();
		
//		System.out.printf("sum : %d\n", a+b+c);
//		System.out.printf("avg : %d", (a+b+c)/3);
		
		
		//배열사용
		int [] num = new int[3];
		for (int i=0;i<num.length;i++) {
			num[i] = sc.nextInt();
		}
		sc.close();

		int sum = 0;
		for (int i=0;i<num.length;i++) {
			sum += num[i];
		}
		
		System.out.println("sum : " + sum);
		System.out.println("avg : " + (sum/num.length));		
	}
}
