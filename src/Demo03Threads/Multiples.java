package Demo03Threads;

public class Multiples {

	synchronized public void multiplesOfN(int n) {

		for (int i = 1; i <= 5; i++) {
			// synchronized (this) {
			// System.out.println(Thread.getAllStackTraces());
			System.out.println(n * i);
			try {
				Thread.sleep(400);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			// }
		}
	}
}
