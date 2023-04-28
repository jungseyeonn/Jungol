package q9008;

public class Main {
	public static void main(String[] args) {
		String s1 = " subject score";
		String s2 = "==============";
		String s3 = "korean";
		String s4 = "english";
		String s5 = "computer";
		
		int i1 = 90;
		int i2 = 100;
		int i3 = 80;
		
		System.out.printf("%13s\n",s1);
		System.out.println(s2);
		System.out.printf("%8s   %3d\n",s3,i1);
		System.out.printf("%8s   %3d\n",s4,i2);
		System.out.printf("%8s   %3d\n",s5,i3);
		
		
		//선생님 답안
		System.out.println(" subject score");
		System.out.println("===============");
		System.out.printf("%8s   %3d\n", "korean", 90);
		System.out.printf("%8s   %3d\n", "english", 100);
		System.out.printf("%8s   %3d\n", "computer", 80);	
	}
}
