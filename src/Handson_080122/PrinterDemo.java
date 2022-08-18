package Handson_080122;

import java.util.Scanner;

public class PrinterDemo {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter data");
		String name = sc.next();
		String model = sc.next();
		int year = sc.nextInt();

		Printer p1 = new Printer();
//"canon", "lbp900", 2020
		p1.setName(name);
		p1.setModel(model);
		p1.setYear(year);
		// p1.name="canon"

		System.out.println(p1.getName());
		System.out.println(p1.getModel());
		System.out.println(p1.getYear());

		// (p1.model);
		p1.setName("Hp");
		p1.setModel("inkjet");

		System.out.println(p1.getName());
		System.out.println(p1.getModel());
		System.out.println(p1.getYear());
	}
}
