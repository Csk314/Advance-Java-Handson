package Demo09NestedClasses.StaticNestedClass;

class Outer {
	static class InnerClass {
		public void print() {
			System.out.println("Static nested class(InnerClass) method");
		}
	}
}

public class Demo01StaticNestedClass {
	public static void main(String[] args) {
		Outer.InnerClass obj = new Outer.InnerClass();
		obj.print();
	}
}
