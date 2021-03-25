package vjezbeCorona;

public class ISBN13 {
    // 10 - (d 1 + 3d 2 + d 3 + 3d 4 + d 5 + 3d 6 + d 7 + 3d 8 + d 9 + 3d 10 + d 11 + 3d 12 )%10
    public static void main(String[] args) {
        // Ovdje treba sa Skenerom uhvatiti od korisnika unos, aj sam  uprostio sa ove tri varijante iz knjige
         String unos = "978013213080";
        //  String unos = "978013213079";   nula na kraju mora biti
        // String unos = "97801320"; invalidan unos
        // odma na startu odradio provjeru , ako je invalidan unos domah prekidam dalji tok programa
        if (unos.length() != 12) {
            System.out.println("Invalidan input");
            System.exit(400);
        }
        int d = 0;
        for (int i = 0; i < unos.length(); i++) {
            if (i % 2 == 0) {
                d += Character.getNumericValue(unos.charAt(i));
            } else {
                d += Character.getNumericValue(unos.charAt(i)) * 3;
            }
        }

        int zadnjaCifra = 10 - d % 10;

        // ternarni operator idealan za ovo
        zadnjaCifra = (zadnjaCifra == 10) ? 0 : zadnjaCifra;

        System.out.println(unos + zadnjaCifra);
    }
}
