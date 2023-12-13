package multithreading;

public class ThreadLifeCycleDemo extends Thread {

		@Override
		public void run() {
			int num = 0;
			while(num<4) {
				num++;
				System.out.println("num is"+num);
				
			}
			try {
				sleep(5000);
				System.out.println("In not runnable stage,Thread is alive or not?"+this.isAlive());
				
			}
			catch(InterruptedException exp) {
				System.out.println("Thread Interrupted...");
			}
		}
			public static void main(String[] args) {
				 Thread t=new ThreadLifeCycleDemo();	
				 System.out.println("Before Runnable stage Thread is alive or not? " + t.isAlive());
				 t.start();
				 try {
					    t.join();
						Thread.sleep(4000);
					} catch (InterruptedException exp) {
						System.err.println("Thread is interrupted !");
					}
				 System.out.println("After complete execution of Thread ,it is alive or not? " + t.isAlive());
				}
		


}
