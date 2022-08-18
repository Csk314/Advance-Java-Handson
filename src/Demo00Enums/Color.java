package Demo00Enums;

public enum Color {

	RED("red-color"), BLUE("blue-color"), GREEN("green-color");

	private String value;

	Color(String value) {
		// TODO Auto-generated constructor stub
		this.value = value;
	}

	public String getValue() {
		return value;
	}
}
