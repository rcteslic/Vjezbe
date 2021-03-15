package petlje.domaci;

public class Samoglasnici5_49 {
    public static void main(String[] args) {
        String samoglasnici = "AEIOU";
        String unosOdKorisnika = "NEkakkAv unos".toUpperCase();
        int brojac = 0;
        for (int index = 0; index < samoglasnici.length(); index++) {
            for (int i = 0; i < unosOdKorisnika.length(); i++) {
                if (samoglasnici.charAt(index) == unosOdKorisnika.charAt(i)) {
                    brojac++;
                }

            }
        }
        System.out.println(brojac);
    }
}
