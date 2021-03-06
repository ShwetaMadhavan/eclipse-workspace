package AssignmentVector;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;
import java.util.stream.Collectors;


public class StudentDataCollection {
	
	Vector<PojoVector> student=new Vector<PojoVector>();
	
	 public Vector<PojoVector> getStudent() {
		return student;
	}

	public void setStudent(Vector<PojoVector> student) {
		this.student = student;
	}


	Scanner sc=new Scanner(System.in);
		int id=101;

		public void dataCollection() {
			//Scanner sc=new Scanner(System.in);
			String str="";
			System.out.println("Enter student details");
			do {
				PojoVector stu=new PojoVector();
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

		public void printStudentData(Vector<PojoVector> student) {
			// TODO Auto-generated method stub
			for(PojoVector obj:student) {
				System.out.println("RollNo : "+obj.getId());
				System.out.println("Name : "+obj.getName());
				System.out.println("Age : "+obj.getAge());
				System.out.println("Gender : "+obj.getGender());
				System.out.println("Phone No :"+obj.getMobileNumber());
			}
			
		}

		public void iterateElements(Vector<PojoVector> student) {
			// TODO Auto-generated method stub
			Iterator<PojoVector> i=student.iterator();
			while(i.hasNext()) {
				System.out.println(i.next());
			}
			
		}
		
		public void insertElements(Vector<PojoVector> student) {
			// TODO Auto-generated method stub
			//Scanner sc=new Scanner(System.in);
			PojoVector ar=new PojoVector();
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

		public void updateStudentDetails(Vector<PojoVector> student) {
			// TODO Auto-generated method stub
			System.out.println("Enter roll no");
			int sno=sc.nextInt();
			for(PojoVector obj:student) {
				if(sno==obj.getId()) {
					obj.setName("Ron");
					obj.setAge((byte) 12);
					obj.setGender("Male");
					obj.setMobileNumber(9678354759l);
				}
			}
			System.out.println(student);
			
		}

		public void retrieveElements(Vector<PojoVector> student) {
			// TODO Auto-generated method stub
			//System.out.println("Retrieve an element at a given index from an arraylist");
			System.out.println("Enter the id of the Student to be retrieved");
			int sno=sc.nextInt();
			for(PojoVector obj:student) {
				if(sno==obj.getId()) {
					System.out.println("RollNo : "+obj.getId());
					System.out.println("Name : "+obj.getName());
					System.out.println("Age : "+obj.getAge());
					System.out.println("Gender : "+obj.getGender());
					System.out.println("Phone No :"+obj.getMobileNumber());			}}
		}

		public void removeStudent(Vector<PojoVector> student) {
			// TODO Auto-generated method stub
			System.out.println("Enter the position of the student to be removed");
			int n=sc.nextInt();
			student.remove(n);
			System.out.println(student);
			
		}

		public void searchStudent(Vector<PojoVector> student) {
			// TODO Auto-generated method stub
			System.out.println("Enter the rollno of the student to be searched");
			int sno=sc.nextInt();
			for(PojoVector obj:student) {
				if(sno==obj.getId()) {
					System.out.println("RollNo : "+obj.getId());
					System.out.println("Name : "+obj.getName());
					System.out.println("Age : "+obj.getAge());
					System.out.println("Gender : "+obj.getGender());
					System.out.println("Phone No :"+obj.getMobileNumber());
				}}
			
		}

		public void sortStudentDetails(Vector<PojoVector> student2) {
			// TODO Auto-generated method stub
			List<PojoVector> sortName=student.stream().sorted(Comparator.comparing(PojoVector::getName)).collect(Collectors.toList());
			System.out.println(sortName);
			
		}

		public void copyStudentDetails(Vector<PojoVector> student) {
			// TODO Auto-generated method stub
			Vector<PojoVector> newStudent=new Vector<PojoVector>();
			for(int i=0;i<student.size();i++) {
				newStudent.add(student.get(i));
			}
			System.out.println(newStudent);
			
		}

		public void shuffleStudentDetails(Vector<PojoVector> student) {
			// TODO Auto-generated method stub
			Collections.shuffle(student);
			System.out.println(student);	
		}

		public void reverseStudentDetails(Vector<PojoVector> student) {
			// TODO Auto-generated method stub
			Vector<PojoVector> revs=new Vector<PojoVector>();
			for(int j=student.size()-1;j>=0;j--) {
				revs.add(student.get(j));
			}
			System.out.println(revs);
			
	    	//Collections.reverse(s);
			
		}
		
		public void extractStudentDetails(Vector<PojoVector> student) {
			 Scanner sc = new Scanner(System.in);
		        System.out.print("Enter the current student id: ");
		        int currentStudentId = sc.nextInt();

		        sc.nextLine();

		        for (PojoVector studentDetail : student) {
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

		public void CompareStudentDetails(Vector<PojoVector> student) {
			// TODO Auto-generated method stub
			Vector<PojoVector> newStudent=new Vector<PojoVector>();
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

		public void swapStudentDetails(Vector<PojoVector> student2) {
			// TODO Auto-generated method stub
			 Scanner sc = new Scanner(System.in);

		        System.out.print("Enter first student position: ");
		        int firstStudentPosition = sc.nextInt() - 1;

		        System.out.print("Enter second student position: ");
		        int secondStudentPosition = sc.nextInt() - 1;

		        PojoVector temp = student.get(firstStudentPosition);
		        student.set(firstStudentPosition, student.get(secondStudentPosition));
		        student.set(secondStudentPosition, temp);
		        System.out.println(student);
			
		}

		public void joinOperation(Vector<PojoVector> student2) {
			// TODO Auto-generated method stub
			System.out.println("Join two array lists");
			Vector<PojoVector> join=new Vector<PojoVector>();
			join.add(new PojoVector(201,"Yee",(byte) 15,"male",68367383l));
			join.add(new PojoVector(202,"Yie",(byte) 15,"female",76208485));
			student.addAll(join);
			System.out.println(student);
			
		}

		public void cloneStudentDetails(Vector<PojoVector> student2) {
			// TODO Auto-generated method stub
			Vector<PojoVector> sample=(Vector<PojoVector>) student.clone();
			System.out.println(sample);
		}

		public void emptyStudentDetails(Vector<PojoVector> student2) {
			// TODO Auto-generated method stub
			student.clear();
			System.out.println(student);
		}

		public void checkEmpty(Vector<PojoVector> student2) {
			// TODO Auto-generated method stub
			if(student.isEmpty()==true) {
				System.out.println("The list is empty");
			}
		}

		public void trim(Vector<PojoVector> student2) {
			// TODO Auto-generated method stub
			Vector<PojoVector> studentIdDetails=new Vector<PojoVector>();
			 System.out.println("Initial capacity of studentId list: " + studentIdDetails.size());

		        for (PojoVector studentDetail : student) {
		            studentIdDetails.add(studentDetail);
		        }

		        studentIdDetails.trimToSize();
		        System.out.println("Trimmed Capacity of studentId list: " + studentIdDetails.size());
			
		        studentIdDetails.ensureCapacity(20);
		        System.out.println("Re - Sized Capacity of studentId lis: " + studentIdDetails.size());
			
		}

		public void increaseSize(Vector<PojoVector> student2) {
			// TODO Auto-generated method stub
			Vector<PojoVector> studentIdDetails=new Vector<PojoVector>();
			 System.out.println("Initial capacity of studentId list: " + studentIdDetails.size());

		        for (PojoVector studentDetail : student) {
		            studentIdDetails.add(studentDetail);
		        }

		        studentIdDetails.trimToSize();
		        System.out.println("Trimmed Capacity of studentId list: " + studentIdDetails.size());
			
		        studentIdDetails.ensureCapacity(20);
		        System.out.println("Re - Sized Capacity of studentId lis: " + studentIdDetails.size());
		}

		public void printPosition(Vector<PojoVector> student2) {
			// TODO Auto-generated method stub
			for(int i=0;i<student.size();i++) {
				System.out.println(student.get(i));
			}
			
		}


}
