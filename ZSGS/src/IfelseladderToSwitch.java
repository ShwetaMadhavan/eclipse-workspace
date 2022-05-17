import java.io.*;
import java.util.*;
public class IfelseladderToSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		if(a==0 || a==1) {
			System.out.println("The no is binary");
		}
		else if(a==2) {
			System.out.println("The no is 2");
		}
		else if(a==3) {
			System.out.println("The no is 3");
		}
		else {
			System.out.println("The no is greater than 3");
		}
		
		switch(a) {
		case 0:
		
		case 1:
			System.out.println("The no is binary");
			break;
		case 2:
			System.out.println("The no is 2");
			break;
		case 3:
			System.out.println("The no is 3");
			break;
		default:
			System.out.println("The no is greater than 3");
		}

	}

}
