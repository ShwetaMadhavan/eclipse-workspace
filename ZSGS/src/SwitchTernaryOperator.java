import java.io.*;
import java.util.*;
public class SwitchTernaryOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		switch((1<=n && n<=10)?0:(n>10 && n<=100)?1:2) {
		
		case 0:
			System.out.println(n+" is in the range 1 to 10");
			break;
		case 1:
			System.out.println(n+" is in the range 11 to 100");
			break;
		case 2:
			System.out.println(n+" is greater than 100");
			break;
			
		
		}

	}

}
