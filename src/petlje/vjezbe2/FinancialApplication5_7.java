package petlje.vjezbe2;

public class FinancialApplication5_7 {
    public static void main(String[] args) {
/*
Predpostavimo da školarina na fakultetu iznosi: 10,000 BAM ove godine
i raste  5% svake godine. U prvoj godini školarina će biti: 10,500 BAM.
Naprišite program koji će nam izračunti školarinu za 10u godinu, a potom ispisati
i totalnu cijenu za 4 godine koštanja školarine poslije 10 godina
*/














        double skolarina = 10000;
        // 5 % u decimalnom ==> 0.05 , da bi izbjegli ponovno množenje sa baznom sumom dodamo 1.00 na decimalni zapis.
        final double POSKUPLJENJE = 1.05;
        double cjenaPoslednjeCetiriGodine = 0;

        for (int godina = 1; godina <= 14; godina++) {
            skolarina *= POSKUPLJENJE;
            if (godina == 10) {
                System.out.println("školarinu u 10oj godini: " + skolarina);
            }
            if (godina > 10) {
                cjenaPoslednjeCetiriGodine += skolarina;
            }
        }
        System.out.println("cjena skolarine zadnje 4 godine = " + cjenaPoslednjeCetiriGodine);
    }
}

