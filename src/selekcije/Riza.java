package selekcije;

public class Riza {
    public static void main(String[] args) {
        /*
        Predpostavimo da kupujemo rižu u dva različita pakovanja.
        Napišite program koji će uporedjivati cijene koštanja.
        Program omogućava korisniku da unese težinu i cijenu svakog pakovanja
         i da nam preporuku koji je povoljniji.

        Unesite težinu i cijenu za pakovanje br 1: 50   24.59
        Unesite težinu i cijenu za pakovanje br 2: 25   11.99
        Pakovanje 2 ima bolju cijenu*/

        double tezinaPrvogPakovanja = 50;
        double cjenaPrvogPakovanja = 24.59;
        double tezinaDrugog = 25;
        double cjenaDrugog = 11.99;

        double cijenaPoKilogramuPrvogPakovanja = cjenaPrvogPakovanja / tezinaPrvogPakovanja;
        double cijenaPoKGDrugoPakovanje = cjenaDrugog / tezinaDrugog;

        if (cijenaPoKilogramuPrvogPakovanja < cijenaPoKGDrugoPakovanje) {
            System.out.println(" Pakovanje 1 ima bolju cijenu");
        } else {
            System.out.println("Pakovanje 2 ima bolju cijenu");
        }

    }
}
