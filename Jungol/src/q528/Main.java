package q528;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// import 선언하는 단축키 ctrl+shift+o
		
		int num = sc.nextInt();
		sc.close();
		
		if(num<0) {
			System.out.println(num);
			if(num<0) {
				System.out.println("minus");
			}
		} else {
			System.out.println(num);
		}
// └> 리팩토링 하면 "System.out.println(num);" 동일문을 if 밖으로 빼면 됨.
		
		//쌤 답안
//		int (num<0) {
//			System.out.println("minus");
//		}
		
	}
}
