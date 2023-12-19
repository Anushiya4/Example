package learning;
class ExceptionMovie1 extends Exception{
	public ExceptionMovie1(String age) {
		super(age);
	}
}
public class MovieException {
	String invalidAge(int age) throws ExceptionMovie1{
		if(age<18) {
			throw new ExceptionMovie1("Age is smaller than 18");
//			throw new ExceptionMoive("Age is smaller than 18");
		}
	
	else 
	{
		return "valid";
	}
	}

	public static void main(String[] args) {
		MovieException m= new MovieException();
		try {
			System.out.println(m.invalidAge(17));
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
			
		
	}

}
