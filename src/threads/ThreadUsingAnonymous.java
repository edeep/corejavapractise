package threads;

public class ThreadUsingAnonymous {
	
	public static void main (String args[]) {
		Runnable runnableImpl = new Runnable() {

			@Override
			public void run() {
				System.out.println("Thread started" + Thread.currentThread());
				
			}
			
		};
		
		Thread thread1 = new Thread(runnableImpl);
		Thread thread2 = new Thread(runnableImpl);
		thread1.start();
		thread2.start();
	}

}
