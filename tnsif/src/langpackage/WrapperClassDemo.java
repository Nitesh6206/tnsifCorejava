package langpackage;

public class WrapperClassDemo {
	public static void main(String[] args) {
		// Unboxing
		@SuppressWarnings("removal")
		Integer i=new Integer(10);
		System.out.println(i);
		int value=i.intValue();
		
		//Autoboxing
				int a = 100;
				Integer i1 = a;
				System.out.println(i1);
	}	

}
