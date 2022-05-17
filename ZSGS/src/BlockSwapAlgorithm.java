import java.io.*;
import java.util.*;
public class BlockSwapAlgorithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			int k=sc.nextInt();
			int a[]=new int[n];
			for(int i=0;i<n;i++) {
				a[i]=sc.nextInt();
			}
			//leftRotate(a,k,n);
			rightRotate(a,k,n);
			printArray(a);
		

	}

}
