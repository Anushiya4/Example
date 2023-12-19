package ExceptionHanding;

import java.util.Scanner;

public class ExceptionHandlingDemo {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("enter 2 values");
		int a = s.nextInt();
		int b = s.nextInt();
		
		try {
			int c = a/b;
			System.out.println(c);
		}
		catch(ArithmeticException ae) {
			System.out.println("change the value");
		}
		finally {
			System.out.println(" i m finally");
		}

	}

}
