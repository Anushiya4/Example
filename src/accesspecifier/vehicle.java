package accesspecifier;

public class vehicle {
	protected int speed;
	protected vehicle(int s) {
		speed=s;
	}
	
	//method created
	protected void display() {
		System.out.println("vehicle class "+ speed);
	}
	
	

}
