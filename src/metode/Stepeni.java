package metode;

public class Stepeni {
    public static void print() {
        double celsiuse = 40;
        double farenhejti = 120;

        for (int i = 0; i < 10; i++) {
            System.out.println(celsiuse + "  "+ celsiusToFahrenheit(celsiuse)+ "     |     "
                                +farenhejti + "  "+ fahrenheitToCelsius(farenhejti));
            celsiuse--;
            farenhejti -= 10;
        }

    }

    public static double celsiusToFahrenheit(double celsius) {

        final double converted = (9.0 / 5) * celsius + 32;
        return converted;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        double v = (5.0 / 9) * (fahrenheit - 32);
        return Math.round(v*100)/100.0;
    }
}
