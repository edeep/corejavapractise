package threads;

public class ThreadTestOption2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Runnable myRunnable  = () ->{
			System.out.println("Running thread");
		};
		
		new Thread(myRunnable).start();
		new Thread(myRunnable).start();
	}

}
