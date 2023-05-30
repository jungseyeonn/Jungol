package q575;

public class Number {
	private int num1;
	private int num2;
	private int s = 1;
	
	public Number(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public int getNumber() {
		if(num1>=0 && num1<11) {
		}
		if(num2>=0 && num2<11) {
		}
		for(int i=0;i<num2;i++) {
			s *= num1;	
		}
		return s;
	}
	
	public void print() {
		System.out.println(s);
	}
}
