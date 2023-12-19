package oopsfullcoding;

public class ExMethodCalling {

		static int boxvolume(int length,int height,int breath) {
			int vol;
			vol= length*height*breath;
			return vol;
		}
	public static void main(String[] args) {
		
		System.out.println("Hello");
		int volume=boxvolume(50, 20, 10);
		System.out.println("Box volume is :" +volume);
//					or
		System.out.println(boxvolume(50, 20, 25));
	}

}
