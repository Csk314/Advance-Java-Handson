package Demo03Threads;

public class ThreadDemo {
	public static void main(String[] args) {
		Multiples obj1 = new Multiples();

		Thread1 t1 = new Thread1(obj1);

		Thread t2 = new Thread(new Thread2(obj1));

		t1.start();
		t2.start();
	}
}
