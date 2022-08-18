package Handson_080122;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayListEg {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("abc");
		list.add("123");
		list.add("hello");
		list.add("xyzz");
		System.out.println("===============Iterating using For loop =====================");

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("===============Iterating using For each loop =====================");
		for (String s : list) {
			System.out.println(s);
			// System.out.println(s + "s.charAt(1) " + s.charAt(1));

		}

		ListIterator<String> it = list.listIterator();
		System.out.println("===============Iterating using ListIterator =====================");
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		System.out.println("===============Rev using ListIterator =====================");
		while (it.hasPrevious()) {
			System.out.println(it.previous());
		}
	}
}
