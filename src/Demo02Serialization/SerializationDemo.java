package Demo02Serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationDemo {
	public static void main(String[] args) {
		Student s1 = new Student(3, "Chandu", 25, "Bangalore");
		s1.setX(10);

		String filename = "F:\\AdvancedJava\\serializationtest\\test.txt";
		FileOutputStream fileOut = null;
		ObjectOutputStream objOut = null;

		try {
			fileOut = new FileOutputStream(filename);
			objOut = new ObjectOutputStream(fileOut);
			objOut.writeObject(s1); // serializing obj

			objOut.close();
			fileOut.close();

			System.out.println("Object has been serialized " + s1);
		} catch (IOException e) {
			System.out.println("IoException occured 1" + e);
		}

		// deserialization

		FileInputStream fileIn = null;
		ObjectInputStream objIn = null;

		try {
			fileIn = new FileInputStream(filename);
			objIn = new ObjectInputStream(fileIn);

			Student object = (Student) objIn.readObject(); // deserialization

			System.out.println("Object has been deserialized");
			System.out.println(object);
			// System.out.println(object.getX());
			objIn.close();
			fileIn.close();
		} catch (IOException e) {
			System.out.println("IoException occured 2" + e);
		} catch (ClassNotFoundException e) {
			System.out.println("Class Not found exception " + e);
		}

	}
}
