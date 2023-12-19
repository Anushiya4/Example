package ExceptionHanding;

import java.util.Scanner;

class MyException extends Exception{
	public MyException(String msg) {
		super(msg);
	}
}
public class MyExceptionSource {
	  String checkName(String firstName , String secondName  ) throws MyException{
	
		if(firstName.isEmpty()){
			throw new MyException("first Name cann't be empty");
		}
		else if(secondName.isEmpty()){
			throw new MyException("secondName cann't be empty");
		}
		else if(firstName.isEmpty() || secondName.isEmpty()){
			throw new MyException("Names cann't be empty");
		}

		
		else {
			
			return firstName+ " "+secondName;
		}
		
	}

	public static void main(String[] args) {
		Scanner ss=new Scanner(System.in);
				System.out.println("enter 1st name");
		String firstName=ss.nextLine();
		System.out.println("enter 2nd name");
		String secondName=ss.nextLine();
		MyExceptionSource m = new MyExceptionSource();
		try {
			
			String fullName =m.checkName(firstName, secondName);
			
			
			System.out.println("fullName is :"+ fullName);
			
		}
		catch( MyException e) {
			System.out.println(e.getMessage());
		}
	}

}