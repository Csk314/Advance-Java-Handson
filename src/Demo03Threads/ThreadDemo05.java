package Demo03Threads;

public class ThreadDemo05 extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				System.out.println("this is run method");
				Thread.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) throws InterruptedException {
		ThreadDemo05 t1 = new ThreadDemo05();
		ThreadDemo05 t2 = new ThreadDemo05();
		t1.start();
		t1.join(300);
		t2.start();
		for (int i = 0; i < 5; i++) {
			System.out.println("This is main class");
		}
	}
}
