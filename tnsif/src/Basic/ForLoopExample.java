package Basic;

public class ForLoopExample {
	static int i=5;
	public static void main(String[] args) 
	{	
	
		for( ; i<=1000 ; i=i+2)   //(int i = 1000; i<=1;i--)
		{	
			System.out.print("Value of i:");
			System.out.println(i);
		}
		System.out.println(i);
	}
	static void m1() {
	System.out.println(i);
}

}
