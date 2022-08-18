package Handson_080122;

import java.util.Scanner;

public class Demo080522SnakeCase {
	// The ASCII value of A to Z is 65 to 90,
	// and the ASCII value of a to z in Java is 97 to 122.

	static String snakeCaseConversion(String s) {
		// Write your code here that converts the given camel case string s and
		// returns a snake case version of that string
		String res = ""; // CamelCase
		res += Character.toLowerCase(s.charAt(0)); // res --> c

		for (int i = 1; i < s.length(); i++) {
			if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
				res += "_" + Character.toLowerCase(s.charAt(i));
			} else {
				res += s.charAt(i);
			}
		}
		return res;
	}

	public static void main(String[] args) {
//		System.out.println(caseConversion("ComputerHope"));
//		System.out.println(caseConversion("OddOrEven"));
//		System.out.println(caseConversion("HackerEarth"));
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Camel Case string ");
		System.out.println(snakeCaseConversion(sc.next()));
		sc.close();
	}

}
