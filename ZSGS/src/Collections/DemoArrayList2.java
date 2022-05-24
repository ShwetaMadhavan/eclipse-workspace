package Collections;

import java.util.ArrayList;
import java.util.Scanner;

class Student {

	int registerNo;
	String name;
	int age;
	long phoneNo;
	
	Student(int registerNo,String name,int age,long phoneNo){
		this.registerNo=registerNo;
		this.name=name;
		this.age=age;
		this.phoneNo=phoneNo;
	}


}

public class DemoArrayList2 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String name=sc.next();
		int age=sc.nextInt();
		long phonenum=sc.nextLong();
		ArrayList<Student> stu=new ArrayList<Student>();
		stu.add(new Student(101,name,age,phonenum));
		
		
	
		
	
		
		for(Student s:stu) {
			System.out.println(s.age+" "+s.name+" "+s.registerNo+" "+s.phoneNo);
		}
		
		

	}

}

