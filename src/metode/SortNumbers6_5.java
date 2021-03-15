package metode;

public class SortNumbers6_5 {

    /*
     (Sort three numbers) Write a method with the following header to display three
     numbers in increasing order:
     public static void displaySortedNumbers(double num1, double num2, double num3)
  */







    public static void main(String[] args) {
        displaySortedNumbers(252, 373, 794);
    }

    public static void displaySortedNumbers(double num1, double num2, double num3) {
        double max = Math.max(Math.max(num1, num2), num3);
        double min = Math.min(Math.min(num1, num2), num3);

        final boolean PRVI_JE_SREDNJI = num1 != max && num1 != min;
        final boolean DRUGI_JE_SREDNJ = num2 != max && num2 != min;

        double srednji = PRVI_JE_SREDNJI ? num1 : DRUGI_JE_SREDNJ ? num2 : num3;

        System.out.println(max + "  " + srednji + "  " + min);
    }
}
