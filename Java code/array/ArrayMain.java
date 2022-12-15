package array;

import java.util.Scanner;

public class ArrayMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		getting character input
//		System.out.println("Enter a character: ");
//		char c= sc.next().charAt(0);
		
//		int arr[]= {10,20,30,40,50};

		System.out.println("Enter size of the array: ");
		int n= sc.nextInt();
		
		int arr[]= new int[n];
		
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the element: ");
			arr[i]= sc.nextInt();
		}
			
		printArray(arr);
		System.out.println("Sum of the elements: "+sumOfElementsInArray(arr));
	}
	
	public static void printArray(int arr[])
	{
//		for(int i=0;i<arr.length;i++)
//		{
//			System.out.print(arr[i]+" ");
//		}
		
		//for each loop
		for(int el : arr)
		{
			System.out.print(el+" ");
		}
		
		System.out.println();
	}
	
	public static int sumOfElementsInArray(int arr[])
	{
		int sum=0;
		for(int el: arr)
		{
			sum+=el;     //sum= sum+el;
		}
		return sum;
	}
}
