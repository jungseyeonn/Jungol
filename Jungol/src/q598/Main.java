package q598;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		while (true) {
			String str = sc.next();
			char c = str.charAt(0);
			
			//쌤답안
			if(Character.isAlphabetic(c)) {
				System.out.println(c);
			} else if(Character.isDigit(c)) {
				System.out.println((int)c);
			} else {
				break;
			}			
			
			//내답안
			if (c>=48 && c<=57) {
				System.out.printf("%d\n", (int)c);
			} else if (c>=65 && c<=90 || c>=97 && c<=122) {
				System.out.printf("%c\n", c);
			} else {		
				break;
			}
		}
		sc.close();
	}
}
