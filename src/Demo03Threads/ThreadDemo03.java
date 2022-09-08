package Demo03Threads;

public class ThreadDemo03 implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("This is child thread");
		}
	}

	public static void main(String[] args) {
		ThreadDemo03 runnableDemo = new ThreadDemo03();

		Thread t = new Thread(runnableDemo);
		t.start();
		for (int i = 0; i < 5; i++) {
			System.out.println("This is main class");
		}
	}
}
