package q595;

public class Main {
	public static void main(String[] args) {
		String str = new String("Hong Gil Dong");
		//1.
		for (int i=3;i<7;i++) {
			System.out.print(str.charAt(i));
		}
//		System.out.print(str.charAt(3));
//		System.out.print(str.charAt(4));
//		System.out.print(str.charAt(5));
//		System.out.print(str.charAt(6));
		
		//2.
		System.out.println(str.substring(3,7));
	}
}
