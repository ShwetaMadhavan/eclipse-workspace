import java.util.Arrays;
import java.util.Scanner;

public class ArrayPair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=sc.nextInt();
		System.out.println("Enter the array elements");
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the key");
		int k=sc.nextInt();
		Arrays.sort(a);
		for(int i=0;i<n-1;i++) {
			for(int j=i+1;j<n;j++) {
				if((a[i]+a[j])%k==0) {
					System.out.println("["+a[i]+","+a[j]+"]");
				}
			}
		}

	}

}
