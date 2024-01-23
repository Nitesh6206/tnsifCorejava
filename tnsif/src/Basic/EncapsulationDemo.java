package Basic;

public class EncapsulationDemo {

	public static void main(String[] args) {
		Student obj=new Student(1,"Roopa",21);	
		System.out.println(obj);
		
       Student s1=new Student();
       s1.setSerialNum(2);
       s1.setName("HArsha");
       s1.setAge(21);
       System.out.println(s1);
	}

}
