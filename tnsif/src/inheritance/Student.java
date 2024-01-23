package inheritance;

public class Student extends Citizen{
	private int rollNo;
	private String collegeName;
	
	public Student() {
		super();
	}
	
	
	public Student(int rollNo,String collegeName,String name, int aadharNo, String address, long phno) {
		super(name, aadharNo, address, phno);
		this.rollNo=rollNo;
		this.collegeName=collegeName;
	}


	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}


	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", collegeName=" + collegeName + ", Name=" + getName()
				+ ",AadharNo=" + getAadharNo() + ", Address=" + getAddress() + ", Phno=" + getPhno()
				+ "]";
	}
}