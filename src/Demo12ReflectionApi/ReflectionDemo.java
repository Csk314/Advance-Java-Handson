package Demo12ReflectionApi;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionDemo {
	public static void main(String[] args)
			throws IllegalArgumentException, IllegalAccessException, InvocationTargetException {
		Cat cat = new Cat("Scarlett", 37);
		Field[] fields = cat.getClass().getDeclaredFields();

		for (Field f : fields) {
			// System.out.println(f.getName());
			if (f.getName().equals("name")) {
				f.setAccessible(true);
				f.set(cat, "Stella"); // setting private final feild using Reflection
			}

		}
		System.out.println(cat.getName());
		System.out.println(cat.getAge());

		Method[] methods = cat.getClass().getDeclaredMethods();
		for (Method m : methods) {
			if (m.getName().equals("heyThisIsPrivate")) { // invoking a private method
				m.setAccessible(true);
				m.invoke(cat);
				// cat.heyThisIsPrivate();
			}
			if (m.getName().equals("PrivateMsg")) { // invoking a private method with param
				m.setAccessible(true);
				m.invoke(cat, "hello world");
			}
			if (m.getName().equals("thisIsAPrivateStaticMethod")) {
				m.setAccessible(true);
				m.invoke(null);
			}

			if (m.getName().equals("thisIsAPublicStaticMethod")) {
				m.setAccessible(true);
				m.invoke(null, "Hey There!!");
			}
		}
	}
}
