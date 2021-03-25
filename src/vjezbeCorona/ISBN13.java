package vjezbeCorona;

public class ISBN13 {
    // 10 - (d 1 + 3d 2 + d 3 + 3d 4 + d 5 + 3d 6 + d 7 + 3d 8 + d 9 + 3d 10 + d 11 + 3d 12 )%10
    public static void main(String[] args) {
          String unos = "978013213080";
        // String unos = "978013213079";  nula na kraju mora biti
        // String unos = "97801320"; invalidan unos
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
        if (zadnjaCifra == 10) {
            zadnjaCifra = 0;
        }

        System.out.println(unos + zadnjaCifra);
    }
}
