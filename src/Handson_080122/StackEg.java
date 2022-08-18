package Handson_080122;

import java.util.Stack;

public class StackEg {
	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();
		stack.push("one");
		stack.push("two");
		stack.push("three");
		stack.push("four");

		System.out.println("stack :" + stack);

		System.out.println("peek method: " + stack.peek());

		System.out.println("pop method: " + stack.pop());

		System.out.println("After pop : " + stack);

		System.out.println("peek method: " + stack.peek());

		System.out.println("Isempty " + stack.isEmpty());

		System.out.println("Search three :" + stack.search("three"));
	}

}
