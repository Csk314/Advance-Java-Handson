package Demo09NestedClasses;

//If we have same name for the outer and inner class it will give compile time error.
class Outer {
	void print() {
		System.out.println("Hello from outer");
	}

	class Outer2 { // will give compile time error if Outer class and Inner class have same name
		void print() {
			System.out.println("Hello from inner(outer 2 class)");
		}
	}
}

public class SameNameOuterandInnerDemo {
	public static void main(String[] args) {
		Outer outer = new Outer();
		Outer.Outer2 inner = outer.new Outer2();
		inner.print();

	}
}
