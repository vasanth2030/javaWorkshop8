package basicJava;

import java.util.Scanner;

public class Loops {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=sc.nextInt();
		
		//counter variable
		int i=1;
		
		//while loop
		System.out.println("While loop: ");
		while(i<=n)
		{
			//print all odd numbers between 1 and n
			if(i%2!=0)
			{
				System.out.println(i);
			}
			
			//updation
			i++;
		}
		
		System.out.println();
		i=1;
		//do while loop
		System.out.println("Do while loop: ");
		do {
			if(i%2!=0)
			{
				System.out.println(i);
			}
			i++;
		}while(i<=n);
		
		System.out.println();
		//for loop
		System.out.println("For loop: ");
		for(int j=1;j<=n;j++)
		{
			if(j%2!=0)
			{
				System.out.println(j);
			}
		}
		
		System.out.println();
		System.out.println("End of program");
		
	}
}
