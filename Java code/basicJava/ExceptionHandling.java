package basicJava;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();

		try {
			int div = div(num1, num2);
			System.out.println("Divison value: " + div);
		} catch (ArithmeticException ex) {
			System.out.println("Inside catch block");
		} catch (InputMismatchException e) {
			System.out.println("Enter proper input");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("Inside finally block");
		}

		System.out.println("End of program");
	}

	public static int div(int a, int b) {
		return a / b;
	}
}
