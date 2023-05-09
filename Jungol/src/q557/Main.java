package q557;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String [] word = new String [10];
		for (int i=0;i<10;i++) {
			word[i] = sc.next();
		}
		sc.close();
		System.out.print(word [0] + " ");
		System.out.print(word [3] + " ");
		System.out.print(word [6]);
	}
}
