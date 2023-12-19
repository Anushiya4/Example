package madurai;

import salem.GardenOwner1;

public class Son extends GardenOwner1{
	protected void jasminFarming() {
		System.out.println("give some flower to garden owner");
	}
	
		public static void main(String[] args) {
		
			Son sonobj = new Son();
			int p=sonobj.price;
			System.out.println(" fruit price is :"+ p);
			int s=sonobj.seeds;
			System.out.println("seeds :"+s);
			sonobj.organicFarming();
			sonobj.picfruits();
			sonobj.jasminFarming();
	}

}
