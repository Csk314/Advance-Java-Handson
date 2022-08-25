package Demo09NestedClasses.MethodLocalinnerClass;

class OuterClass1 {
	String x = "Hello";
	String y = "OuterClass1 Y";

	public void outerClassMethod() {
		class InnerClass {
			String x = "hey";

			public void print() {
				String x = "Hi";
				System.out.println("Innerclass method:x " + x);
				System.out.println("Innerclass method:this.x " + this.x);
				System.out.println("Innerclass method:OuterClass1.this.x " + OuterClass1.this.x);
				System.out.println("Innerclass method:y " + y);
			}

			public void hello(String x, String y) {
				System.out.println("here in method hello");
				System.out.println(x);
				System.out.println(y);
			}
		}

		InnerClass obj = new InnerClass();
		obj.print();
		obj.hello("Hello", "world");
	}
}

public class DemoMethodLocal {

	public static void main(String[] args) {
		OuterClass1 outerObj = new OuterClass1();
		outerObj.outerClassMethod();

	}

}
