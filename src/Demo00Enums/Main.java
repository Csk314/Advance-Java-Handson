package Demo00Enums;

public class Main {
	public static void main(String[] args) {
		Color c1 = Color.RED;
		System.out.println("Name of Enum C1: " + c1.name());
		System.out.println("Value of Enum C1: " + c1.getValue());
		System.out.println("===============================");
		// Iteration over enum

		for (Color c : Color.values()) {
			System.out.println("Name of Enum C1: " + c.name());
			System.out.println("Value of Enum C1: " + c.getValue());
		}

	}
}
