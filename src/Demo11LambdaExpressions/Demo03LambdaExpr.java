package Demo11LambdaExpressions;

interface Test {
	public abstract void add(int a, int b);

	default void hello1() {
		System.out.println("Hello Class Test1");
	}

	default void hello2() {
		System.out.println("Hello Class Test2");
	}

	default void hello3() {
		System.out.println("Hello Class Test3");
	}

}

public class Demo03LambdaExpr {
	public static void main(String[] args) {
		Test t1 = (a, b) -> {
			System.out.println("sum is :" + (a + b));
		};
		t1.hello1();
		t1.hello2();
		t1.hello3();
		t1.add(3, 4);
	}
}
