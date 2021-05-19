package exeption;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class BuffereWriterTest {
	public static void main(String[] args) throws IOException {
		Path path = Paths.get("suma.txt");
		if (!Files.exists(path)) {
			Files.createFile(path);
		}
		Student student = new Student("Marko", "Jankovic", 11);
		Student student2 = new Student("Janko", "Markovic", 22);
		String studentString = student.toString();
		String studentString2 = student2.toString();
		BufferedWriter buffer = Files.newBufferedWriter(path);
		buffer.write(studentString);
		buffer.newLine();
        buffer.write(studentString2);
		buffer.close();
	}

}
