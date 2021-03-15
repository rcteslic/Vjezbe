package metode.vjezbe;

public class Main {
    public static void main(String[] args) {
        System.out.println("isPrime(7) = " + isPrime(7));
        System.out.println("isPalindrome(7) = " + isPalindrome(123));
        ispisiPrvihSto();
    }

    public static void ispisiPrvihSto() {
        int brojacPrvihSto = 0;
        int brojKojiIspitujemo = 2;
        while (true) {
            if (brojacPrvihSto == 100) {
                break;
            }
            if (isPalindrome(brojKojiIspitujemo) && isPrime(brojKojiIspitujemo)) {
                brojacPrvihSto++;
                if (brojacPrvihSto % 10 == 0) {
                    System.out.println();
                }
            }
            brojKojiIspitujemo++;

        }
    }


    private static boolean isPrime(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static boolean isPalindrome(int number) {  //  123
        String palindrom = ""; //
        String orginalniBroj = String.valueOf(number);
        int konvertovanjeStringaUInt = Integer.parseInt("34534");

        while (number != 0) {
            int poslednjaCifra = number % 10;   // posled
            palindrom += poslednjaCifra;  // stiklamo na string i nema problema sa sabiranjem
            number /= 10;
        }
        return orginalniBroj.equals(palindrom);
    }


}
