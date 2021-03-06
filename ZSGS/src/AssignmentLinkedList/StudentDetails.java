package AssignmentLinkedList;

import java.util.Scanner;

public class StudentDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        
		String str="";
		
		StudentDataCollection sd=new StudentDataCollection();
		sd.dataCollection();
		
		
		do {
			System.out.println("Select the option to be performed");
			int op=sc.nextInt();
			System.out.println("1.Iterate through all the element in an array list");
			System.out.println("2.Insert an element into the array list at first position");
			System.out.println("3.Retrieve an element at a given index from an arraylist");
			System.out.println("4.Update student details by given roll no");
			System.out.println("5.Remove the third element from an arraylist");
			System.out.println("6.Search for the student info by roll no in an arraylist");
			System.out.println("7.Sort a student list based on their names in ascending order");
			System.out.println("8.Copy one array list into another array list");
			System.out.println("9.Shuffle student info in a array list");
			System.out.println("10.Reverse student info in a array list");
			System.out.println("11.Extract a portion of Student info into an array list");
			System.out.println("12.Compare two array lists");
			System.out.println("13.Swap two elements in an array list");
			System.out.println("14.Join two array lists");
			System.out.println("15.Clone an Array list to another array list");
			System.out.println("16.Empty an array list");
			System.out.println("17.Check whether an array list is empty or not");
			System.out.println("18.trim the capacity of an array list the current list size");
			System.out.println("19.Increase the size of an array list");
			System.out.println("20.print all the elements of a ArrayList using the position of the elements");

			switch(op) {
			case 1:
				sd.printStudentData(sd.getStudent());
				sd.iterateElements(sd.getStudent());
				break;
				
			case 2:
				sd.insertElements(sd.getStudent());
				break;
				
			case 3:
				sd.retrieveElements(sd.getStudent());
				break;
				
			case 4:
				sd.updateStudentDetails(sd.getStudent());
				break;
				
			case 5:
				sd.removeStudent(sd.getStudent());
				break;
			
			case 6:
				sd.searchStudent(sd.getStudent());
				break;
				
			case 7:
				sd.sortStudentDetails(sd.getStudent());
				break;
				
			case 8:
				sd.copyStudentDetails(sd.getStudent());
				break;
			
			case 9:
				sd.shuffleStudentDetails(sd.getStudent());
				break;
			
			case 10:
				sd.reverseStudentDetails(sd.getStudent());
				break;
			
			case 11:
				sd.extractStudentDetails(sd.getStudent());
				break;
			
			case 12:
				sd.CompareStudentDetails(sd.getStudent());
				break;
				
			case 13:
				sd.swapStudentDetails(sd.getStudent());
				break;
			
			case 14:
				sd.joinOperation(sd.getStudent());
				break;
				
			case 15:
				sd.cloneStudentDetails(sd.getStudent());
				break;
			
			case 16:
				sd.emptyStudentDetails(sd.getStudent());
				break;
				
			case 17:
				sd.checkEmpty(sd.getStudent());
				break;
			
			case 18:
				sd.trim(sd.getStudent());
				break;
			
			case 19:
				sd.increaseSize(sd.getStudent());
				break;
			
			case 20:
				sd.printPosition(sd.getStudent());
				break;
			
			default:
				System.out.println("Enter valid choice");
				
			}
			
			System.out.println("Do you want to continue?");
			str=sc.next();
			
			
		}while(str.equalsIgnoreCase("yes"));

	

	}

}
