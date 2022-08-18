package Handson_080122;

import java.util.Scanner;

public class Palindrome {
	// static String hello = "abc";

//	private static int[] arrr() {
//		int arr[] = new int[10];
//		return arr;
//	}

	static void palindromeChecker(int n) {
		Palindrome p = new Palindrome();
		// p.test();
		int res = 0;
		int temp = n;
		while (n > 0) {
			int r = n % 10;
			res = res * 10 + r;
			n = n / 10;

		}
		if (temp == res)
			System.out.println("palindrome number ");
		else
			System.out.println("not palindrome");
	}

//	void test() {
//		System.out.println("hellp");
//		System.out.println(hello);
//	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		String[] abc = "avacado".split("a");
		System.out.println(abc.length);
		for (int i = 0; i < abc.length; i++) {
			System.out.println(abc[i]);
		}
		int n = sc.nextInt();
		// arrr();
		palindromeChecker(n);
	}
}
