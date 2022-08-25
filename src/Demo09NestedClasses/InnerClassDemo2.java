package Demo09NestedClasses;
//Demo showing that we can declare inner class inside inner class

class A1 {
	// String msg;
	public void getmsg(String msg) {
		System.out.println("Hi from outermost class A1" + msg);
	}

	class B {
		public void getmsg(String msg) {
			System.out.println("Hi from inner class B" + msg);
		}

		class C {
			public void getmsg(String msg) {
				System.out.println("Hi from C class" + msg);
			}
		}

	}

}

public class InnerClassDemo2 {
	public static void main(String[] args) {
		A1 a = new A1();
		A1.B b = a.new B();
		A1.B.C c = b.new C();

		c.getmsg("Hi");
	}
}
