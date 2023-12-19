package accesspesifier1;

import accesspecifier.vehicle;

class Bike extends vehicle{
	String num;
	protected Bike(int s ,String name) {
		super(s);
		num=name;
		
	}
	
	void dis() {
		display();
			System.out.println(" name : "+ num);
		
	}
}

public class ExProtected {

	public static void main(String[] args) {
		
		Bike b = new Bike(100,"honda");
		b.dis();



	}

}
