package basicJava;

import java.util.Scanner;

public class BasicJavaClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name;
		int age;
		double height;
		
		System.out.println("Enter your name: ");
		name=sc.nextLine();
		System.out.println("Enter your age: ");
		age=sc.nextInt();
		System.out.println("Enter your height: ");
		height=sc.nextDouble();
		
		System.out.println("Hello World");  // sysout
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Height: "+height+"cm");
	}
}
