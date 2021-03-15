package selekcije;

import java.util.Scanner;

public class Bodovi {
    public static void main(String[] args) {
        Scanner unos = new Scanner(System.in);
        System.out.print("Unesite broj ostvarenih bodova: ");
        double bodovi = unos.nextDouble();


        if (bodovi >= 90.0) {
            System.out.println("Ocjena koju ste ostvarili je 10.");
        } else if (bodovi >= 80.0) {
            System.out.println("Ocjena koju ste ostvarili je 9.");
        } else if (bodovi >= 70) {
            System.out.println("Ocjena koju ste ostvarili je 8.");
        } else if (bodovi >= 60) {
            System.out.println("Ocjena koju ste ostvarili je 7.");
        } else if (bodovi >= 50) {
            System.out.println("Ocjena koju ste ostvarili je 6.");
        } else {
            System.out.println("Žao nam je, niste položili ispit.");
        }
    }
}
