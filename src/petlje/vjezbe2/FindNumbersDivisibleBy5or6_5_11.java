package petlje.vjezbe2;

public class FindNumbersDivisibleBy5or6_5_11 {
    /*Find numbers divisible by 5 or 6, but not both) Write a program that displays
all the numbers from 100 to 200, ten per line, that are divisible by 5 or 6, but not
both. Numbers are separated by exactly one space.*/





























    public static void main(String[] args) {
        int brojac = 0;
        for (int number = 100; number < 200; number++) {
            if (number % 5 == 0 ^ number % 6 == 0) {
                if (brojac % 10 == 0) {
                    System.out.println();
                }
                brojac++;
                System.out.print(" " + number);
            }
        }

    }
}
