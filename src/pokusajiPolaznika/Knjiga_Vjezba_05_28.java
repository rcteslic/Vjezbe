package pokusajiPolaznika;

import java.util.Scanner;
public class Knjiga_Vjezba_05_28 {
    public static void main(String[] args) {
        Scanner unos = new Scanner(System.in);
        System.out.println("Unesite godinu: ");
        int godina = 2013;
        System.out.println("Unesite prvi dan u godini: ");
        int prviDan = 2;
        String konacniRezultat = "";

        for (int i = 1; i <= 12; i++) {

            switch (i) {
                case 1:
                    konacniRezultat = "Januar 1";
                    break;
                case 2:
                    konacniRezultat = "Februar 1";
                    break;
                case 3:
                    konacniRezultat = "Mart 1";
                    break;
                case 4:
                    konacniRezultat = "April 1";
                    break;
                case 5:
                    konacniRezultat = "Maj 1";
                    break;
                case 6:
                    konacniRezultat = "Jun 1";
                    break;
                case 7:
                    konacniRezultat = "Jul 1";
                    break;
                case 8:
                    konacniRezultat = "Avgust 1";
                    break;
                case 9:
                    konacniRezultat = "Septembar 1";
                    break;
                case 10:
                    konacniRezultat = "Oktobar 1";
                    break;
                case 11:
                    konacniRezultat = "Novembar 1";
                    break;
                case 12:
                    konacniRezultat = "Decembar 1";
                    break;
            }

            prviDan  =prviDan% 7;

            switch (prviDan) {
                case 1:
                    System.out.println(konacniRezultat + ", je " + " ponedeljak");
                    break;
                case 2:
                    System.out.println(konacniRezultat + ", je " + " utorak");
                    break;
                case 3:
                    System.out.println(konacniRezultat + ", je " + " srijeda");
                    break;
                case 4:
                    System.out.println(konacniRezultat + ", je " + " četvrtak");
                    break;
                case 5:
                    System.out.println(konacniRezultat + ", je " + " petak");
                    break;
                case 6:
                    System.out.println(konacniRezultat + ", je " + " subota");
                    break;
                case 0:
                    System.out.println(konacniRezultat + ", je " + " nedelja");
                    break;

            }

            if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12) {
                prviDan += 31;
            } else if (i == 4 || i == 6 || i == 9 || i == 11) {
                prviDan += 30;
            } else {
                if ((godina % 4 == 0 && godina % 100 != 0) || (godina % 400 == 0)) {
                    prviDan += 29;
                } else {
                    prviDan += 28;
                }

            }

        }

    }

}

/*
prvi dan u mjesecu FEBRUARU je: petak
prvi dan u mjesecu MARTU je: petak
prvi dan u mjesecu APRILU je: ponedeljak
prvi dan u mjesecu MAJU je: srjeda
prvi dan u mjesecu JUNU je: subota
prvi dan u mjesecu JULU je: ponedeljak
prvi dan u mjesecu AVGUSTU je: cetvrtak
prvi dan u mjesecu SEPTEMBRU je: nedelja
prvi dan u mjesecu OKT je: utorak
prvi dan u mjesecu NOVEMBRU je: petak
prvi dan u mjesecu DECEMBRU je: nedelja*/
