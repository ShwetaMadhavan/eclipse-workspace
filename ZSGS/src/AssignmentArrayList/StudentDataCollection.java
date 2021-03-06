package AssignmentArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import collectionsAssignment.PojoArrayList;

public class StudentDataCollection {
	
    ArrayList<StudentDetails> student=new ArrayList<StudentDetails>();
	public ArrayList<StudentDetails> getStudent() {
		return student;
	}
	public void setStudent(ArrayList<StudentDetails> student) {
		this.student = student;
	}


	public void dataCollection() {
		Scanner sc=new Scanner(System.in);
		String str="";
		System.out.println("Enter student details");   
		int rollNo=101;
		do {
			StudentDetails stu=new StudentDetails();
			stu.setRollNo(rollNo++);
			System.out.println("Enter the name of the Student");
			stu.setName(sc.next());
			System.out.println("Enter Student Age");
			stu.setAge(sc.nextInt());
			System.out.println("Enter Student Marks");
			stu.setMark(sc.nextDouble());
			
			student.add(stu);
			
			System.out.println("Do you want to Add Student Details?");
			str=sc.next();
			
		}while(str.equalsIgnoreCase("yes"));
		
	}
	
	public void printStudentData(ArrayList<StudentDetails> student) {
		for(StudentDetails obj:student) {
			System.out.println("RollNo : "+obj.getRollNo());
			System.out.println("Name : "+obj.getName());
			System.out.println("Age : "+obj.getAge());
			System.out.println("Mark : "+obj.getMark());
		}
	}
	
	public void iterateElements(ArrayList<StudentDetails> student) {
		Iterator<StudentDetails> i=student.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}
	
	/*
	 * public void insertElements() { stu.setRollNo(rollNo++);
	 * System.out.println("Enter Student Name"); student.setName(sc.next());
	 * System.out.println("Enter Student Age"); student.setAge(sc.nextInt());
	 * System.out.println("Enter Student Marks"); student.setMark(sc.nextDouble());
	 * 
	 * s.add(0,ar);
	 * 
	 * 
	 * System.out.println(s); }
	 */

}
