package multithreading.Synchronization;

public class InsufficentBalanceException extends Exception {

	public InsufficentBalanceException() {
		
		super("Insufficent Balance in your account");
		
	}
public InsufficentBalanceException(String message) {
		
		super(message);
		
	}
	
}
