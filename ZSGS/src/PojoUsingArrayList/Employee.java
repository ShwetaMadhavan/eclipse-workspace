package PojoUsingArrayList;

public class Employee {
	private String name;
	private int empId;
	private int age;
	private double salary;
	private String address;
	
	
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", empId=" + empId + ", age=" + age + ", salary=" + salary + ", address="
				+ address + "]";
	}
	public Employee(String name,int empId,int age,double salary,String address) {
		this.name=name;
		this.empId=empId;
		this.age=age;
		this.salary=salary;
		this.address=address;
		
		
	}
		

}
