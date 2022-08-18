package Handson_080122;

import java.util.ArrayList;
import java.util.Arrays;

//By extending RuntimeException, you can create unchecked exception:
@SuppressWarnings("serial")
class CustomUncheckedException extends RuntimeException {
	public CustomUncheckedException(String message) {
		// call the constructor of RuntimeException
		super(message);
	}
}

class Q1_Unchecked {

	ArrayList<String> languages = new ArrayList<>(Arrays.asList("Java", "Python", "JavaScript"));

	// check the exception condition
	public void checkLanguage(String language) {

		// throw exception if language already present in ArrayList
		if (languages.contains(language)) {
			throw new CustomUncheckedException(language + " already exists");
		} else {
			// insert language to ArrayList
			languages.add(language);
			System.out.println(language + " is added to the ArrayList");
		}
	}

	public static void main(String[] args) {

		// create object of Main class
		Q1_Unchecked obj = new Q1_Unchecked();

		// check if language already present

//		try {
//			obj.checkLanguage("Swift");
//			obj.checkLanguage("Java");
//
//		} catch (CustomUncheckedException e) {
//			System.out.println(e + ":  Exception Occured");
//		}
		// obj.checkLanguage("Java");

		System.out.println("here");
	}
}