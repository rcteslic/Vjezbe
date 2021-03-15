package petlje;

import java.util.Scanner;

public class PrekidSaNulom2V {
    public static void main(String[] args) {
        //Napisati program koji pita korisnika da unosi cijele brojeve sve dok korisnik ne unese 0.
        //
        //Kada korisnik unese nulu, program ispisuje zbir svih unesenih brojeva,
        // prosjek svih unesenih brojeva te završava sa radom.
        int zbir = 0;
        double prosjek = 0;
        int brojacKorisnikovihUnosa = -1;
        int korisnikovUnos;

        System.out.println("Unesite cijle brojeve za koje zelite da izracunamo zbir i prosjek: ");
        Scanner scanner = new Scanner(System.in);
        korisnikovUnos = -1;

        while (korisnikovUnos != 0) {
            korisnikovUnos = scanner.nextInt();
            zbir = korisnikovUnos + zbir;
            brojacKorisnikovihUnosa = brojacKorisnikovihUnosa + 1;
        }

        prosjek = (double) zbir / brojacKorisnikovihUnosa;
        System.out.println("prosjek = " + prosjek);
        System.out.println("zbir = " + zbir);

    }
}

