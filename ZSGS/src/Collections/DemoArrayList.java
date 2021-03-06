package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class DemoArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		ArrayList<Integer> a1=new ArrayList<Integer>();
		ArrayList<Integer> a2=new ArrayList<Integer>();
		ArrayList<Integer> a3=new ArrayList<Integer>();
		
		a2.ensureCapacity(4);
		
		a1.add(0);
		a1.add(3);
		a1.add(6);
		a1.add(9);
		a1.add(12);
		
		System.out.println("Enter the elements of a2");
		
		for(int i=0;i<5;i++) {
			a2.add(sc.nextInt());
		}
		
		System.out.println("The elements of a1");
		
		//System.out.println(a1.toString());
		for(Integer a:a1) {
			System.out.println(a);
		}
		
		System.out.println("The elements of a2");
		System.out.println(a2);
		
		a1.remove(3);
		System.out.println(a1);
		
		a1.set(1, 2);
		System.out.println(a1);
		System.out.println(a1.get(3));
		System.out.println(a1.size());
		//a1.clear();
		System.out.println(a1);
		
		a1.addAll(a2);
		System.out.println(a1);
		Collections.sort(a1);
		System.out.println(a1);
		
		System.out.println(a2.indexOf(7));
		System.out.println(a2.contains(0));
		//a2.clear();
		System.out.println(a2.isEmpty());
		
		a3=(ArrayList)a1.clone();
		System.out.println(a3);
		
		Iterator i=a3.iterator();
		System.out.println(i.next());
		
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		

	}

}
