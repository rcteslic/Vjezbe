package selekcije;

import java.util.Scanner;

public class LogickiOperatori {
     //  ! Not - pretvara true u false, false u true - negacija.

     //  && And - vraća true samo ukoliko su oba uslova ispunjena

     //  || Or - vraća true ukoliko je jedan od oba uslova ispunjen

     //  ^ Xor - vraća true ukoliko oba uslova rezultiraju sa različitim boolean
//  vrijednostima - logičko isključenje.
    public static void main(String[] args) {
        double visina = 1.85;
        double tezina = 94;

        double rezultat = tezina/(Math.pow(visina, 2));
        System.out.println(rezultat);
        Scanner sc = new Scanner(System.in);
        System.out.print("Input weight in kilogram: ");
        double weight = sc.nextDouble();
        System.out.print("\nInput height in meters: ");
        double height = sc.nextDouble();
        double BMI = weight / (height * height);
        System.out.print("\nThe Body Mass Index (BMI) is " + BMI + " kg/m2");

        //  Ovo može biti zbunjujuće na početku, stoga pogledajmo kako se ovi operatori koriste u programima. Zamislimo da trebamo napisati program koji pita korisnika da unese jedan broj. Nakon što je korisnik unio broj, program ispisuje korisniku da li je taj broj:

        //  1. Djeljiv sa 2 i sa 3 (and)
        //         2. Djeljiv sa 2 ili 3 (or)
        //         3. Djeljiv sa 2 ili 3 ali ne sa oba broja (xor)

        // napraviti novi Scanner objekt
        Scanner unos = new Scanner(System.in);

        // pitati korisnika da unese broj, dodijeliti ga varijabli
        System.out.println("Molimo vas unesite cijeli broj: ");
        int broj = unos.nextInt();

        // provjeriti da li je broj djeljiv sa 2 i 3
        if (broj % 2 == 0 && broj % 3 == 0) {
            System.out.println("Broj " + broj + " je djeljiv i sa 2 i sa 3.");
        }

        // provjeriti da li je broj djeljiv sa 2 ili 3
        if (broj % 2 == 0 || broj % 3 == 0) {
            System.out.println("Broj " + broj + " je djeljiv sa 2 ili sa 3.");
        }

        // provjeriti da li je broj djeljiv sa 2 ili sa 3 ali ne oba
        if (broj % 2 == 0 ^ broj % 3 == 0) {
            System.out.println("Broj " + broj + " je djeljiv sa 2 ili sa 3 ali ne oba broja.");
        }
        // zatvoriti Scanner
        unos.close();
    }
}
