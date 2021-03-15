package petlje;

import java.util.Scanner;

public class OduzimanjeDvaBroja {
    // Napisati program koji generiše dva cijela, nasumična broja i traži od korisnika da odgovori na pitanje tipa:
    // “Koliko je 8 - 3?” gdje su 8 i 3 nasumično generisani brojevi. Ispisati rezultat korisniku -
    // ako je tacan, cestitati ako nije - ispisati tacan odgovor.

    // Ukoliko je prvi generisani broj manji od drugog, program treba da im zamijeni pozicije
    // - rezultat oduzimanja ne smije biti negativan broj.
    public static void main(String[] args) {
        int prviBroj = (int) (Math.random() * 10) + 1;
        int drugiBroj = (int) (Math.random() * 10) + 1;
        int odgovorKorisnika;
        int rezultat;

        if (prviBroj < drugiBroj) {
            int privremenaVarijabla = drugiBroj;
            drugiBroj = prviBroj;
            prviBroj = privremenaVarijabla;
        }
        System.out.print("Koliko iznosi " + prviBroj + " - " + drugiBroj + " : ");
        Scanner unos = new Scanner(System.in);
        odgovorKorisnika = unos.nextInt();
        rezultat = prviBroj - drugiBroj;
        if (rezultat == odgovorKorisnika) {
            System.out.println("Cestitamo, tacan rezultat.");
        } else {
            System.out.println("Niste pogodili, tacan rezultat je: " + rezultat);
        }
    }
}

