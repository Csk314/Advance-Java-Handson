package Demo09NestedClasses;

//Demo showing how to access enclosed class members in the inner class
class A {
	String inA;

	public void printSomething(String str) {
		System.out.println("In A(outer) " + str);

	}

	class B {
		public void printSomething(String str) {
			System.out.println("In B(inner) " + str);
			A.this.inA = "Hello Updated in B";
			System.out.println(A.this.inA);

			A.this.printSomething("calling inside B");
			// To access outer/enclosed class variables u have to use
			// OuterClassName.this.variable_name

		}
	}
}

class InnerClassDemo {
	public static void main(String[] args) {
		A a = new A();
		A.B b = a.new B();

		b.printSomething("hello");

	}
}