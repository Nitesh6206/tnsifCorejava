package multithreading;

public class ThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			childThread thread1=new childThread(10,"Thread1");
			childThread thread2=new childThread(5,"Thread2");
			childThread thread3=new childThread(8,"Thread3");
			childThread thread4=new childThread(7,"Thread4");
			
			thread1.start();
			thread2.start();
			thread3.start();
			thread4.start();
			
			try {
				thread1.join();
				thread2.join();
				thread3.join();
				thread4.join();
			}
			catch(InterruptedException ie) {
				System.out.println(ie);
			}
			
			System.out.println(".... in main");
	}

}
