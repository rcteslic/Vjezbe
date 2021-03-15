package metode.vjezbe;

public class ProstiBrojevi {
    public static void ispis(int doBroja) {
        for (int i = 0; i < doBroja; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
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
}
