package ExceptionHanding;

public class prodect {
	int pid;
	String pname;
	int pprice;
	public prodect(int pid, String pname, int pprice) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.pprice = pprice;
	}
	@Override
	public String toString() {
		return "prodect [pid=" + pid + ", pname=" + pname + ", pprice=" + pprice + "]";
	}
	
	
}
