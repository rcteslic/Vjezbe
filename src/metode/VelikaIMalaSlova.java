package metode;

import java.util.Scanner;

public class VelikaIMalaSlova {
    public static void main(String[] args) {
        int brojacVelikihSlova = 0;
        int brojacMalihSlova = 0;
        Scanner scanner = new Scanner(System.in);
        String unosOdKorisnika = scanner.nextLine();

        for (int i = 0; i < unosOdKorisnika.length(); i++) {
            // ispitati da li je veliko slovo
            if (Character.isUpperCase(unosOdKorisnika.charAt(i))) {
                brojacVelikihSlova++;
            }
            if (Character.isLowerCase(unosOdKorisnika.charAt(i))) {
                brojacMalihSlova++;
            }
        }
        System.out.println(brojacVelikihSlova + ": mala-->" + brojacMalihSlova);
    }
}
