package learning;

public class ExCnstructor {
	
	int adharno; 
	double dateOfBrith;
	String name , city;

	public ExCnstructor(String string, int i, double d, String string2) {
		name =string;
		adharno =i ;
		dateOfBrith = d ;
		city =  string2;
	}

	public ExCnstructor(String string, int i) {
	 name = string ;
	 adharno = i;
}
public static void main(String[] args) {
		ExCnstructor anu = new ExCnstructor( "agu", 65634, 11.09 , "@hjhgjkfg");
		anu.applyloan();
		ExCnstructor appu = new ExCnstructor("jeni",6743656);
		appu.applyloan1();
	}
	void applyloan() {
		System.out.println("customer name is :"+ name);
		System.out.println("customer name is :"+ adharno);
		System.out.println("customer name is :"+ dateOfBrith);
		System.out.println("customer name is :"+city);
		}
	void applyloan1() { 
		System.out.println("customer name is :"+ name);
		System.out.println("customer name is :"+ adharno);
	}
	
	

}
