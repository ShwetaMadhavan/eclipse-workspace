package PojoUsingArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		
		
		 ArrayList<Employee> emp = new ArrayList<>(); 
		 Employee emp1 = new Employee("Harry", 101, 21, 100.00, "Chennai");
		 Employee emp2 = new Employee("Ronald", 102, 20, 110.00, "Dublin");
		 Employee emp3 = new Employee("Cedric", 103, 24, 150.00, "Mumbai");
		 Employee emp4 = new Employee("Cho", 104, 23, 170.00, "Wuhan");
		 Employee emp5 = new Employee("Hermoine", 105, 21, 1000.00, "Madurai");
		  
		  
		  
		  
		  emp.add(emp1); emp.add(emp2); emp.add(emp3); emp.add(emp4); emp.add(emp5);
		  
		  //emp.remove(0);
		  
		  
		  
		  for(Employee obj:emp) { 
		  System.out.println("Name: "+obj.getName());
		  System.out.println("EmpID: "+obj.getEmpId());
		  System.out.println("Age: "+obj.getAge());
		  System.out.println("Salary: "+obj.getSalary());
		  System.out.println("Address: "+obj.getAddress()); }
		  
		  String Fname=sc.next();
		  for(Employee obj:emp) {
		  if(obj.getName().equals(Fname)) { 
			  System.out.println(obj.toString()); 
			  } }
		  
		  int EID=sc.nextInt();
		  for(Employee obj:emp) {
			  if(obj.getEmpId()==(EID)) { 
				  System.out.println(obj.toString()); 
				  } }
		 
		  
		  
	}

}
