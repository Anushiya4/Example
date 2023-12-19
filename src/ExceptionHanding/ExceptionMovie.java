package ExceptionHanding;

public class ExceptionMovie extends Exception {

	public ExceptionMovie(String string) {
		String age;
		
	}

	public static void main(String[] args) {
		MovieException m = new MovieException();
		try {
			System.out.println(m.invalidAge(19));
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
