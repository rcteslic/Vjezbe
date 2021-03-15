package petlje;

import java.util.Scanner;

public class OduzimanjeDvaBrojaPetlja {
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
        Scanner unos = new Scanner(System.in);
        rezultat = prviBroj - drugiBroj;
        do{
            System.out.print("Koliko iznosi " + prviBroj + " - " + drugiBroj + " : ");
            odgovorKorisnika = unos.nextInt();
        }
        while (rezultat != odgovorKorisnika);

        System.out.println("Tacan rezultat");
    }
}

