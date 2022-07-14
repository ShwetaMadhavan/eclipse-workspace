import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the four numbers");
		Integer a[]=new Integer[4];
		for(int i=0;i<4;i++) {
			a[i]=sc.nextInt();
		}
		int temp[]=new int[4];
		Arrays.sort(a,Collections.reverseOrder());
		System.out.println("Enter the key");
		int k=sc.nextInt();
		
		System.out.println("Using only addition and subtraction");
		
		for(int i=0;i<4;i++) {
			int sum=0;
			for(int j=0;j<4;j++) {
				if(i!=j) {
					sum+=a[j];
				}
			}
			if(Math.abs(a[i]-sum)==k) {
				System.out.println("found"+sum+a[i]);
			}
		}
		
		
		
		
		

	}

}
