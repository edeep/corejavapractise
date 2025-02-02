package threads;

public class ThreadTestOption1Main {

	public static void main(String args[]) {
		Thread t = new Thread(new ThreadTestOption1());
		t.start();
	}
}
