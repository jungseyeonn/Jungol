package q9010;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		
		//swap
		int tmp = num1;
		num1 = num2;
		num2 = tmp;
		
		System.out.printf("%d %d",num1, num2);
		
		//import swap
		List<?> ar = Arrays.asList(4, 5);
		System.out.println(ar);
		Collections.swap(ar, 0, 1);
		System.out.println(ar);

		System.out.println(num1 + " " + num2);
	}
}
