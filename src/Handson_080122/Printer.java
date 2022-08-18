package Handson_080122;

public class Printer {
	private String name;
	private String model;
	private int year;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

//	Printer(String name, String model, int year) {
//		this.name = name;
//		this.model = model;
//		this.year = year;
//	}

	public void print() {
		System.out.println("Printing");
	}

	public void scan() {
		System.out.println("Scanning");
	}

}
