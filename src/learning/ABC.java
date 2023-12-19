package learning;

interface ABC {
	default void dispayABC() {
		System.out.println(" display value is ABC");
	}
interface XYZ{
	static void dispayXYZ() {
		System.out.println(" display value is XYZ");	
	}
}
interface PQR extends ABC,XYZ{
	static void dispayPQR() {
		System.out.println(" display value is ABC & XYZ ");
		
	}
}
  class child implements ABC,XYZ{
	 void dispay() {
		  System.out.println(" DISPLAY CHILD");
		  }
 }
	public static void main(String[] args) {
		 	child c = new child();
		 	c.dispay();
		 	c.dispayABC();
		 	XYZ.dispayXYZ();
		 	PQR.dispayPQR();
		 	

	}

}
