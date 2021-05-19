package exeption.dodatno.zadaci;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WriteRandomNumbersInFile {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("text.txt");
        if (!Files.exists(path)) {
            Files.createFile(path);
        }
        BufferedWriter buffer = Files.newBufferedWriter(path);
        int random;
        for (int i = 0; i < 100; i++) {
            random = (int) (Math.random() * 100);
            buffer.write(random + " ");
        }
        buffer.close();
        Scanner reader = new Scanner(path);
        ArrayList<Integer> integersFromFile = new ArrayList<>();
        while (reader.hasNext()) {
            int numberFromFile = reader.nextInt();
            integersFromFile.add(numberFromFile);
        }
        Collections.sort(integersFromFile, Collections.reverseOrder());
        System.out.println(integersFromFile);
    }

}
