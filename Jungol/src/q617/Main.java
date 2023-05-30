package q617;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		//class 2개로 객체배열 사용한 선생님 풀이
		Scanner sc = new Scanner(System.in);
		Person[] p = new Person[5];

		for (int i = 0; i < p.length; i++) {
			String name = sc.next();
			int height = sc.nextInt();
			p[i] = new Person(name, height);
		}
		sc.close();

		Person min = p[0];
		for (int i = 0; i < p.length; i++) {
			if (min.getHeight() > p[i].getHeight()) {
				min = p[i];
			}
		}
		min.print();

		//class 하나로 푼 세연풀이
		String[] name = new String[5];
		int[] height = new int[5];
		int min2 = Integer.MAX_VALUE;
		int cnt = 0;
		String n = null;
		for (int i = 0; i < name.length; i++) {
			name[i] = sc.next();
			height[i] = sc.nextInt();
			if (height[i] < min2) {
				min2 = height[i];
				cnt = i;
				n = name[cnt];
			}
		}
		sc.close();
		System.out.println(n + " " + min2);
	}
}
