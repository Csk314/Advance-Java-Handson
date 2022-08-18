package Demo01Annotations;

import java.lang.reflect.Method;

public class Main {

	@MyAnnotation(value = 5, a = "abc") // using custom annotation over myMethod
	public void myMethod() {
		System.out.println("Inside My method");
	}

	public static void main(String[] args) throws Exception {
		Main m1 = new Main();

		Method method = m1.getClass().getMethod("myMethod");

		MyAnnotation myAnnotation = method.getAnnotation(MyAnnotation.class);

		System.out.println(myAnnotation.value());
		System.out.println(myAnnotation.a());
	}
}