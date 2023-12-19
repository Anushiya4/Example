package ExceptionHanding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MarkSheet {
	public void displayMark(int mark) {
		try {
			if(mark>50 && mark<100) {
				System.out.println(" mark is :"+ mark);
			}
			else {
				System.out.println(" mark is less than or equalt zero");
			}
		}
			catch(Exception e) {
				System.out.println(" Exception catch :"+ e);
			}
			finally {
				System.out.println(" i m always enter in this class");
			}
		}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(" enter mark");
		int mark = Integer.parseInt(br.readLine());
		MarkSheet m = new MarkSheet();
		m.displayMark(mark);
	}

}
