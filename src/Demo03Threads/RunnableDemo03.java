package Demo03Threads;

public class RunnableDemo03 implements Runnable {
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(300);
				System.out.println("Run method thread is" + Thread.currentThread().getName());

			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		RunnableDemo03 rd2 = new RunnableDemo03();
		Thread t1 = new Thread(rd2);
		Thread t2 = new Thread(rd2);
		Thread t3 = new Thread(rd2);

		t1.setName("ThreadT1");
		t1.start();

		try {
			System.out.println("Thread name from main method is " + Thread.currentThread().getName());
			t1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		t2.start();

		t3.start();

	}
}
