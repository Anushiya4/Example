package learning;

 public class customer1 {
	
	int phoneNo,adharno;
	 String name;
	String email;
	
 void fillform(String string, int i) {
		
		name = string;
		adharno = i;
		
	}
 void fillform(String string, int i, int j, String string2) {
	
	this.name = string;
	phoneNo = i; 
	adharno = j;
	email = string2;
}
	public static void main(String[] args) {
		
		customer1 anu = new customer1();
		anu.fillform("anu ",65476,858588,"@hjhgj");
		System.out.println(" customer name is : "+anu.name);
		System.out.println(" customer email :"+ anu.email);
		System.out.println(" customer email :"+ anu.phoneNo);
		System.out.println(" customer email :"+ anu.adharno);
		System.out.println();
		customer1 appu = new customer1();
		appu.fillform("appu",6767363);
		
		System.out.println(" customer email :"+appu.name);
		System.out.println(" customer email :"+appu.phoneNo);
}	
}