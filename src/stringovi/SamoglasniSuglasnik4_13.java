package stringovi;

public class SamoglasniSuglasnik4_13 {
    public static void main(String[] args) {


        String unos = "b";
        String samoglasnici = "AEIOU";

        if (samoglasnici.contains(unos.toUpperCase())) {
            System.out.println("Samoglasnik");
        } else System.out.println("Suglasnik");
    }
}
