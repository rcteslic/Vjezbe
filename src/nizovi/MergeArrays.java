package nizovi;

import MyUtil.PomocnaKlasa;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.Arrays;
import java.util.Scanner;

public class MergeArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Unesite duzinu prvog niza");



        System.out.println("Unesite duzinu drugog niza");

        int[] list1 = {3, 2, 1, 3};
        int[] list2 = {3, 1, 2, 3, 2};
        PomocnaKlasa.ispis(merge(list1, list2));
    }

    public static int[] merge(int[] list1, int[] list2) {

        int duzinaTrecegNiza = list1.length + list2.length;
        int[] treciSpojeniNiz = new int[duzinaTrecegNiza];


        for (int i = 0; i < list1.length; i++) {
            treciSpojeniNiz[i] = list1[i];
        }

        int indexZaDrugiNiz = 0;
        for (int i = list1.length; i < duzinaTrecegNiza; i++) {
            treciSpojeniNiz[i] = list2[indexZaDrugiNiz];
            indexZaDrugiNiz++;
        }
        Arrays.sort(treciSpojeniNiz);
        return treciSpojeniNiz;
    }
}
