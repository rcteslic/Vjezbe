package petlje;

import java.util.Scanner;

public class PogadjanjeNasumicnogBroja {
    /*
    Napisati program koji generiše cijeli, nasumičan broj u rasponu od 0 do 10 te pita korisnika da pogodi koji je broj
    generisan.

 Ukoliko korisnik unese veći broj od generisanog, program ispisuje da je
 broj veći te pita korisnika da pokuša ponovo sa manjim brojem. Ukoliko unese manji - pokušaj ponovo sa većim brojem.
     */
    public static void main(String[] args) {
        int generisaniBroj = (int) (Math.random() * 10);
        int klijentovUnos;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pogodite nasumicno generisani br: " + generisaniBroj);
        do {
            klijentovUnos = scanner.nextInt();
            if (klijentovUnos > generisaniBroj) {
                System.out.println("Unesite manju vrjednost");
            } else {
                System.out.println("Unesite vecu vrjednost");
            }
        }
        while (klijentovUnos != generisaniBroj);
        System.out.println("pogodak, uneseni broj " + klijentovUnos + " odgovara generisanom: " + generisaniBroj);
    }

}
