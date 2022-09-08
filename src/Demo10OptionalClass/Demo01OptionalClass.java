package Demo10OptionalClass;

import java.util.Optional;

//if the value is null ofNullable returns empty instance of optional class
// else returns an instance of this Optional class with the specified value of
// the specified type.

//without if else?
public class Demo01OptionalClass {
	public static void main(String[] args) {
		String[] names = new String[8];
		Optional<String> checkNull = Optional.ofNullable(names[4]);
		if (checkNull.isPresent()) {
			String name = names[4].toLowerCase();
			System.out.println(name);
		} else {
			System.out.println("names[4] is null");
			System.out.println(checkNull);

		}

		Optional<Integer> i = Optional.ofNullable(123);
		System.out.println(i);
	}
}
