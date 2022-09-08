package Demo09NestedClasses.AnonymousInnerClass;

interface OuterInterface {
	void printHello();

}

public class DemoAnonymousInnerClass2 {
	static OuterInterface o1 = new OuterInterface() {
		// because we wrote outside main method so kept inside class directly and we can
		// invoke from anywhere
		@Override
		public void printHello() {
			System.out.println("Anonymous class interface");
		}
	};

	public static void main(String[] args) {
		o1.printHello();
	}
}
