package ExceptionHanding;

import java.util.ArrayList;

public class prodectInert {

	public static void main(String[] args) {
		ArrayList<prodect> a1= new ArrayList<>();
		prodect p = new prodect(1, "mobile", 10000);
		a1.add(p);
		a1.add(new prodect(2,"tablet",500000));
		a1.add(new prodect(3,"oven",55000));
		a1.add(new prodect(4,"AC",550000));
		
		System.out.println("Element in ArrayLisst :"+a1);
		
		}

}
