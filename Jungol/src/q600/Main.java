package q600;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		int cnt = 1;
		for(int i=0;i<str.length();i++) {
			char c = str.charAt(i);
			if(c==' ') {
				cnt++;
			}
		}
		System.out.println(cnt);
		
		//StringTokenizer
		StringTokenizer st = new StringTokenizer(str);
		int n = st.countTokens();
		System.out.println(n);
		
		while(st.hasMoreElements()) {
			String token = st.nextToken();
			System.out.println(token);
		}
	}
}
