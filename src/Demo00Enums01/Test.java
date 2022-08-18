package Demo00Enums01;

//import java.lang.Enum;
enum Color {
	RED("red-color"), BLUE("blue-color"), GREEN("green-color");

	private String value;

	void getColorandIndex() {
		System.out.println("Color is " + name());
		System.out.println("Color is " + ordinal());
	}

//	private Color() {
//		System.out.println("Constructor called for : " + this.toString());
//	}

	Color(String value) {
		this.value = value;
		System.out.println("Constructor called for value: " + value);

	}

	public String getValue() {
		return value;
	}

}

public class Test {
	public static void main(String[] args) {
		Color c1 = Color.BLUE;
		c1.getColorandIndex();

		Color arr[] = Color.values();

		for (Color col : arr) {
			// Calling ordinal() to find index
			// of color.
			System.out.println(col + " at index " + col.ordinal());
		}

		// System.out.println(Color.valueOf("RED"));
		System.out.println(c1.getValue());

	}

}
