package AssignmentLinkedList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;





public class StudentDataCollection {
	
	LinkedList<PojoLinkedList> student=new LinkedList<PojoLinkedList>();
	
	public LinkedList<PojoLinkedList> getStudent() {
		return student;
	}

	public void setStudent(LinkedList<PojoLinkedList> student) {
		this.student = student;
	}

    Scanner sc=new Scanner(System.in);
	int id=101;

	public void dataCollection() {
		//Scanner sc=new Scanner(System.in);
		String str="";
		System.out.println("Enter student details");
		do {
			PojoLinkedList stu=new PojoLinkedList();
			stu.setId(id++);
			System.out.println("Enter the name of the Student");
			stu.setName(sc.next());
			System.out.println("Enter Student Age");
			stu.setAge(sc.nextByte());
			System.out.println("Enter Student Gender");
			stu.setGender(sc.next());
			System.out.println("Enter mobile no");
			stu.setMobileNumber(sc.nextLong());
			
			student.add(stu);
			
			System.out.println("Do you want to Add Student Details?");
			str=sc.next();
			
		}while(str.equalsIgnoreCase("yes"));
		
	}

	public void printStudentData(LinkedList<PojoLinkedList> student) {
		// TODO Auto-generated method stub
		for(PojoLinkedList obj:student) {
			System.out.println("RollNo : "+obj.getId());
			System.out.println("Name : "+obj.getName());
			System.out.println("Age : "+obj.getAge());
			System.out.println("Gender : "+obj.getGender());
			System.out.println("Phone No :"+obj.getMobileNumber());
		}
		
	}

	public void iterateElements(LinkedList<PojoLinkedList> student) {
		// TODO Auto-generated method stub
		Iterator<PojoLinkedList> i=student.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
	}
	
	public void insertElements(LinkedList<PojoLinkedList> student) {
		// TODO Auto-generated method stub
		//Scanner sc=new Scanner(System.in);
		PojoLinkedList ar=new PojoLinkedList();
		ar.setId(id++);
		System.out.println("Enter Student Name");
		ar.setName(sc.next());
		System.out.println("Enter Student Age");
		ar.setAge(sc.nextByte());
		System.out.println("Enter Student Gender");
		ar.setGender(sc.next());
		System.out.println("Enter phone no");
		ar.setMobileNumber(sc.nextLong());
		
		student.add(0,ar);
		
		
		System.out.println(student);
	}

	public void updateStudentDetails(LinkedList<PojoLinkedList> student) {
		// TODO Auto-generated method stub
		System.out.println("Enter roll no");
		int sno=sc.nextInt();
		for(PojoLinkedList obj:student) {
			if(sno==obj.getId()) {
				obj.setName("Ron");
				obj.setAge((byte) 12);
				obj.setGender("Male");
				obj.setMobileNumber(9678354759l);
			}
		}
		System.out.println(student);
		
	}

	public void retrieveElements(LinkedList<PojoLinkedList> student) {
		// TODO Auto-generated method stub
		//System.out.println("Retrieve an element at a given index from an arraylist");
		System.out.println("Enter the id of the Student to be retrieved");
		int sno=sc.nextInt();
		for(PojoLinkedList obj:student) {
			if(sno==obj.getId()) {
				System.out.println("RollNo : "+obj.getId());
				System.out.println("Name : "+obj.getName());
				System.out.println("Age : "+obj.getAge());
				System.out.println("Gender : "+obj.getGender());
				System.out.println("Phone No :"+obj.getMobileNumber());			}}
	}

	public void removeStudent(LinkedList<PojoLinkedList> student) {
		// TODO Auto-generated method stub
		System.out.println("Enter the position of the student to be removed");
		int n=sc.nextInt();
		student.remove(n);
		System.out.println(student);
		
	}

	public void searchStudent(LinkedList<PojoLinkedList> student) {
		// TODO Auto-generated method stub
		System.out.println("Enter the rollno of the student to be searched");
		int sno=sc.nextInt();
		for(PojoLinkedList obj:student) {
			if(sno==obj.getId()) {
				System.out.println("RollNo : "+obj.getId());
				System.out.println("Name : "+obj.getName());
				System.out.println("Age : "+obj.getAge());
				System.out.println("Gender : "+obj.getGender());
				System.out.println("Phone No :"+obj.getMobileNumber());
			}}
		
	}

	public void sortStudentDetails(LinkedList<PojoLinkedList> student2) {
		// TODO Auto-generated method stub
		List<PojoLinkedList> sortName=student.stream().sorted(Comparator.comparing(PojoLinkedList::getName)).collect(Collectors.toList());
		System.out.println(sortName);
		
	}

	public void copyStudentDetails(LinkedList<PojoLinkedList> student) {
		// TODO Auto-generated method stub
		LinkedList<PojoLinkedList> newStudent=new LinkedList<PojoLinkedList>();
		for(int i=0;i<student.size();i++) {
			newStudent.add(student.get(i));
		}
		System.out.println(newStudent);
		
	}

