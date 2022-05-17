package SortingUsingArrayList;

import java.io.*;
import java.util.*;
public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=0;int x=0;
		n=sc.nextInt();
		ArrayList<Integer> a=new ArrayList<>();
		for(int i=0;i<n;i++) {
			a.add(sc.nextInt());
		}
		for(int i=1;i<n;i++) {
			int j=i-1;
			x=a.get(i);
			while(j>=0 && x<a.get(j)) {
				a.set(j+1, a.get(j));
				j--;
			}
			a.set(j+1, x);
			
		}
		System.out.print(a.toString());
	}

}

