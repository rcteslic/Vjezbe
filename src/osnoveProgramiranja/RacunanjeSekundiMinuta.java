package osnoveProgramiranja;

import java.util.Scanner;

public class RacunanjeSekundiMinuta {
    public static void main(String[] args) {
        // vrjednosti koje imamo
        int ukupnoSekundi;
        int minute;
        int ostatakSekundi;
        final int SEKUNDI_U_MINUTI = 60;

        //pitamo kor
        System.out.println("Unesite sekunde:");

        //unos cjelog broja
        Scanner unos = new Scanner((System.in));
        ukupnoSekundi = unos.nextInt();

        //racunanje minuta

        minute = ukupnoSekundi / SEKUNDI_U_MINUTI;

        // racunanje sekundi
        ostatakSekundi = ukupnoSekundi % SEKUNDI_U_MINUTI;

        // ispis
        System.out.println("minute = " + minute);
        System.out.println("ostatakSekundi = " + ostatakSekundi);

        //Napisati program koji pita korisnika da unese broj sekundi kao cijeli broj.
        // Na osnovu broja kojeg korisnik unese, program ispisuje broj minuta i sekundi.
        //
        //Primjer:
        //
        //Unesite broj sekundi: 500
        //500 sekundi je 8 minuta i 20 sekundi.
    }
}
