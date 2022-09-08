package Demo12ReflectionApi;

public class Cat {

	private final String name;
	private int age;

	public Cat(String name, int age) {
		this.name = name;
		this.age = age;

	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void meow() {
		System.out.println("MEow");
	}

	private void heyThisIsPrivate() {
		System.out.println("Private method invoked");
	}

	private void PrivateMsg(String msg) {
		System.out.println("Private Message:" + msg);
	}

	private static void thisIsAPrivateStaticMethod() {
		System.out.println("This is a thisIsAPrivateStaticMethod");
	}

	public static void thisIsAPublicStaticMethod(String msg) {
		System.out.println("This is a Public and Static method:" + msg);
	}
}
