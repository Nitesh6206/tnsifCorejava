package multithreading.Synchronization;

public class SynchronizationDemo {
	public static void main(String[] args) {

		Account a1 = new Account(101, "Nitesh", 50000);
		System.out.println(a1);

		// Five account threads running parallel and sharing same resource
		AccountThread t[] = new AccountThread[5];
		for (int i = 0; i < 5; i++) {
			t[i] = new AccountThread(a1, 1000 * (i + 1));
			try {
				t[i].join(); // waits main thread till execution of all child thread finish
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
		System.out.println("--------------------------------------------------------");
		System.out.println(a1);

	}

}
