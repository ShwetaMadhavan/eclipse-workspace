package SortingUsingArrayList;
import java.io.*;
import java.util.*;
public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		ArrayList<Integer> a= new ArrayList<Integer>();
		for(int i=0;i<n;i++) {
			a.add(sc.nextInt());
		}
		for(int i=0;i<a.size()-1;i++) {
			for(int j=i+1;j<a.size();j++) {
				if(a.get(i)>a.get(j)) {
					int temp=a.get(i);
					a.set(i, a.get(j));
					a.set(j, temp);
				}
			}
		}
		for(Integer arr:a) {
			System.out.print(arr+" ");
		}

	}

}

