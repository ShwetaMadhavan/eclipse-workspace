package collectionsAssignment;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class StudentArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		ArrayList<PojoArrayList> s=new ArrayList<PojoArrayList>(5);
		
		
		String str="";
		String str1="";
		int rollNo=101;
		System.out.println("Student Details");
		do {
			PojoArrayList ar=new PojoArrayList();
			ar.setRollNo(rollNo++);
			System.out.println("Enter Student Name");
			ar.setName(sc.next());
			System.out.println("Enter Student Age");
			ar.setAge(sc.nextInt());
			System.out.println("Enter Student Marks");
			ar.setMark(sc.nextDouble());
			
			s.add(ar);
			
			System.out.println("Do you want to Add Student Details?");
			str=sc.next();
		}while(str.equalsIgnoreCase("YES"));
		
		sc.nextLine();
		
		for(PojoArrayList obj:s) {
			System.out.println("RollNo : "+obj.getRollNo());
			System.out.println("Name : "+obj.getName());
			System.out.println("Age : "+obj.getAge());
			System.out.println("Mark : "+obj.getMark());
		}
		
		
		
		do {
			System.out.println("Select the operation to be performed");
			int op=sc.nextInt();
			
			switch(op) {
			case 0:
				System.out.println("Iterate through all the element in an array list");
				Iterator<PojoArrayList> i=s.iterator();
				while(i.hasNext()) {
					System.out.println(i.next());
				}
				break;
				
			case 1:
				System.out.println("Insert an element into the array list at first position");
				PojoArrayList ar=new PojoArrayList();
				ar.setRollNo(rollNo++);
				System.out.println("Enter Student Name");
				ar.setName(sc.next());
				System.out.println("Enter Student Age");
				ar.setAge(sc.nextInt());
				System.out.println("Enter Student Marks");
				ar.setMark(sc.nextDouble());
				
				s.add(0,ar);
				
				
				System.out.println(s);
				
				break;
				
			case 2:
				System.out.println("Retrieve an element at a given index from an arraylist");
				System.out.println("Enter the index of the element to be retrieved");
				int n=sc.nextInt();
				System.out.println(s.get(n));
				break;
			
			case 3:
				System.out.println("Update student details by given roll no");
				System.out.println("Enter roll no");
				int sno=sc.nextInt();
				for(PojoArrayList obj:s) {
					if(sno==obj.getRollNo()) {
						obj.setName("Ron");
						obj.setAge(17);
						obj.setMark(77);
					}
				}
				System.out.println(s);
				break;
				
			case 4:
				System.out.println("Remove the third element from an arraylist");
				s.remove(2);
				System.out.println(s);
				break;
				
			case 5:
				System.out.println("Search for the student info by roll no in an arraylist");
				System.out.println("Enter the roll no");
				int rno=sc.nextInt();
				for(PojoArrayList obj:s) {
					if(rno==obj.getRollNo()) {
						System.out.println(obj);
					}
				}
				break;
				
			case 6:
				System.out.println("Sort a student list based on their names in ascending order");
				ArrayList<PojoArrayList> sortName=(ArrayList<PojoArrayList>) s.stream().sorted(Comparator.comparing(PojoArrayList::getName)).collect(Collectors.toList());
				System.out.println(sortName);
				break;
				
			case 7:
				System.out.println("Copy one array list into another array list");
				ArrayList<PojoArrayList> ns=s;
				System.out.println(ns);
				break;
				
			case 8:
				System.out.println("Shuffle student info in a array list");
				Collections.shuffle(s,new Random());//can give values inside random function
				Iterator<PojoArrayList> il=s.iterator();
				while(il.hasNext()) {
					System.out.println(il.next());
				}
				break;
				
			case 9:
				System.out.println("Reverse student info in a array list");
				ArrayList<PojoArrayList> revs=new ArrayList<PojoArrayList>();
				for(int j=s.size()-1;j>=0;j--) {
					revs.add(s.get(j));
				}
				System.out.println(revs);
				
				//Collections.reverse(s);
				break;
				
			case 10:
				System.out.println("Extract a portion of Student info into an array list");
				List<PojoArrayList> sub_list=new ArrayList<PojoArrayList>();
				sub_list=s.subList(1, 3);
				System.out.println(sub_list);
				break;
				
			case 11:
				System.out.println("Compare two array lists");
				ArrayList<PojoArrayList> comp=new ArrayList<PojoArrayList>();
				comp.add(new PojoArrayList(201,"Yee",15,78));
				comp.add(new PojoArrayList(202,"Yie",15,78));
				
				if(comp.equals(s)==true) {
					System.out.println("The two arrayLists are equal");
				}
				
				//removes all elements from the first list  
				//returns empty list if all the elements of first list match with elements of second list  
				comp.removeAll(s);  
				//prints the element of second list which does not match with the element of the first list  
				System.out.println(comp); 
				
				//returns the common elements in both list  
				comp.retainAll(s);   
				System.out.println(comp); 
				
				
				
				
				break;
			
			case 12:
				System.out.println("Swap two elements in an array list");
				break;
		
			case 13:
				System.out.println("Join two array lists");
				ArrayList<PojoArrayList> join=new ArrayList<PojoArrayList>();
				join.add(new PojoArrayList(201,"Yee",15,78));
				join.add(new PojoArrayList(202,"Yie",15,78));
				s.addAll(join);
				System.out.println(s);
				break;
				
			case 14:
				System.out.println("Clone an Array list to another array list");
				ArrayList<PojoArrayList> sample=(ArrayList<PojoArrayList>) s.clone();
				System.out.println(sample);
				break;
				
			case 15:
				System.out.println("Empty an array list");
				s.clear();
				System.out.println(s);
				break;
				
			case 16:
				System.out.println("Check whether an array list is empty or not");
				System.out.println(s.isEmpty());
				break;
				
			case 17:
				System.out.println("trim the capacity of an array list the current list size");
				s.trimToSize();
				System.out.println(s.size());
				break;
			
			case 18:
				System.out.println("Increase the size of an array list");
				s.ensureCapacity(15);
				break;
			
			case 19:
				System.out.println("Print all the elements of a ArrayList using the position of the elements");
				for(int a=0;a<s.size();a++) {
					System.out.println(s.get(a));
				}
				break;
				
				
				
			default:
				System.out.println("Enter the operation range 0-20");
				
			}
			
			System.out.println("Do you want to Continue?");
			str1=sc.next();
			
		}while(str1.equalsIgnoreCase("YES"));
		

	}

}
