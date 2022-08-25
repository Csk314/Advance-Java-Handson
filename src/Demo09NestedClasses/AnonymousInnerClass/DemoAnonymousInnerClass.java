package Demo09NestedClasses.AnonymousInnerClass;

class Outer {
	public void print() {
		System.out.println("Print method in Outer Class");
	}
}

public class DemoAnonymousInnerClass {
	static Outer o1 = new Outer() {
		String x = "hello";

		@Override
		public void print() {
			System.out.println("print method in anonymous class");
		}

//		public void hello() {
//			System.out.println(x);
//		}
	};

	public static void main(String[] args) {
		o1.print();
		// o1.hello();

	}
}
