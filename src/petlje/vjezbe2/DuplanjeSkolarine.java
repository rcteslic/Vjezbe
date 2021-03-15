package petlje.vjezbe2;

public class DuplanjeSkolarine {
    /*

    Zamislimo  da  se cijena  skolarine  na  univerzitetu  5.000  KM godisnje
      i   da  se  povecava  svake  godine  za  7%.
      Za koliko  godina  ce  se  cijena  skolarine  uduplati?
      */


    public static void main(String[] args) {
        double cjenaSkolarine = 5000;
        double duplaCijenaSkolarine = cjenaSkolarine * 2;
        final double POVECANJE_SKOLARINE = 1.07;
        int brojGodina = 0;

        while (cjenaSkolarine <= duplaCijenaSkolarine) {
            brojGodina++;
            cjenaSkolarine *= POVECANJE_SKOLARINE;
        }
        System.out.println(brojGodina);


    }


}
