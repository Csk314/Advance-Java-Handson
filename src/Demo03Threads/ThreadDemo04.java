package Demo03Threads;

public class ThreadDemo04 extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Thread execution for outer print i=" + i);

			try {
				Thread.sleep(500);
				System.out.println("Thread execution for  i=" + i);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		ThreadDemo04 t1 = new ThreadDemo04();
		ThreadDemo04 t2 = new ThreadDemo04();
		t1.start();
		t2.start();
		for (int i = 0; i < 5; i++) {
			System.out.println("This is main class");
		}
	}
}
