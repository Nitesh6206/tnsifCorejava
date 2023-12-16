package polymorphism.overloading;

public class OverloadingDemo {
	
	public static void main(String[] args) {
		System.out.println("------Constructor Overloading");
		
		point p=new point();
		System.out.println(p);
		point p1=new point(14.5f);
		System.out.println(p1);
		point p2=new point(12.5f,20.50f);
		System.out.println(p2);
		
		System.out.println("-----Method OverLoading----");
		System.out.println("Addition of two integers:"+MethodOverLoading.addition(10, 20));
		System.out.println("Addition of two floating numbers:"+MethodOverLoading.addition(10.0f, 20.0f));
		System.out.println("Addition of one integers and one float:"+MethodOverLoading.addition(10, 20.0f));
		System.out.println("Addition of one float and one integers:"+MethodOverLoading.addition(10.0f, 20));
		System.out.println("Addition of two Strings:"+MethodOverLoading.addition("Hello", "World"));
		
		
		

	}

}
