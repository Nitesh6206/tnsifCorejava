package multithreading;


public class ThreadMethodsDemo {

	public static void main(String[] args) {
		childThread ct1=new childThread(5, "Thread1");
		childThread ct2=new childThread(6, "Thread2");
		
		System.out.println("Current Thread: " + Thread.currentThread());
		
        ct1.start();
        ct2.start();
        
        Thread.currentThread().setName("Parent Thread"); // assign name to thread
        Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
        System.out.println("Current Thread: " + Thread.currentThread());// returns current thread
        
        try {
			ct1.join(); // wait current thread until ct1 is dead
			ct2.join(300); // wait current thread until ct2 is dead or time period is over
		}
        catch(InterruptedException ie) {
			System.out.println(ie);
		}
	}

}
