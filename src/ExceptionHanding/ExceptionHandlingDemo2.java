package ExceptionHanding;

import java.util.Scanner;

public class ExceptionHandlingDemo2 {

	public static void main(String[] args) {
		Scanner ss = new Scanner(System.in);
		System.out.println(" enter a value ");
		int a = ss.nextInt();
		
		try {
			int b = 10/a;
			System.out.println("b value is "+b);
		try {
		
		if(a==1) {
			a=a/(a-1);
		}
		
	}
	catch(ArrayIndexOutOfBoundsException ae) {
		System.out.println("array index out of bounds exception occurence ");
	}
		}
		catch(ArithmeticException ac) {
			System.out.println("this exception due to divied by zero");
		}

}
}