package enumeracija;

public class MAIN {
    public static void main(String[] args) {
        System.out.println(StanjePice.NARUCENA);
        String s = StanjePice.NARUCENA.toString();
        System.out.println(s);
        StanjePice narucena = StanjePice.valueOf("NARUCENA");
        System.out.println(narucena);
         stanje(StanjePice.PRODANA);
    }

    private static void stanje(StanjePice stanjePice) {
        switch (stanjePice) {
            case PRAVISE: {
                System.out.println("Vasa pica se pravi");
                break;
            }
            case PRODANA: {
                System.out.println("Vasa pica se prodana");
                break;

            }
            case NARUCENA: {
                System.out.println("Vasa pica je narucena");
                break;
            }
            default:{
                System.out.println("Pice nema ");
            }
        }
    }
}
