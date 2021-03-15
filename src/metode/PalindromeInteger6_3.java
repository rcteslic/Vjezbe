package metode;

public class PalindromeInteger6_3 {
    /*(Palindrome integer) Write the methods with the following headers
 Return the reversal of an integer, i.e., reverse(456) returns 654
public static int reverse(int number)
 Return true if number is a palindrome
public static boolean isPalindrome(int number)
Use the reverse method to implement isPalindrome . A number is a palin-
drome if its reversal is the same as itself. Write a test program that prompts the
user to enter an integer and reports whether the integer is a palindrome*/
    public static boolean isPalindrome(int number){  // 121
        int reverseNumber = reverse(number);  // 121
        return reverseNumber == number;   // 121 == 121
    }
    private static int reverse(int number) {

        int reverseNumber = 0;
        while (number != 0) {
            int poslednjaCifra = number % 10;  // dobili poslednju cifru   3 , 4 , 2
            reverseNumber *= 10;  // mnozimo sa 10 da pripremimo prostor za novi broj  0, 30 340
            reverseNumber += poslednjaCifra;  // dodajemo poslednju cifru 3*10 => 3, 30 +4 => 34, 342
            number /= 10;  //243  --> 24 => 2 = 0  izbacujemo odbijenu
        }
        return reverseNumber;
    }

}
