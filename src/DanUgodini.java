public class DanUgodini {
    public static void main(String[] args) {
        // januar 1, 2013 je utorak (2)
        int unesenaGodina = 2013;
        int prviDanUGodini = 2;
        int brDanaUmjesecu = 0;
        final int BR_DANA_U_SEDMICI = 7;
        int preneseniBrDana = 0;
        int trazeniDan = 0;

        brDanaUmjesecu = 31;
        preneseniBrDana = (brDanaUmjesecu % BR_DANA_U_SEDMICI);
        //prenjeli 2 dan  to znači da je petak prvi u februaru

        trazeniDan = (preneseniBrDana + prviDanUGodini) % 7;
        izracunajDanIspisiRzultat(trazeniDan, "FEBRUARU");
        if (isLeapYear(unesenaGodina)) {
            brDanaUmjesecu = 29;
            preneseniBrDana = (brDanaUmjesecu % BR_DANA_U_SEDMICI);
        } else {
            brDanaUmjesecu = 28;
            preneseniBrDana = (brDanaUmjesecu % BR_DANA_U_SEDMICI);
            // 3         + 5
        }

        trazeniDan = (preneseniBrDana + trazeniDan) % 7;
        izracunajDanIspisiRzultat(trazeniDan, "MARTU");
        brDanaUmjesecu = 31;
        preneseniBrDana = (brDanaUmjesecu % BR_DANA_U_SEDMICI);

        trazeniDan = (preneseniBrDana + trazeniDan) % 7;
        izracunajDanIspisiRzultat(trazeniDan, "APRILU");
        brDanaUmjesecu = 30;
        preneseniBrDana = (brDanaUmjesecu % BR_DANA_U_SEDMICI);

        trazeniDan = (preneseniBrDana + trazeniDan) % 7;
        izracunajDanIspisiRzultat(trazeniDan, "MAJU");
        brDanaUmjesecu = 31;
        preneseniBrDana = (brDanaUmjesecu % BR_DANA_U_SEDMICI);

        trazeniDan = (preneseniBrDana + trazeniDan) % 7;
        izracunajDanIspisiRzultat(trazeniDan, "JUNU");
        brDanaUmjesecu = 30;
        preneseniBrDana = (brDanaUmjesecu % BR_DANA_U_SEDMICI);

        trazeniDan = (preneseniBrDana + trazeniDan) % 7;
        izracunajDanIspisiRzultat(trazeniDan, "JULU");
        brDanaUmjesecu = 31;
        preneseniBrDana = (brDanaUmjesecu % BR_DANA_U_SEDMICI);

        trazeniDan = (preneseniBrDana + trazeniDan) % 7;
        izracunajDanIspisiRzultat(trazeniDan, "AVGUSTU");
        brDanaUmjesecu = 31;
        preneseniBrDana = (brDanaUmjesecu % BR_DANA_U_SEDMICI);

        trazeniDan = (preneseniBrDana + trazeniDan) % 7;
        izracunajDanIspisiRzultat(trazeniDan, "SEPTEMBRU");
        brDanaUmjesecu = 30;
        preneseniBrDana = (brDanaUmjesecu % BR_DANA_U_SEDMICI);

        trazeniDan = (preneseniBrDana + trazeniDan) % 7;
        izracunajDanIspisiRzultat(trazeniDan, "OKT");
        brDanaUmjesecu = 31;
        preneseniBrDana = (brDanaUmjesecu % BR_DANA_U_SEDMICI);

        trazeniDan = (preneseniBrDana + trazeniDan) % 7;
        izracunajDanIspisiRzultat(trazeniDan, "NOVEMBRU");
        brDanaUmjesecu = 30;
        preneseniBrDana = (brDanaUmjesecu % BR_DANA_U_SEDMICI);

        trazeniDan = (preneseniBrDana + trazeniDan) % 7;
        izracunajDanIspisiRzultat(trazeniDan, "DECEMBRU");
        brDanaUmjesecu = 31;
        preneseniBrDana = (brDanaUmjesecu % BR_DANA_U_SEDMICI);

    }

    private static boolean isLeapYear(int unesenaGodina) {
        if ((unesenaGodina % 4 == 0 && unesenaGodina % 100 != 0) || (unesenaGodina % 400 == 0)) {
            return true;
        }
        return false;
    }

    public static void izracunajDanIspisiRzultat(int dan, String mjesec) {
        switch (dan) {
            case 1:
                ispisPrvogDnaUMjesecu("ponedeljak", mjesec);
                break;
            case 2:
                ispisPrvogDnaUMjesecu("utorak", mjesec);
                break;
            case 3:
                ispisPrvogDnaUMjesecu("srjeda", mjesec);
                break;
            case 4:
                ispisPrvogDnaUMjesecu("cetvrtak", mjesec);
                break;
            case 5:
                ispisPrvogDnaUMjesecu("petak", mjesec);
                break;

            case 6:
                ispisPrvogDnaUMjesecu("subota", mjesec);
                break;
            case 0:
                ispisPrvogDnaUMjesecu("nedelja", mjesec);
                break;
            default:
                ispisPrvogDnaUMjesecu("pogresan unos", "pogresan unos");

        }
    }

    public static void ispisPrvogDnaUMjesecu(String dan, String mjesec) {
        System.out.println("prvi dan u mjesecu " + mjesec + " je: " + dan);
    }
}
