package AssignmentLinkedList;

public class PojoLinkedList {
	private int id;
    private String name;
    private byte age;
    private String gender;
    private long mobileNumber;
    
    public PojoLinkedList(int id, String name, byte age, String gender, long mobileNumber) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.mobileNumber = mobileNumber;
	}
    
    PojoLinkedList(){
    }
    
    
    
	@Override
	public String toString() {
		return "PojoLinkedList [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", mobileNumber="
				+ mobileNumber + "]";
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public byte getAge() {
		return age;
	}
	public void setAge(byte age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	

	


}