	public void shuffleStudentDetails(LinkedList<PojoLinkedList> student) {
		// TODO Auto-generated method stub
		Collections.shuffle(student);
		System.out.println(student);	
	}

	public void reverseStudentDetails(LinkedList<PojoLinkedList> student) {
		// TODO Auto-generated method stub
		LinkedList<PojoLinkedList> revs=new LinkedList<PojoLinkedList>();
		for(int j=student.size()-1;j>=0;j--) {
			revs.add(student.get(j));
		}
		System.out.println(revs);
		
    	//Collections.reverse(s);
		
	}
	
	public void extractStudentDetails(LinkedList<PojoLinkedList> student) {
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter the current student id: ");
	        int currentStudentId = sc.nextInt();

	        sc.nextLine();

	        for (PojoLinkedList studentDetail : student) {
	            if (studentDetail.getId() == currentStudentId) {
	                System.out.print("which data you want about the current student (Name / age / gender / Mobile Number): ");
	                String facultyChoice = sc.nextLine().toLowerCase();

	                switch (facultyChoice) {
	                    case "name" -> System.out.println("Student Name: " + studentDetail.getName());
	                    case "age" -> System.out.println("Student Age: " + studentDetail.getAge());
	                    case "gender" -> System.out.println("Student Gender: " + studentDetail.getGender());
	                    case "mobile number" ->
	                            System.out.println("Student Mobile Number: " + studentDetail.getMobileNumber());
	                    default -> System.out.println("Invalid Choice...");
	                }
	            }
	        }
	}

	public void CompareStudentDetails(LinkedList<PojoLinkedList> student) {
		// TODO Auto-generated method stub
		LinkedList<PojoLinkedList> newStudent=new LinkedList<PojoLinkedList>();
		for(int i=0;i<student.size();i++) {
			newStudent.add(student.get(i));
		}
		System.out.println(newStudent);
		
		if(newStudent.equals(student)==true) {
			System.out.println("The two arrayLists are equal");
		}
		
		//removes all elements from the first list  
		//returns empty list if all the elements of first list match with elements of second list  
		newStudent.removeAll(student);  
		//prints the element of second list which does not match with the element of the first list  
		System.out.println(newStudent); 
		
		//returns the common elements in both list  
		newStudent.retainAll(student);   
		System.out.println(newStudent); 
		
	}

	public void swapStudentDetails(LinkedList<PojoLinkedList> student2) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);

	        System.out.print("Enter first student position: ");
	        int firstStudentPosition = sc.nextInt() - 1;

	        System.out.print("Enter second student position: ");
	        int secondStudentPosition = sc.nextInt() - 1;

	        PojoLinkedList temp = student.get(firstStudentPosition);
	        student.set(firstStudentPosition, student.get(secondStudentPosition));
	        student.set(secondStudentPosition, temp);
	        System.out.println(student);
		
	}

	public void joinOperation(LinkedList<PojoLinkedList> student2) {
		// TODO Auto-generated method stub
		System.out.println("Join two array lists");
		LinkedList<PojoLinkedList> join=new LinkedList<PojoLinkedList>();
		join.add(new PojoLinkedList(201,"Yee",(byte) 15,"male",68367383l));
		join.add(new PojoLinkedList(202,"Yie",(byte) 15,"female",76208485));
		student.addAll(join);
		System.out.println(student);
		
	}

	public void cloneStudentDetails(LinkedList<PojoLinkedList> student2) {
		// TODO Auto-generated method stub
		LinkedList<PojoLinkedList> sample=(LinkedList<PojoLinkedList>) student.clone();
		System.out.println(sample);
	}

	public void emptyStudentDetails(LinkedList<PojoLinkedList> student2) {
		// TODO Auto-generated method stub
		student.clear();
		System.out.println(student);
	}

	public void checkEmpty(LinkedList<PojoLinkedList> student2) {
		// TODO Auto-generated method stub
		if(student.isEmpty()==true) {
			System.out.println("The list is empty");
		}
	}

	public void trim(LinkedList<PojoLinkedList> student2) {
		// TODO Auto-generated method stub
		 /*
        --> LinkedList by nature doesn't have "Capacity".
        --> Since, it doesn't allocate memory to the items before the items are added to the list.
        --> Each item in a LinkedList holds a pointer to the next in the list.
        --> There would be no - point in allocating memory to the list beforehand.
        */
		
	}

	public void increaseSize(LinkedList<PojoLinkedList> student2) {
		// TODO Auto-generated method stub
		 /*
        --> LinkedList by nature doesn't have "Capacity".
        --> Since, it doesn't allocate memory to the items before the items are added to the list.
        --> Each item in a LinkedList holds a pointer to the next in the list.
        --> There would be no - point in allocating memory to the list beforehand.
        */
	}

	public void printPosition(LinkedList<PojoLinkedList> student2) {
		// TODO Auto-generated method stub
		for(int i=0;i<student.size();i++) {
			System.out.println(student.get(i));
		}
		
	}
	
	
	
	
	
	


	

}
