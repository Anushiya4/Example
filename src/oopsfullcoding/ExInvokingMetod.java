package oopsfullcoding;

class Box1{
	int length;
	int breath;
	int height;
	int volume() {
	return length*breath*height;
	}
}
public class ExInvokingMetod {

	public static void main(String[] args) {
		
		Box1 BlackBox = new Box1();
		BlackBox.length=80;
		BlackBox.breath=40;
		BlackBox.height=20;
		System.out.println("volume of BlackBox is :"+BlackBox.volume());
		System.out.println();
		

	}

}
