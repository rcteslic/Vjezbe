package MyUtil;

import java.util.Scanner;

public class PomocnaKlasa {
    public static int[] unesiNiz(int brojUnosa) {
        System.out.println("Unesite " + brojUnosa + " integera! ");
        Scanner scanner = new Scanner(System.in);
        int[] niz = new int[brojUnosa];
        for (int i = 0; i < brojUnosa; i++) {
            niz[i] = scanner.nextInt();
        }
        return niz;
    }

    public static double[] unesiDoubleNiz(int brojUnosa) {
        System.out.println("Unesite " + brojUnosa + " integera! ");
        Scanner scanner = new Scanner(System.in);
        double[] niz = new double[brojUnosa];
        for (int i = 0; i < brojUnosa; i++) {
            niz[i] = scanner.nextInt();
        }
        return niz;
    }
    public static void ispis(int[] niz) {
        for (int proizvoljno : niz) {
            System.out.println("broj = " + proizvoljno);
        }
    }

    public static void ispis(double[] niz) {
        for (double proizvoljno : niz) {
            System.out.println("broj = " + proizvoljno);
        }
    }

}
