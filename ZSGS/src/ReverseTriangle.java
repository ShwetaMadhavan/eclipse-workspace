import java.util.*;
import java.io.*;
public class ReverseTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int k=0;k<i;k++) {
				System.out.print(" ");
			}
			for(int j=i;j<n;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		

	}

}
