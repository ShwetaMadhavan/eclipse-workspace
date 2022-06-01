import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Buffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s=br.readLine();
		Double number=Double.parseDouble(s);
		System.out.println(number);
		}
		catch(Exception e) {
			System.err.println("Error"+e.getMessage());
		}
		

	}

}
