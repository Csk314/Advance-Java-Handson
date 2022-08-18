package Handson_080122;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternDemo {
	public static void main(String[] args) throws IOException {
		FileReader reader = null;
		// FileWriter writer = null;
		BufferedWriter writer = new BufferedWriter(new FileWriter("F:\\AdvancedJava\\pattern\\destination.txt"));
		String str = "";
		try {
			reader = new FileReader("F:\\AdvancedJava\\pattern\\source.txt");

			int content;
			while ((content = reader.read()) != -1) {

				str += (char) content;

			}

		} catch (Exception e) {
			System.out.println(e);
		} finally {

			if (reader != null) {
				reader.close();
			}
		}
		System.out.println("Printing the String read from source.txt");
		System.out.println(str);

		String regex = "\\d+"; // or \d
		String regex2 = "[~!@#$%^&*()_+{}\\\\\\\\[\\\\\\\\]:;,.<>/?-]+";

		Pattern p = Pattern.compile(regex);
		Pattern p2 = Pattern.compile(regex2);

		Matcher m = p.matcher(str);

		Matcher m2 = p2.matcher(str);
		BufferedWriter bf = new BufferedWriter(writer);
		String text = "";
		while (m.find()) {
			// System.out.println(m.group());
			text += " " + m.group();

		}
		while (m2.find()) {
			// System.out.println(m2.group());
			text += " " + m2.group();

		}
		try {
			writer.write(text);
			writer.flush();
		} catch (IOException e) {
			System.out.println(e);
		}

	}
}
