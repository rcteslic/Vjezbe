package selekcije;

import java.util.Scanner;

public class Ocjene {

    /*Napisati program koji pita korisnika da unese broj bodova
    (od 0 d0 100) koje je dobio na testu.
     Na osnovu broja bodova koje korisnik unese,
     program ispisuje ocjenu koju je korisnik zaslužio.

            90 – 100 → ocjena 10			60 – 69 → ocjena 7
            80 – 89 → ocjena 9				50 – 59 → ocjena 6
            70 – 79 → ocjena 8				0 – 49 → korisnik nije položio ispit*/
    public static void main(String[] args) {
        int bodovi = 0;
        System.out.println("Unesite broj bodova: ");
        Scanner scanner = new Scanner(System.in);
        bodovi = 65;
        if (bodovi >= 90) {
            System.out.println("Ocjena je 10");
        } else if (bodovi >= 80) {
            System.out.println("Ocjena je 9");
        } else if (bodovi >= 70) {
            System.out.println("Ocjena je 8");
        } else if (bodovi >= 60) {
            System.out.println("Ocjena je 7");
        } else if (bodovi >= 50) {
            System.out.println("Ocjena je 6");
        } else {
            System.out.println("Niste polozili");
        }
    }
}
