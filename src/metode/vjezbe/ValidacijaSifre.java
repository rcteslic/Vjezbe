package metode.vjezbe;

public class ValidacijaSifre {
    /*
 A password must have at least eight characters.
A password consists of only letters and digits.
A password must contain at least two digits
    * */

    public static boolean daLiJeValidna(String sifra) {
        final int MIN_BROJEVA = 2;
        final int MIN_BROJ_KARAKTERA = 9;
        boolean validnaSifra = true;
        int brojac = 0;
        if (sifra.length() < MIN_BROJ_KARAKTERA) {
            System.out.println("Invalid sifra, nema dovoljno karaktera");
            validnaSifra = false;
        }

        for (int i = 0; i < sifra.length(); i++) {
            char karakter = sifra.charAt(i);
            if (!Character.isLetterOrDigit(karakter)) {
                System.out.println("Invalid sifra, sadrži specificne karaktere");
                validnaSifra = false;
            }

            if (Character.isDigit(karakter)) {
                brojac++;
            }
        }
        if (brojac < MIN_BROJEVA) {
            System.out.println("Minimalno dva broja moraju biti");
            validnaSifra = false;
        }
        return validnaSifra;
    }
}
