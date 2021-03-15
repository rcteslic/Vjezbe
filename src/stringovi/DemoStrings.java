package stringovi;

import java.util.Scanner;

public class DemoStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String poruka = "SCANNER.NEXTLINE()";
        String poruka3 = "SCANNER.NEXtLINE"+"()";

        System.out.println(poruka == poruka3);
        System.out.println("++++++++++++++++++++++");
        System.out.println("poruka3 = " + poruka3);
        System.out.println("poruka = " + poruka);
    }
}

