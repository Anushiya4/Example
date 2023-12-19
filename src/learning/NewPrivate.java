package learning;

public class NewPrivate {
	private int a;
	private NewPrivate(int a) {
		this.a = a;
	}
		private void dispaly() {
			System.out.println(" value if a : "+ a);
		}

	public static void main(String[] args) {
		
		NewPrivate np = new NewPrivate(10);
		System.out.println("value of a : "+np.a);
	}

}
