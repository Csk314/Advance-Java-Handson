package Demo02Serialization;

import java.io.Serializable;

public class Student implements Serializable {

	/**
	 * Default serial Version Universal ID
	 */
	static final long serialVersionUID = 1L;
	int rollno;
	String name;
	int age;
	String address;
	transient int x;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Student(int rollno, String name, int age, String address) {

		this.rollno = rollno;
		this.name = name;
		this.age = age;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [getRollno()=" + getRollno() + "," + " getName()=" + getName() + ", getAge()=" + getAge()
				+ ", getAddress()=" + getAddress() + " getX()" + getX() + "]";
	}

}
