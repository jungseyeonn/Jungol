package q9108;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			String str = sc.next();
			char c = str.charAt(0);
			System.out.println(str + " -> " + (int)c);
			if (c==48) {
				break;
			}
		}
		sc.close();
	}
}
