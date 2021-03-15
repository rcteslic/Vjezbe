package metode.vjezbe;

public class PP {
    public static void main(String[] args) {
        System.out.println(area(5, 6.5));
    }

    private static boolean isPrime(int number) {
        for (int i = 1; i < number; i++) {
            if (number % i != 0) {
                return false;
            }
        }
        return true;
    }
    private static boolean isPalindrome(int number) {
        int orginal = number;
        int palindrome = 0;
        while (number != 0) {
            palindrome *= 10;
            int poslednjaCifra = number % 10;
            palindrome += poslednjaCifra;
            number /= 10;
        }
        System.out.println(palindrome);
        System.out.println(orginal);
        return palindrome == orginal;
    }
public static double area(double n, double s){
      return   (n*Math.pow(s,2))/ (4*Math.tan(Math.PI/n));
}
}
