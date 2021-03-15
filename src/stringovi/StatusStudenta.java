package stringovi;

import java.util.Map;
import java.util.Scanner;

/*(Student major and status) Write a program that prompts the user to enter two
characters and displays the major and status represented in the characters. The first
character indicates the major and the second is number character 1, 2, 3, 4, which
indicates whether a student is a freshman, sophomore, junior, or senior. Suppose
the following chracters are used to denote the majors:

prvi karakter
M: Mathematics
C: Computer Science
I: Information Technology
Here is a sample run:*/
public class StatusStudenta {
    public static void main(String[] args) {
        System.out.println("Unesite...");
        Scanner scanner = new Scanner(System.in);
        String unos = scanner.next();
        var predmeti = Map.of("M", "Matemathics", "C", "Computer", "I", "Information");
        var ocjene = Map.of("1", "freshman", "2", "sophomore", "3", "junior", "4", "senior");

        String rezultat = predmeti.get(String.valueOf(unos.charAt(0))) + " " + ocjene.get(String.valueOf(unos.charAt(1)));
        String konacanRez = (!rezultat.contains("null")) ? rezultat : "Invalidan unos";
        System.out.println(konacanRez);
    }
}

