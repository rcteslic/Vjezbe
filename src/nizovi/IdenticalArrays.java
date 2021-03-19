package nizovi;

import java.util.Arrays;
import java.util.Scanner;

public class IdenticalArrays {
    public static void main(String[] args) {

        int[] list1 ={3,2,1,3};
        int[] list2 ={3,1,2,3};


        System.out.println(identicalArray(list1,list2));



    }

    public static boolean identicalArray(int[] list1, int[] list2) {


        if (list1[0] != list2[0]) return false;
        int[] newlist1 = cutFirstNumberFromArray(list1);
        int[] newlist2 = cutFirstNumberFromArray(list2);
        Arrays.sort(newlist1);
        Arrays.sort(newlist2);
        for (int i = 1; i < list1[0]; i++) {
            if (newlist1[i] != newlist1[i]) return false;
        }
        return true;
    }

    public static int[] cutFirstNumberFromArray(int[] arr) {
        int[] newArr = new int[arr[0]];
        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = arr[i + 1];
        }
        return newArr;
    }

}
