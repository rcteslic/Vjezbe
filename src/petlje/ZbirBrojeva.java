package petlje;

import java.util.Scanner;

public class ZbirBrojeva {
    /*
    Napisati program koji pita korisnika da unosi cijele brojeve
     sve dok korisnik ne unese 0.
   Kada korisnik unese nulu, program ispisuje zbir
    svih unesenih brojeva, prosjek svih unesenih brojeva te završava sa radom.
     */

    public static void main(String[] args) {
        System.out.println("Unesite cjele brojeve....");
        Scanner scanner = new Scanner(System.in);
        int unosOdStraneKorisnika = -1;
        int zbirUnesenihBrojeva = 0;
        double prosjek = 0;
        int brojac = -1;

        while (unosOdStraneKorisnika != 0) {
            // izbacimo iz petlje ako unese 0
            unosOdStraneKorisnika = scanner.nextInt();
            zbirUnesenihBrojeva = unosOdStraneKorisnika + zbirUnesenihBrojeva;
            // brojac = brojac +1;
            brojac++;
        }

        System.out.println("zbirUnesenihBrojeva: " + zbirUnesenihBrojeva);
        prosjek = (double) zbirUnesenihBrojeva / brojac;
        System.out.println(prosjek);
    }
}
