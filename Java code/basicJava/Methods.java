package basicJava;

import java.util.Scanner;

public class Methods {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		int num1=sc.nextInt();
		int num2=sc.nextInt();

		int result= sum(num1,num2);
		System.out.println("Result: "+result);
		
//		System.out.println();
//		multiplicationTable(num1);
	}
	
	public static int sum(int a, int b)
	{
		int sum=a+b;
		return sum;
	}
	
	public static void multiplicationTable(int n)
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(n+"x"+i+" = "+(n*i));
		}
	}
}
