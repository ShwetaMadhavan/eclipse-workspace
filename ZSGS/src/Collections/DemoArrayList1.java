package Collections;

import java.io.*;
import java.util.*;
public class DemoArrayList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		ArrayList<Object> ar=new ArrayList<Object>();
		for(int i=0;i<3;i++) {
		String name=sc.next();
		ar.add(name);
		int age=sc.nextInt();
		ar.add(age);
		long phoneNo=sc.nextLong();
		ar.add(phoneNo);
		}
		
		/*
		 * for(int i=0;i<ar.size();i++) { System.out.print(ar.get(i)+" "); }
		 */
		
		for(Object a:ar) {
			System.out.print(a+" ");
			
		}
		

	}

}

