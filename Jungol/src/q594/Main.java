package q594;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		sc.close();
		
		//1.
		System.out.print(str);
		System.out.println(str);
		
		//2.
		System.out.print(str + str);
		
		//3. 10번 출력하기
		for (int i=0;i<10;i++) {
			System.out.print(str);
		}
	}
}
