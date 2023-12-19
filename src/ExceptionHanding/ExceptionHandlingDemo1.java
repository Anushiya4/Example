package ExceptionHanding;

import java.util.Scanner;

public class ExceptionHandlingDemo1 {
	
	public static void main(String args[]) {
		
		Scanner ss = new Scanner(System.in);
		System.out.println(" enter value one");
		int a = ss.nextInt();
		System.out.println("enter valur two");
		int b = ss .nextInt();
		
		ExceptionHandlingDemo1 ed=new ExceptionHandlingDemo1();
		ed.divided(a, b);
		
}
		private float divided(int a,int b) {
			try {
				int c = a/b;
				System.out.println("c value is :"+c);
				return c ;
			}
			
			finally {
				System.out.println(" finally key word is dominates return");
			}
		}

	}


