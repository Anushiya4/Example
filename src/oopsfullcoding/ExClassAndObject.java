package oopsfullcoding;

class Box{
	int length;
	int breath;
	int height;
}
public class ExClassAndObject {
	
	public static void main(String[] args) {
		
		Box BlackBox = new Box();
		System.out.println("BlackBox");
		BlackBox.length=50;
		BlackBox.breath=40;
		BlackBox.height=20;
		System.out.println("length is :"+BlackBox.length);
		System.out.println("breath is :"+BlackBox.breath);
		System.out.println("heigt is :"+BlackBox.height);
		
		System.out.println();
		
		System.out.println("WoodBox");
		Box WoodBox = new Box();
		
		WoodBox.length=65;
		WoodBox.breath=30;
		WoodBox.height=20;
		
		System.out.println("length is :"+WoodBox.length);
		System.out.println("breath is :"+WoodBox.breath);
		System.out.println("heigt is :"+WoodBox.height);
		
		
		 
		

	}

}
