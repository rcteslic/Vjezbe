package exeption.dodatno;

import exeption.Magacin;
import exeption.UpisivacPodataka;

import java.io.IOException;
import java.util.ArrayList;

public class MainEx {
    public static void main(String[] args) {
        Magacin magacin = new Magacin("Nova 4");
        ArrayList<String> magacioneri = magacin.getImenaMagacionera();
        String magacioner= "Pero";
        try {
            magacioneri.add(magacioner);
        }
        catch (NullPointerException exception){
            System.out.println("Magacioner " + magacioner +" nije dodat u listu...");
        }
        System.out.println("Magacioneri "+magacioneri);
        System.out.println("Nastavak naseg programa");
    }
}
