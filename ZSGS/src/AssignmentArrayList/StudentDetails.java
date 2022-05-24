package AssignmentArrayList;

public class StudentDetails {
	private int rollNo;
	private String name;
	private int age;
	private double mark;
	
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getMark() {
		return mark;
	}
	public void setMark(double mark) {
		this.mark = mark;
	}
	
	StudentDetails(int rollNo,String name,int age,double mark){
		this.rollNo=rollNo;
		this.name=name;
		this.age=age;
		this.mark=mark;
	}
	public StudentDetails() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "PojoArrayList [rollNo=" + rollNo + ", name=" + name + ", age=" + age + ", mark=" + mark + "]";
	}
	

}

