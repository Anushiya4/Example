package ExceptionHanding;

public class MovieException {
	String invalidAge(int age) throws ExceptionMovie{
		if( age<18) {
			throw new ExceptionMovie("age is smaller than 18");
		}
		else
		{
			return " valid";
		}
	}

	public static void main(String[] args) {
//		MovieException m = new MovieException();
//		try {
//			System.out.println(m.invalidAge(-22));
//		}
//		catch(Exception e) {
//			
//		}
	}
}
