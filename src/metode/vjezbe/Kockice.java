package metode.vjezbe;

public class Kockice {
    public static void main(String[] args) {
        while (true)
            System.out.println("baciKocku() = " + baciKocku());
    }
/*(Game: craps) Craps is a popular dice game played in casinos. Write a program
to play a variation of the game, as follows:
Roll two dice. Each die has six faces representing values 1, 2, ..., and 6, respec-
tively.
Check the sum of the two dice. If the sum is 2, 3, or 12 (called craps), you
lose;
if the sum is 7 or 11 (called natural), you win;
 if the sum is another value(i.e., 4, 5, 6, 8, 9, or 10), a point is established.

 Continue to roll the dice until either
a 7 or the same point value is rolled.

If 7 is rolled, you lose. Otherwise, you win.
Your program acts as a single player. Here are some sample runs.*/
    public static int zaigraj() {

        if (pobjeda()) {
            System.out.println("Pobjeda");
            return 1;
        } else {
            System.out.println("poraz");
            return 0;
        }
    }

    private static boolean pobjeda() {
        int suma = baciDvijeKocke();
        if (suma == 2 || suma == 3 || suma == 12) {
            return false;
        }
        if (suma == 7 || suma == 11)
            return true;
        else {
            return nastaviBacati(suma);
        }
    }

    private static boolean nastaviBacati(int suma) {
        int cilj = suma;
        System.out.println("NASTAVAK BACANJA...cilj je " + suma);
        while (true) {
            System.out.println("ponovno bacanje");
            int rezultatBacanje = baciDvijeKocke();
            if (rezultatBacanje == 7) {
                return false;
            }
            if (rezultatBacanje == cilj) {
                return true;
            }
        }
    }

    private static int baciDvijeKocke() {
        int rezultatPrvogBacanja = baciKocku();
        int rezultatDrugogBacanja = baciKocku();
        int rezultat = rezultatDrugogBacanja + rezultatPrvogBacanja;
        System.out.println(rezultatPrvogBacanja + " + " + rezultatDrugogBacanja + " = " + rezultat);
        return rezultat;
    }

    private static int baciKocku() {
        int rezultat = (int) (Math.random() * 6) + 1;
        return rezultat;
    }

}
