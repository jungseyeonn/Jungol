package q150;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String [] str = new String [10];
		for(int i=0; i<str.length;i++) {
			str[i] = sc.next();
		}
		for(int i=str.length-1;i>=0;i--) {
			System.out.print(str[i]+ " ");
		}
		sc.close();
	}
}
