package exeption;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class UpisivacPodataka {

    public static void upis() throws IOException {
        Path path = Paths.get("sua.tx");
        BufferedWriter bufferedWriter = Files.newBufferedWriter(path);
        for (int i = 0; i < 19; i++) {
            bufferedWriter.write(i + " Milan Jovanovic");
            bufferedWriter.close();
        }
    }
}

