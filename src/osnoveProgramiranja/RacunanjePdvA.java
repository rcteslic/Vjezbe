package osnoveProgramiranja;

import java.util.Scanner;

public class RacunanjePdvA {
    // nedostaje main u novoj klasi, --zaključak pravimo ga tako što unosimo "psvm"
    public static void main(String[] args) {
        // dekleracija poznatih varijabli;
        double unosOdStraneKorisnika;
        double konacnaVrjenost;
        final double PDV = 1.17;

        // pita korisnika da unese neku vrijednost.
        // skraćenica za ispis "sout"
        System.out.println("Pozdrav, unesite vrjednost za izracunavanje pdva: ");

        // unos od strane korisnika, ponavljanjem nekoliko puta kroz primjere pokusati usvojiti komandu
        Scanner unos = new Scanner(System.in);
        System.out.print("? : ");
        unosOdStraneKorisnika = unos.nextDouble();

        // izračunava stope PDV-a
        konacnaVrjenost = PDV * unosOdStraneKorisnika;
        //ispisuje korisniku orginalnu vrijednost + PDV.

        System.out.println("konacnaVrjenost = " + konacnaVrjenost);
        //TEST
        //  Korisnik unese 10, program vrati 11.7.
    }
}

  /*  Napisati program koji pita korisnika da unese neku vrijednost.

        Nakon što je korisnik unijeo vrijednost, program izračunava stopu PDV-a te ispisuje korisniku orginalnu vrijednost + PDV.

        Korisnik unese 10, program vrati 11.7.
   */
