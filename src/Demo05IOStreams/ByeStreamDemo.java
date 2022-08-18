package Demo05IOStreams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByeStreamDemo {
	public static void main(String[] args) throws IOException {
		FileOutputStream outStream = null;
		FileInputStream inputStream = null;

		try {
			inputStream = new FileInputStream("F:\\AdvancedJava\\serializationtest\\source.txt");
			outStream = new FileOutputStream("F:\\AdvancedJava\\serializationtest\\destination2.txt");

			int content;
			while ((content = inputStream.read()) != -1) {
				outStream.write((byte) content);
			}

		} catch (Exception e) {
			System.out.println(e);
		} finally {
			if (inputStream != null) {
				inputStream.close();
			}
			if (outStream != null) {
				outStream.close();
			}
		}

	}
}
