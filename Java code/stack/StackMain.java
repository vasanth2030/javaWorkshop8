package stack;

import java.util.Scanner;

public class StackMain {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the stack: ");
		int n=sc.nextInt();
		Stack st=new Stack(n);
		
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		
		st.printStack();
		
		st.pop();
		st.printStack();
		
		st.pop();
		st.printStack();
		
		System.out.println(st.peek());
	}
}
