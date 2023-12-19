package oopsfullcoding;
class Customer3{

		int id ;
		double dob;
		String name , city;
		
	public Customer3(String string, int i, double d, String string2) {
		name = string;
		id = i;
		dob = d;
		city = string2;
	}
//	public Customer3(int i) {
//		id = i;
//		
//	}
	public Customer3(int i, String string) {
		id = i;
		city = string;
	}
	public void applyLoan() {
		System.out.println("-----Agu------");
		System.out.println("cutomer name is :"+name);
		System.out.println("cutomer id is :"+id);
		System.out.println("cutomer dob is :"+dob);
		System.out.println("cutomer city is :"+city);
		System.out.println();
		
	}
	public void applyLoan1() {
		System.out.println("--------Aro------");
		System.out.println("cutomer id is :"+id);
		System.out.println("cutomer city is :"+city);
		
	}
	
	}

public class ExConstractor {

	public static void main(String[] args) {
		Customer3 Agu = new Customer3("Agu",76767467,11.1991, "SRM");
		Customer3 Aro = new Customer3(57573657,"ADM");
		Agu.applyLoan();
		Aro.applyLoan1();
		

	}

}
