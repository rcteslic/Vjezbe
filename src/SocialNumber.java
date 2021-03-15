import java.util.Scanner;

public class SocialNumber {
    public static void main(String[] args) {
        /*(Check SSN) Write a program that prompts the user to enter a Social Security


number in the format DDD-DD-DDDD, where D is a digit.

Your program should check whether the input is valid. Here are sample runs:*/
        boolean uslov = true;
        Scanner scanner = new Scanner(System.in);
        //01234567890
        String socijalniBroj = "232-23-52";
        if (socijalniBroj.length() != 11) {
            System.out.println("br karaktera nije validan");
            uslov = false;
        }
        for (int i = 0; i < socijalniBroj.length(); i++) {
            if (i == 3 || i == 6) {
                if (socijalniBroj.charAt(i) != '-') {
                    System.out.println("Invalidan unos , crtica");
                    uslov = false;
                    break;
                }
            } else {
                if (!Character.isDigit(socijalniBroj.charAt(i))) {
                    System.out.println("Invalidan unos nije br");
                    uslov = false;
                    break;
                }
                // 3 i 6 karakteri
            }
        }
        if (uslov) {
            System.out.println(" unos je validan");
        }

    }
}
