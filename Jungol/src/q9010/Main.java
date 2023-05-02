package q9010;

public class Main {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		
		int tmp = num1;
		num1 = num2;
		num2 = tmp;
		
		System.out.printf("%d %d",num1, num2);
	}
}
