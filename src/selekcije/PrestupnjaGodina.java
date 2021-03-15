package selekcije;

public class PrestupnjaGodina {
    public static void main(String[] args) {
        // Godina je prestupna ukoliko je djeljiva sa 4 ali ne sa 100 ili ako je djeljiva sa 400.
        //Дакле године 1800, 1900. и 2100. нису преступне, док 1600, 2000. и 2400. јесу
        int godina = 1600;

        if ((godina % 4 == 0 && godina % 100 != 0) || (godina % 400 == 0)) {
            System.out.println("Prestupna");
        } else
            System.out.println("Nije prestupna");
    }
}
