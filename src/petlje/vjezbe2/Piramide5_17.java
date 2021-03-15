package petlje.vjezbe2;

public class Piramide5_17 {





    public static void main(String[] args) {
        int maxBroj = 9;
        for (int i = 1; i <= maxBroj; i++) {
            for (int s = maxBroj - i; s >= 1; s--) {
                System.out.print("  ");
            }
            for (int ljevoBrojevi = i; ljevoBrojevi > 1; ljevoBrojevi--) {
                System.out.print(" " + ljevoBrojevi);
            }
            for (int desnoBrojevi = 1; desnoBrojevi <= i; desnoBrojevi++) {
                System.out.print(" " + desnoBrojevi);
            }
            System.out.println();

        }
    }
}
