package newaccesser;

public class GardenOwner {
	int fruitPrice = 10;
	 public static void main(String[] args) {
		
		 

	}

}
//package accessspecifier;
//
//public class PublicClass {
//	public String name;
//	public PublicClass(String nm) {
//		name=nm;	
//	}
//	public String printName() {
//		return name;
//	}
//}
//package accessspecifier1;
//
//import accessspecifier.PublicClass;
//class PublicSubClass extends PublicClass{
//	String deg;
//	public PublicSubClass(String nm,String deg) {
//		super(nm);
//		this.deg=deg;
//	}
//	void display() {
//		System.out.println("Name: "+printName());
//		System.out.println("My Degree : "+this.deg);
//	}
//	
//}
//public class PublicEx {
//
//	public static void main(String[] args) {
//		PublicClass p=new PublicClass("Pooja");
//		System.out.println("My name : "+p.printName());
//		System.out.println("***********Public usage in sub class***********");
//		PublicSubClass ps=new PublicSubClass("Pretha", "BTECH");
//		ps.display();
//		
	
//
//	}
//
//}

//class Car1 {
//	protected int speed;;
//	protected Car1(int speed) {
//		this.speed=speed;
//	}
//    // protected method
//    protected void display() {
//        System.out.println("Car class"+this.speed);
//    }
//}
//class BMW extends Car1{
//	protected BMW(int speed) {
//		super(speed);
//		// TODO Auto-generated constructor stub
//	}
//	void displayBMW(){
//		display();
//		System.out.println("BMW class");		
//	}	
//}
//public class PtrotectedDemo  {	
//	public static void main(String[] args) {
//		Car1 c=new Car1(100);
//		c.display();
//		BMW b=new BMW(300);
//		b.displayBMW();





//package accessspecifier;
//
//public class Vehicle1 {
//	protected int speed;;
//	protected Vehicle1(int s) {
//		speed=s;
//	}
//	
//    // protected method
//    protected void display() {
//        System.out.println("Vehicle class"+speed);
//    }
//}


//import accessspecifier.Vehicle1;
//
//
//class Bike extends Vehicle1{
//	String nm;
//	protected Bike(int s,String name) {
//		super(s);
//		nm=name;
//		// TODO Auto-generated constructor stub
//	}
//	void dis() {
//		display();
//		System.out.println( " name: "+nm);
//	}
//	
//}
//public class ProtectedEx {
//
//	public static void main(String[] args) {
//		Bike b=new Bike(100,"Honda");
//		b.dis();
////		Vehicle1 v=new Vehicle1(100);//we can not access protected constructor in another package non sub class
//
//	}
//
//}
