package Demo03Threads;

public class Thread1 extends Thread {
	Multiples m1;

	public Thread1(Multiples m1) {
		this.m1 = m1;
	}

	@Override
	public void run() {
		try {
			m1.multiplesOfN(2);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
