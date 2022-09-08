package Demo10OptionalClass;

import java.util.Optional;

public class Demo02OptionalClass {
	public Integer sum(Optional<Integer> a, Optional<Integer> b) {
		System.out.println("First param is " + a.isPresent());
		System.out.println("Second param is" + b.isPresent());

		Integer num1 = a.orElse(15); // new Integer(15)
		Integer num2 = b.get();
		// Integer num2 = b.orElse(new Integer(50));

		return num1 + num2;
	}

	public static void main(String args[]) {
		Demo02OptionalClass od = new Demo02OptionalClass();

		Integer n1 = null;
		Integer n2 = 11; // new Integer(10);
		// System.out.println(n1+n2); // raise an exception

		Optional<Integer> a = Optional.ofNullable(n1);
		Optional<Integer> b = Optional.of(n2);
		System.out.println(od.sum(a, b));
	}
}
