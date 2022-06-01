package AssignmentHashMap;

import java.util.HashMap;
import java.util.Scanner;

import AssignmentLinkedList.PojoLinkedList;

public class StudentDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		HashMap<Integer,PojoStudent> studentDetails=new HashMap<Integer,PojoStudent>();
		HashMap<Integer,PojoStudent> backUp=new HashMap<Integer,PojoStudent>();
		int studentId=101;
		String str="";
		do {
			System.out.println("Select the option to be performed");
			int op=sc.nextInt();
			System.out.println("1. New Student");
            System.out.println("2. Old Student");
            System.out.println("3. All Students");
            System.out.println("4. Total Students");
            System.out.println("5. Back Up");
            System.out.println("6. Check For Empty");
            System.out.println("7. Checking Mapping");
            System.out.println("8. Make Shallow Copy");
            System.out.println("9. Exit");
            
            switch(op) {
            case 1:
            	PojoStudent student=studentInfo(studentId);
            	studentDetails.put(studentId++, student);
            	break;
            
            case 2:
            	
            	
            }
		}while(str.equalsIgnoreCase("yes"));

	}

	static PojoStudent studentInfo(int studentId) {
		// TODO Auto-generated method stub
		String str="";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter student details");
		do {
			PojoStudent stu=new PojoStudent();
			System.out.println("Enter the name of the Student");
			stu.setName(sc.next());
			System.out.println("Enter Student Age");
			stu.setAge(sc.nextByte());
			System.out.println("Enter Student Gender");
			stu.setGender(sc.next());
			System.out.println("Enter mobile no");
			stu.setMobileNumber(sc.nextLong());
			
			
			System.out.println("Do you want to Add Student Details?");
			str=sc.next();
			
		}while(str.equalsIgnoreCase("yes"));
		
		
		return null;
	}

}
