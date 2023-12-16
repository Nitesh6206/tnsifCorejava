package polymorphism.Overriding;

public class OverridingDemo {
	
	public static void main(String[] args) {
		RBI rbi;
		
		rbi=new SBI();
		System.out.println(rbi.getRateOfInterest());
		System.out.println(rbi.getClass());
		System.out.println(rbi.hashCode());
		rbi=new ICICI();
		System.out.println(rbi.getRateOfInterest());
		System.out.println(rbi.getClass());
		System.out.println(rbi.hashCode());
		rbi=new HDFC();
		System.out.println(rbi.getRateOfInterest());
		
	}

}
