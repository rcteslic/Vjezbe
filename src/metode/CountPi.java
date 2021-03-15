package metode;

import java.text.DecimalFormat;

public class CountPi {
    public static void izracunajPi(int broj) {
        DecimalFormat df = new DecimalFormat("#.####");
        double pi = 0;
        for (double i = 1; i <= broj; i++) {
            pi += Math.pow(-1, i + 1) / (2 * i - 1);
        }
        pi = 4 * pi;
        System.out.println("pi = " + df.format(pi));
    }

    public static void ispisiPi() {
        for (int i = 1; i <= 901; i += 100) {
            izracunajPi(i);
        }
    }

}
