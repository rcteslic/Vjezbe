package exeption;

import java.util.Scanner;

public class DijeljenjeException {

    public static int dijeljenje(int broj1, int broj2) {

        if (broj2 == 0) {
            throw new ArithmeticException("Djelilac ne moze biti 0");
        }

        return broj1 / broj2;

    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Unesite dva cijela broja: ");
        int broj1 = input.nextInt();
        int broj2 = input.nextInt();

        try {
            System.out.println(dijeljenje(broj1, broj2));
        } catch (ArithmeticException ex) {

         }

        System.out.println("Program nastavlja sa radom...");

        input.close();
    }

}
