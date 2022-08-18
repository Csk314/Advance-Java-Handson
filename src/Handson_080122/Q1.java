package Handson_080122;

import java.util.ArrayList;
import java.util.Arrays;

//By extending Exception, you can create a checked exception

class CustomCheckedException extends Exception {
	public CustomCheckedException(String message) {

		super(message);
	}
}

public class Q1 {
	static ArrayList<String> list = new ArrayList<>(Arrays.asList("Java", "Go", "Python"));

	public void checkLanguage(String element) throws CustomCheckedException {
		if (list.contains(element)) {
			throw new CustomCheckedException("Element already exists");
		} else {
			list.add(element);
		}
	}

	public static void main(String[] args) {

		// create object of Main class
		Q1 obj = new Q1();

		// exception is handled using try...catch
		try {
			obj.checkLanguage("Swift");
			obj.checkLanguage("Java");

		}

		catch (CustomCheckedException e) {
			System.out.println("[" + e + "] Exception Occured");
		}
	}
}
