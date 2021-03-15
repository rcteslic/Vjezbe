package nizovi.vjezbanje;

import java.util.HashSet;
import java.util.Set;

public class JedinstveniEleemntiUNizu {
    public static void main(String[] args) {
        int[] korisnikovNiz = {2, 3, 2, 45, 45, 45, 45};
        System.out.println("Arrays.toString(bezDuplih).toString() = " + bezDuplihGarant(korisnikovNiz));
    }

    private static String bezDuplihGarant(int[] uneseniNiz) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < uneseniNiz.length; i++) {
            set.add(uneseniNiz[i]);
        }
        int[] korisnikovNiz = new int[set.size()];

        for (int i = 0; i < set.size(); i++) {
        }

        return set.toString();

    }

    private static int[] ispissiBezDuplih(int[] uneseniNiz) {
        int duzinaNovogNiza = 0;

        int[] privremeniNizBezDuplih = new int[uneseniNiz.length];
        int[] bezDuplih = new int[0];

        for (int i = 0; i < uneseniNiz.length; i++) {
            boolean postoji = false;
            for (int j = i + 1; j < uneseniNiz.length; j++) {
                if (uneseniNiz[i] == uneseniNiz[j]) {
                    postoji = true;
                    break;
                }
            }
            if (!postoji) {
                privremeniNizBezDuplih[duzinaNovogNiza] = uneseniNiz[i];
                duzinaNovogNiza++;
                bezDuplih = new int[duzinaNovogNiza];
                System.arraycopy(privremeniNizBezDuplih, 0, bezDuplih, 0, duzinaNovogNiza);
            }
        }
        return bezDuplih;
    }

}
