package Demo03Threads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrintEvenOddUsingThread {

	public void printEven(List<Integer> li) {
		for (Integer i : li) {
			if (i % 2 == 0) {
				System.out.println("Print Even: " + i);
			}
		}
	}

	public void printOdd(List<Integer> li) {
		for (Integer i : li) {
			if (i % 2 != 0) {
				System.out.println("Print Odd: " + i);
			}
		}
	}

	public static void main(String[] args) {
		PrintEvenOddUsingThread obj = new PrintEvenOddUsingThread();
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1, 2, 4, 24, 5, 9, 10, 100, 103));
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				obj.printEven(list);
			}

		});

		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				obj.printOdd(list);
			}

		});

		try {
			t1.start();
			t2.start();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
