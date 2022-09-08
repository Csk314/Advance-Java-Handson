package Handson_080122;

import java.util.Arrays;
import java.util.Scanner;

public class Demo080522Anagram {
	static boolean isAnagram(String a, String b) {
		// Complete the function

		char[] arr1 = a.toCharArray();
		Arrays.sort(arr1);
		String str1 = new String(arr1);
		// System.out.println(str1);
		char[] arr2 = b.toCharArray();
		Arrays.sort(arr2);
		String str2 = new String(arr2);

		if (str1.equalsIgnoreCase(str2)) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		System.out.println("Enter the strings to compare if they are anagrams");
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();
		sc.close();
		// System.out.println(a);
		System.out.println(isAnagram(s1, s2));
		ArrayListEg eg3 = new ArrayListEg();
	}

}
