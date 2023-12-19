package oopsfullcoding;
class Customer2{
	int phno,adharno;
	String name,email;

	public void fillform(String string, int i, String string2) {
		
		name = string;
		phno = i;
		email = string2;
		}

	public void fillform(String string, int i, int j, String string2) {
		name = string ;
		phno =i;
		adharno = j;
		email = string2;
			}
	
	}
public class ExPolyMorphism {
public static void main(String[] args) {
		
		Customer2 Anu = new Customer2();
		Anu.fillform("ANU",583878723,"FUJHF@Gmail.com");
		System.out.println("------Customer Anu Detials------");
		System.out.println("customer name is :"+Anu.name);
		System.out.println("customer phno is :"+Anu.phno);
		System.out.println("customer email is :"+Anu.email);
		Customer2 APPU =new Customer2();
		APPU.fillform("APPU",36767483,826757989,"FGREG@Gmail.com");
		System.out.println();
		
		System.out.println("-------Customer Appu Detials-------");
		System.out.println("customer name is :"+APPU.name);
		System.out.println("customer phno is :"+APPU.phno);
		System.out.println("customer adharno is :"+APPU.adharno);
		System.out.println("customer email is :"+APPU.email);
		

	}
}
