package nizovi;

import java.util.Arrays;
import java.util.Collections;

public class KopiranjeKrozPetlju {
    public static void main(String[] args) {
        Integer[] niz = {2, 5, 87, 9, 0};
        Arrays.sort(niz, Collections.reverseOrder());
        ispisNiza(niz);
    }

    public static void ispisNiza(int[] nekiNiz) {
        for (int element : nekiNiz) {
            System.out.print(" " + element);

        }
    }

    public static void ispisNiza(Integer[] nekiNiz) {
        for (int element : nekiNiz) {
            System.out.print(" " + element);

        }
    }

    public static void ispisNiza(String[] nekiNiz) {
        for (String element : nekiNiz) {
            System.out.print(" " + element);

        }
    }
}
