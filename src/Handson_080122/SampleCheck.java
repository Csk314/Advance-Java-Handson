package Handson_080122;

import java.util.Scanner;

public class SampleCheck {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n;
		System.out.println("enter the n: ");

		n = sc.nextInt();
		int i = 2;
		while (n > 1) {
			if (n % i == 0) {
				// System.out.println(n+"===");
				// System.out.println("n is=" + n);

				n = n / i;
				System.out.println("i is=" + i);

				// System.out.println("n/i is=" + n);

				// System.out.println(n +"inside===");
				// System.out.println(i+ "i===");
			}
			// i++;
		}
		// System.out.println(1/10);

	}

}