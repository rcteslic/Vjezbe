package osnoveProgramiranja;

import java.util.Scanner;

public class Pdv {
    public static void main(String[] args) {
        // 0 algoritam
        // 1) obavjestiti korisnika da unese neku sumu
        final double STOPA_PDV_A = 1.17;
        System.out.println("Unesite vrjednost da izracunamo pdv za nju:");
        // 2) trebamo uzeti podatak iz konzole
        Scanner scanner = new Scanner(System.in);
        double unesenaVrjednost = scanner.nextDouble();
        // 3) izracunati
        double sumaSaPdvOm = unesenaVrjednost * STOPA_PDV_A;
        // 3) ispisati rezultat
        System.out.println("Ukupan iznos sa pdv-om: " + sumaSaPdvOm);
    }
}
