package metode.vjezbe;

public class IzbacivanjeKaraktera {
    public static void main(String[] args) {
        String ime = "Vojo7";

      String cistoIme=  izbaci(ime, '7');
        System.out.println(cistoIme);
    }

    private static String izbaci(String rjec, char c) {
        String rjesenje = "";
        for (int index = 0; index < rjec.length(); index++) {
            if (rjec.charAt(index) != c) {
                rjesenje += rjec.charAt(index);
            }
        }
        return rjesenje;
    }

}
