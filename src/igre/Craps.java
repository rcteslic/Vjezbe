package igre;

public class Craps {
    public static void main(String[] args) {
        ispisRezultata();
    }

    /*
(Game: craps) Craps is a popular dice game played in casinos. Write a program
to play a variation of the game, as follows:
1) Roll two dice. Each die has six faces representing values 1, 2, ..., and 6, respec-
tively.
2) Check the sum of the two dice.If the sum is 2, 3, or 12 (called craps), you
lose; if the sum is 7 or 11 (called natural), you win; if the sum is another value
(i.e., 4, 5, 6, 8, 9, or 10), a point is established.
3) Continue to roll the dice until either
a 7 or the same point value is rolled. If 7 is rolled, you lose. Otherwise, you win.
Your program acts as a single player. Here are some sample runs.*/

    public static void ispisRezultata() {
        if (pobjeda()) {
            System.out.println("POBJED");
        } else {
            System.out.println("PORAZ");
        }
    }

    private static boolean pobjeda() {
        int suma = sumaBacanja();
        if (suma == 2 || suma == 3 || suma == 12) {
            return false;
        }
        if (suma == 7 || suma == 11) {
            return true;
        }
        return nastaviBacanje(suma);
    }

    private static boolean nastaviBacanje(int point) {
        System.out.println("Point: " + point);
        while (true) {
            int suma = sumaBacanja();
            if (suma == 7) {
                return false;
            }
            if (suma == point) {
                return true;
            }
        }
    }


    private static int zavrtiKocku() {
        int rezultatBacnja = (int) (Math.random() * 6) + 1;
        return rezultatBacnja;
    }

    private static int sumaBacanja() {
        int prvoBacanje = zavrtiKocku();
        int drugoBacanje = zavrtiKocku();
        int rezultat = prvoBacanje + drugoBacanje;
        System.out.println("Suma bacanja: " + rezultat);
        return rezultat;
    }
}

