package basicJava;

import java.util.Scanner;

public class ConditionalStatements {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number between 1-7: ");
		int num=sc.nextInt();
		
//		int num=sc.nextInt();
//		if condition
//		if(num<0)
//		{
//			//if block
//			System.out.println("Warning! You have entered a negative integer");
//		}
		
//		if...else condition
//		if(num%2==0) {
//			System.out.println("Even number");
//		}
//		else 
//		{
//			System.out.println("Odd number");
//		}
		
//		if...else if...else
//		int marks=sc.nextInt();
//		if(marks>=80)
//		{
//			System.out.println("Grade A");
//		}
//		else if(marks>=60 && marks<80)
//		{
//			System.out.println("Grade B");
//		}
//		else if(marks>=40)
//		{
//			System.out.println("Grade C");
//		}
//		else {
//			System.out.println("Fail");
//		}
		
//		switch case
		switch(num)
		{
			case 1:
				System.out.println("Monday");
				break;
			case 2:
				System.out.println("Tuesday");
				break;
			case 3:
				System.out.println("Wednesday");
				break;
			case 4:
				System.out.println("Thursday");
				break;
			case 5:
				System.out.println("Friday");
				break;
			case 6:
				System.out.println("Saturday");
				break;
			case 7:
				System.out.println("Sunday");
				break;
			default:
				System.out.println("Enter a valid input");
				break;
		}

		System.out.println("Rest of the code.");
	}
}
