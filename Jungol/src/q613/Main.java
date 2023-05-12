package q613;

import java.util.Scanner;

class Field {
	String name;
	String school;
	int grade;
}

public class Main {
	public static void main(String[] args) {
		Field fd = new Field();
		Field fd2 = new Field();
		Scanner sc = new Scanner(System.in);
		
		fd.name = sc.next();
		fd.school = sc.next();
		fd.grade = sc.nextInt();
		
		System.out.println("Name : " + fd.name);
		System.out.println("School : " + fd.school);
		System.out.println("Grade : " + fd.grade);
		
		fd2.name = sc.next();
		fd2.school = sc.next();
		fd2.grade = sc.nextInt();
		sc.close();
		
		System.out.println("Name : " + fd2.name);
		System.out.println("School : " + fd2.school);
		System.out.println("Grade : " + fd2.grade);
	}
}
