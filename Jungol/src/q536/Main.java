package q536;

public class Main {
	public static void main(String[] args) {	
		//while문
		
		int num1 = 1;
		while (true) {
			System.out.printf("%d ",num1);
			
			if (num1 == 15)
				break;
			
			num1 = num1+1;
		}
		System.out.println();
		
		//do ~ while문
		
		int num2 = 1;
		do {
//			System.out.printf("%d ",num2);
//			num2 = num2+1;
			System.out.print(num2++ + " ");
		} while (num2 <= 15);
		System.out.println();
		
		//for문
		
		for(int i=1;i<=15;i++) {
			System.out.printf("%d ", i);
		}
		
	}	
}
