package Demo03Threads;

public class ThreadDemo02 extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("This is a thread from run method");
		}
	}

	public static void main(String[] args) {
		ThreadDemo02 t1 = new ThreadDemo02();
		t1.start();
		for (int i = 0; i < 5; i++) {
			System.out.println("This is main thread");
		}
	}
}
