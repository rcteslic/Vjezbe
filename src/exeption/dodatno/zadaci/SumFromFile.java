package exeption.dodatno.zadaci;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class SumFromFile {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        System.out.println("Uneste iem fajla");
        String imeFajla = input.next();
        Path path = Paths.get(imeFajla + ".txt");
        Scanner reader = new Scanner(path);
        int suma =0;
        while (reader.hasNext()) {
            int number = reader.nextInt();
            suma+=number;

        }
        input.close();
        reader.close();
        System.out.println(suma);
    }
}
