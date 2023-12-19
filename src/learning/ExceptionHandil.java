package learning;

public class ExceptionHandil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a =10,b=0;
		int c=0;
		try {
			c=a/b;
		}
		catch(ArithmeticException e) {
			System.out.println("error occured");
		}
		System.out.println(c);
		int a1[] = null; 
       System.out.println("The length of the array arr is: " + a1.length);
        String st1=null;
        System.out.println("The length of the array arr is: " + st1.length());
        
        String str=" ";
        System.out.println("The length of the array arr is: " + str.length());
        
	}

}
class ExceptionMovie extends Exception{
	public ExceptionMovie(String msg) {
		super(msg);
	}
}
//public class MovieException {
//	String invalidAge(int age) throws ExceptionMovie {
//		if(age<18) {
//			throw new ExceptionMovie("Age is smaller than 18");
//		}
//		else {
//			return "Valid ";
//		}
//	}
//	public static void main(String[] args) {
//		MovieException m=new MovieException();
//		try {
//			System.out.println(m.invalidAge(-22));
//		} catch (ExceptionMovie e) {
//			// TODO Auto-generated catch block
//			System.out.println(e.getMessage());
//		}

//package module2;
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//
//public class MarksSheet {
//    public void displayMarks(int marks) {
//        try {
//            if (marks > 0 && marks < 100) {
//                System.out.println("marks is: " + marks);
//            } else {
//                throw new Exception("marks is less than or equal to 0");
//            }
//        } catch (Exception e) {
//            System.out.println("Exception caught: " + e);
//        } finally {
//            System.out.println("I'm always executed");
//        }
//    }
//
//    public static void main(String[] args) throws NumberFormatException, IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        System.out.println("Enter marks:");
//        int mark = Integer.parseInt(br.readLine());
//        MarksSheet m = new MarksSheet();
//        m.displayMarks(mark);
//    }
//}

//public class InfiniteSubstring {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter string S: ");
//        String S = scanner.nextLine();
//        System.out.print("Enter string A: ");
//        String A = scanner.nextLine();
//
//        if (isSubstringInfinite(S, A)) {
//            System.out.println("YES");
//        } else {
//            System.out.println("NO");
//        }
//    }
//
//    private static boolean isSubstringInfinite(String S, String A) {
//        String INF = "";
//        int len = S.length();
//
//        // Generate the infinite string INF
//        while (INF.length() < A.length()) {
//            INF += S;
//        }
//
//        // Check if A is a substring of INF
//        //INF-->hellopooja
//        //A-->hellpooojahello
//        if (INF.contains(A)) {
//            return true;
//        }
//
//        return false;
//    }
//}


/* class definitions:
class MyException: Define exception
class Source:
method definitons:
checkName(String firstName,String lastName)throw a user defined
exception if firstName and lastName is blank else return name
return type: String
visibility: public

* checkName(String firstName,String lastName): throw a user defined exception if
firstName and lastName is blank else return name*/

//
//if(!(student.name.matches(".*[A-Z].*"))){
//return "Block letters needed";
//}

//if(c.matches("\\d+")){

//public String registerStudent(Student student)
//{
//	if(!student.name.matches(".*[A-Z].*"))
//	{
//		return "Block letter needed";
//	}
//	if(student.score<0 || student.score>=100)
//	{
//		return "invalid Score";
//	}
//	return "Registered";
//}
//public String studentCard(String card)
//{
//	if(card.matches("\\d+")){
//		return "valid card";
//	}
//	else
//	{
//		return "invalid card";
//	}
//}
//
//}
//public class StudentReport {
//public static void main(String[] args) {
//Student s=new Student("S", 60);
//Classroom c=new Classroom();
//System.out.println(c.registerStudent(s));
//System.out.println(c.studentCard("abc"));

//
//ArrayList<String> al=new ArrayList<>();
//al.add("Rutika");
//al.add("Pragati");
//al.add("Lekha");
//al.add("Zeba");
//al.add("Angel");
//al.add(1, "Shweta")v     
//
//al.add("Raj");
//
//System.out.println("My arraylist:"+al);
//al.remove(3);
//System.out.println("My arraylist:"+al);
//System.out.println("First Position : "+al.get(1));
//al.set(2, "Neha");
//System.out.println("My arraylist:"+al.size());
//System.out.println("My arraylist:"+al);