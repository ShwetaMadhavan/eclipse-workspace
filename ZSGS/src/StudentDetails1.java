import java.util.*;
public class StudentDetails1 {
	private String name;
	private String age;
	private String email;
	private String gender;
	private String phoneNo;
	private String registerNo;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getRegisterNo() {
		return registerNo;
	}

	public void setRegisterNo(String registerNo) {
		this.registerNo = registerNo;
	}

	public void print() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		name=sc.next();
		System.out.println("Name : "+name);
		age=sc.next();
		System.out.println("Age : "+age);
		email=sc.next();
		System.out.println("email : "+email);
		gender=sc.next();
		System.out.println("gender : "+gender);
		phoneNo=sc.next();
		System.out.println("phoneno : "+phoneNo);
		registerNo=sc.next();
		System.out.println("registerno : "+registerNo);
		
		
		
		
	}



	/*
	 * public StudentDetails(String name,String age,String email,String
	 * gender,String phoneNo,String registerNo) { this.name=name; this.age=age;
	 * this.email=email; this.gender=gender; this.phoneNo=phoneNo;
	 * this.registerNo=registerNo; }
	 */
	
	
}

