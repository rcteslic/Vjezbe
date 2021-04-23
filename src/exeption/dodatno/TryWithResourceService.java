package exeption.dodatno;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TryWithResourceService {
    public void write(String filename, String mssg) throws FileNotFoundException {
        try (PrintWriter writer = new PrintWriter(filename)) {
            writer.println(mssg);
        }
    }

    public void writeV2(String filename, String mssg)  {
        try {
            PrintWriter writer = new PrintWriter(filename);
            writer.println(mssg);
        }
        catch (FileNotFoundException e){
            System.out.println("Exeption: "+e);
        }

    }
}

