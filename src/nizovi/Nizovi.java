package nizovi;

import java.util.Arrays;
import java.util.Collections;

public class Nizovi {
    public static void main(String[] args) {
        Integer[] arr = {13, 7, 6, 45, 21, 9, 101, 102};
        Integer[] niz = new Integer[arr.length];
        System.arraycopy(arr, 0, niz, 0, arr.length);

         Arrays.sort(arr, Collections.reverseOrder());


        System.out.println("arr = " + arr[1]);
    }

}
