package q555;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//q555
		
		char [] ref = new char [10];
		for (int i=0;i<ref.length;i++) {
			ref[i] = sc.next().charAt(0);
			System.out.printf("%c",ref[i]);
		}
		
		
		//Quiz. 총 다섯 개의 정수 값을 입력받아 출력하기
		
//		1. 배열 사용
		int [] ar = new int [5];
		for (int i=0;i<ar.length;i++) {
			ar[i] = sc.nextInt();
			System.out.print(ar[i]);
			if (i<4) {
				System.out.print(", ");
			}
		}
		
		//2. 배열 노사용
 		int a = sc.nextInt();
		int a1 = sc.nextInt();
		int a2 = sc.nextInt();
		int a3 = sc.nextInt();
		int a4 = sc.nextInt();
		
		System.out.printf("%d, %d, %d, %d, %d",a,a1,a2,a3,a4);
		sc.close();
	}
}
