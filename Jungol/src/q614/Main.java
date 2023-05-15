package q614;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		String school = "Jejuelementary";
		int grade = 6;
		Field fd = new Field (school, grade);
		System.out.print(fd.grade + " grade in "+fd.school+ " School\n");
		Scanner sc = new Scanner(System.in);
		
		school = sc.next();
		grade = sc.nextInt();
		sc.close();

		Field fd2 = new Field (school, grade);
		System.out.print(fd2.grade + " grade in "+fd2.school+ " School\n");		
	}
}
