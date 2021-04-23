package exeption;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class BufferedReaderTest {

	public static void main(String[] args) throws IOException {
		Path path = Paths.get("scores.txt");
		BufferedReader reader = Files.newBufferedReader(path);
		String line;

		while ((line = reader.readLine()) != null) {
			System.out.println(line);
		}

		reader.close();

	}

}
