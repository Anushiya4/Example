package learning;

interface  A {
	
	 static void msg() {
		 System.out.println(" this msg is called : A");
		 	 }
	 default void msgName() {
		 System.out.println("aaaa bbbbb ccccc");
	 }
	interface B{
		static void msg() {
			
		}
	}
	public class C implements A,B{
	 void display() {
		 	 System.out.println(" this msg is called : A B");
	 }
			}
	public static void main(String[] args) {

		C cc=new C();
		cc.display();
		A.msg();
		cc.msgName();
	}

}
