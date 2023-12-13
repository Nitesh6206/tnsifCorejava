package multithreading;

public class childThread extends Thread {
	private String msg;
	private int n;
	
	public childThread(int n,String msg) {
		this.n=n;
		this.msg=msg;
		
	}
	@Override
	public void run() {
		for(int i=0;i<=n;i++) {
			try {
				
				Thread.sleep(3000);
			}
			catch(InterruptedException ie) {
				System.out.println(ie);
			}
			System.out.println(msg+" "+i+" ");
		}
	}

}
