import java.io.*;
import java.util.*;
public class SumOfWeights {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of elements");
		int n=sc.nextInt();
		System.out.println("Enter the elements");
		int a[]=new int[n];
		int b[]=new int[n];
		//int c[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		int sum=0;
		for(int i=0;i<n;i++) {
			sum=0;
			double sqrt=Math.sqrt(a[i]);
			if(Math.floor(sqrt)-sqrt==0) {
				sum=sum+5;
			}
			if(a[i]%4==0 && a[i]%6==0) {
				sum+=4;
			}
			if(a[i]%2==0) {
				sum+=3;
			}
			b[i]=sum;
		
		}
		/*
		 * for(int i=0;i<n;i++) { System.out.println(a[i]+","+b[i]); }
		 */
		for(int i=0;i<b.length;i++) {
			for(int j=i+1;j<b.length;j++) {
				if(b[i]<b[j]) {
				int temp=b[i];
				b[i]=b[j];
				b[j]=temp;
				int temp1=a[i];
				a[i]=a[j];
				a[j]=temp1;
			}}
		}
		for(int i=0;i<n;i++) {
			System.out.println(a[i]+","+b[i]);
		}

	}

}
