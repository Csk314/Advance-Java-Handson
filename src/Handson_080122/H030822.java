package Handson_080122;

import java.util.Arrays;
import java.util.Scanner;

public class H030822 {
	// 3rd program
	static int findIndex(int a, int arr[]) {
		int index = -1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == a) {
				index = i;
			}

		}

		return index;

	}

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.Name = "Csb";
		s1.rollno = 3;
		s1.address = "BLR";

		Student s2 = new Student();
		s2.getAddress();
		s2.Name = "ansdasddsan";
		s2.rollno = 5;
		s2.address = "sdfnkjsfn";

		System.out.println("Student 1 details: " + s1.getName() + " " + s1.getRollno() + " " + s1.getAddress());
		System.out.println("Student 2 details: " + s2.getName() + " " + s2.getRollno() + " " + s2.getAddress());

		// 2nd program
		int a[] = new int[10];
		System.out.println("Enter array elements");
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}

		for (int i : a) {
			System.out.print(i + " ");
		}

		System.out.println("Find index");
		System.out.println("Index of 4 in the array is :" + findIndex(4, a));

		// 4th problem
		Arrays.sort(a);
		System.out.println("MAx is :" + a[a.length - 1]);
		System.out.println("Min is :" + a[0]);

	}
}

class Student {
	String Name;
	int rollno;
	String address;

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getName() {
		return Name;
	}

	public int getRollno() {
		return rollno;
	}

}