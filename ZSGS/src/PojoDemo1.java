import java.util.*;
import java.io.*;
public class PojoDemo1 {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	StudentDetails1 s=new StudentDetails1();
	int n=sc.nextInt();
	for(int i=0;i<n;i++) {

		
		s.setName(sc.next());
		System.out.println("Name : "+s.getName());
		s.setAge(sc.next());
		System.out.println("Age : "+s.getAge());
		s.setEmail(sc.next());
		System.out.println("email : "+s.getEmail());
		s.setGender(sc.next());
		System.out.println("gender : "+s.getGender());
		s.setPhoneNo(sc.next());
		System.out.println("phoneno : "+s.getPhoneNo());
		s.setRegisterNo(sc.next());
		System.out.println("registerno : "+s.getRegisterNo());
		
	}

}
}
