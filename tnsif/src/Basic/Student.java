package Basic;

public class Student {
	private int serialNum;
	private String name;
	private int age;
	
	public Student() {
	
	}
	public Student(int serialNum) {
		super();
		this.serialNum = serialNum;
	}

	public Student(int serialNum, String name, int age) {
		super();
		this.serialNum = serialNum;
		this.name = name;
		this.age = age;
	}

	public int getSerialNum() {
		return serialNum;
	}
	public void setSerialNum(int serialNum) {
		this.serialNum = serialNum;
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
	@Override
	public String toString() {
		return "Student [serialNum=" + serialNum + ", name=" + name + ", age=" + age + "]";
	}


}
