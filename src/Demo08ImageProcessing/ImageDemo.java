package Demo08ImageProcessing;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ImageDemo {
	public static void main(String[] args) {
		// width of the image
		int width = 963;

		// height of the image
		int height = 640;

		// For storing image in RAM
		BufferedImage image = null;
		try {
			File input_file = new File("F:\\AdvancedJava\\img_processing\\img.png");

			// image file path create an object of
			// BufferedImage type and pass as parameter the
			// width, height and image int
			// type. TYPE_INT_ARGB means that we are
			// representing the Alpha , Red, Green and Blue
			// component of the image pixel using 8 bit
			// integer value.

			image = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);

			// Reading input file
			image = ImageIO.read(input_file); // it appends the read data to the image object

			System.out.println("Reading complete.");
		} catch (IOException e) {
			System.out.println("Error: " + e);
		}
		// WRITE IMAGE
		try {
			// Output file path
			File output_file = new File("F:\\AdvancedJava\\img_processing\\output.png");

			// Writing to file taking type and path as
			ImageIO.write(image, "png", output_file);

			System.out.println("Writing complete.");
		} catch (IOException e) {
			System.out.println("Error: " + e);
		}
	} // main() ends here

}
