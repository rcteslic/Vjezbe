package exeption;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class ScannerReader {
    public static void main(String[] args) throws IOException {

        Path path = Paths.get("scores.txt");
        Scanner input = new Scanner(path);
        ArrayList<Student> studenti = new ArrayList<>();
        while (input.hasNext()) {

            String firstName = input.next();
            String lastName = input.next();
            int score = input.nextInt();

            Student student = new Student(firstName, lastName, score);

            studenti.add(student);

        }

        for (Student student : studenti) {
            System.out.println(student);
        }

        input.close();

    }

}
