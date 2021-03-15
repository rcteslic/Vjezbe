package metode.vjezbe;

public class ASCII {
    // brojevi 48 -57
    // slova 65 - 90
    public static void main(String[] args) {

    }




    
    public static char slucajniKarakter(char pocetniKarakter, char krajnji) {
        return (char) (pocetniKarakter + Math.random() * (krajnji - pocetniKarakter + 1));
    }
}
