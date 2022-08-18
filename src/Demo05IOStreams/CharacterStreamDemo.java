package Demo05IOStreams;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStreamDemo {
	public static void main(String[] args) throws IOException {
		FileReader reader = null;
		FileWriter writer = null;

		try {
			reader = new FileReader("F:\\AdvancedJava\\serializationtest\\source.txt");
			writer = new FileWriter("F:\\AdvancedJava\\serializationtest\\destination.txt");

			int content;
			while ((content = reader.read()) != -1) {
				writer.write((char) content);
			}

		} catch (Exception e) {
			System.out.println(e);
		} finally {
			if (writer != null) {
				writer.close();
			}
			if (reader != null) {
				reader.close();
			}
		}
	}
}
