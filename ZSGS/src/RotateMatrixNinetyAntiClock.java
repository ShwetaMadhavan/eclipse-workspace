import java.io.*;
import java.util.*;
public class RotateMatrixNinetyAntiClock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int r,c;
		System.out.println("Enter the number of rows");
		r=sc.nextInt();
		System.out.println("Enter the number of columns");
		c=sc.nextInt();
		int a[][]=new int[r][c];
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		//First find transpose of a matix
		for(int i=0;i<a.length;i++) {
			for(int j=i;j<c;j++) {
				if(i!=j) {
					int temp=a[i][j];
					a[i][j]=a[j][i];
					a[j][i]=temp;
				}
			}
		}
	
		//Print the elements
		for(int i=r-1;i>=0;i--) {
			for(int j=0;j<c;j++) {
				if(j==0 && i!=r-1) {
					System.out.println();
				}
				System.out.print(a[i][j]+" ");
			}
		}

	}

}
