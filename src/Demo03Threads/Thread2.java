package Demo03Threads;

public class Thread2 implements Runnable {
	Multiples m2;

	public Thread2(Multiples m2) {
		// TODO Auto-generated constructor stub
		this.m2 = m2;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

		try {
			m2.multiplesOfN(5);
		} catch (Exception E) {
			System.out.println(E.getMessage());
		}

	}

}
