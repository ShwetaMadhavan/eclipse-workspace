import java.util.*;
import java.io.*;
public class PojoDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentDetails obj=new StudentDetails();
		obj.setName("Cho");
		obj.setAge("23");
		obj.setEmail("chochang@gmail.com");
		obj.setGender("Female");
		obj.setPhoneNo("8525363320");
		obj.setRegisterNo("A001");
		
		System.out.println("Name : "+obj.getName());
		System.out.println("Age : "+obj.getAge());
		System.out.println("Email : "+obj.getEmail());
		System.out.println("Gender : "+obj.getGender());
		System.out.println("PhoneNo : "+obj.getPhoneNo());
		System.out.println("RegisterNo : "+obj.getRegisterNo());
		

	}

}
