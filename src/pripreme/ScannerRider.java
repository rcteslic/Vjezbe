package pripreme;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class ScannerRider {
    public static void main(String[] args) throws IOException {

        Path path = Paths.get("src/pripreme/tablica.xlsx");
        Scanner input = new Scanner(path);
        ArrayList<Student> lista = new ArrayList<>();

        while (input.hasNext()) {
            String firstName = input.next();
            String lastName = input.next();
           // int score = input.nextInt();

            Student student = new Student(firstName, lastName, 0);

            lista.add(student);

        }

        for (Student student : lista) {
            System.out.println(student.name);
            System.out.println(student.lastName);
            System.out.println(student.score);
        }

        input.close();

    }

}
