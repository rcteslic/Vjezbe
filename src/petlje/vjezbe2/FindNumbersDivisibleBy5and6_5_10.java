package petlje.vjezbe2;

public class FindNumbersDivisibleBy5and6_5_10 {
    /*

(Find numbers divisible by 5 and 6) Write a program that displays all the num-
bers from 100 to 1,000, ten per line, that are divisible by 5 and 6. Numbers are
separated by exactly one space.

*/























    public static void main(String[] args) {
        int brojac = 0;
        for (int number = 100; number < 1000; number++) {
            if (number % 5 == 0 && number % 6 == 0) {
                if (brojac % 10 == 0) {
                    System.out.println();
                }
                brojac++;
                System.out.print(" " + number);
            }
        }

    }
}
