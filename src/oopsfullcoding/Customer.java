package oopsfullcoding;

public class Customer {
	
	public void enquire() {
		System.out.println("Ask Enquire : is this posible to get loan");
	
	}

	public static void main(String[] args) {
		
		Bank b = new Bank();
		b.deposit();
		b.withdraw();
		
		Customer c = new Customer();
		c.enquire();
	}
	

}
