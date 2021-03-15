package metode;

public class Pentagonal {
    /*(Math: pentagonal numbers) A pentagonal number is defined as n(3n–1)/2 for
n = 1, 2, . . ., and so on. Therefore, the first few numbers are 1, 5, 12, 22, . . . .
Write a method with the following header that returns a pentagonal number:
public static int getPentagonalNumber(int n)
Write a test program that uses this method to display the first 100 pentagonal
numbers with 10 numbers on each line.
*/
    public static void numberOdPrints(int number) {
        int brojac = 0;
        for (int i = 1; i <= number; i++) {
            brojac++;
            int x = getNumberPentagonal(i);
            System.out.print(x + " ");
            if (brojac % 10 == 0) {
                System.out.println();
            }
        }
    }

    private static int getNumberPentagonal(int n) {
        int pentagonalNumber = n * (3 * n - 1) / 2;
        return pentagonalNumber;
    }


}
