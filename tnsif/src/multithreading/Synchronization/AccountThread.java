package multithreading.Synchronization;

public class AccountThread extends Thread{
	private Account acc;
	private int amt;
	
	public AccountThread(Account acc, int amt) {
		this.acc=acc;
		this.amt=amt;
		start();
	}
	
	@Override
	public void run() {
		try {
			acc.withdraw(amt);
			
		}catch(InsufficentBalanceException e) {
			System.out.println(e.getMessage());
		}
	}

}
