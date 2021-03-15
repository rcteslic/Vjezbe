package metode;

public class SumDigits6_2 {
    /*(Sum the digits in an integer) Write a method that computes the sum of the digits
in an integer. Use the following method header:
public static int sumDigits(long n)
For example, sumDigits(234) returns 9 (2 + 3 + 4). (Hint: Use the % opera-
tor to extract digits, and the / operator to remove the extracted digit. For instance,
to extract 4 from 234, use 234 % 10 ( = 4). To remove 4 from 234, use 234 / 10
(= 23).
Use a loop to repeatedly extract and remove the digit until all the digits
are extracted. Write a test program that prompts the user to enter an integer and
displays the sum of all its digits.*/

    public static int count(long number) { // 234
        long suma = 0;

        while (number > 0) {  // 234 > 0 ===> true, 23 > 0 ===> true  2 > 0 ===> true
            long poslednjaCifra = number % 10;  // 4,3
            suma += poslednjaCifra; //4 , 7
            number = number / 10;  // 234/10 ==> 23   , 23 / 10=> 2
        }
        return (int) suma;
    }


    public static int sumDigits(long n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

}
