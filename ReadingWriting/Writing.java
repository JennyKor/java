
import java.io.*;

public class Writing {
	public static void main(String[] args) {

		final String FileName = "out.txt";
		final int N = 10;

		try {
			// Create File object
			File file = new File(FileName);

			// Clear output stream and
			// attach it to the File
			FileOutputStream outputstream = new FileOutputStream(file);

			// create stream for writing
			PrintWriter writer = new PrintWriter(outputstream, true);

			// Writing to the file
			for (int i = 0; i < N; i++)
				writer.println("Hello " + i);

			// Close the file
			writer.close();
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}