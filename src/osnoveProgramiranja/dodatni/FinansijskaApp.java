package osnoveProgramiranja.dodatni;

public class FinansijskaApp {
    /*   Finansijska aplikacija:
       Predpostavimo da uštedimo $100 svaki mjesec na svoj štedni račun,
        sa godišnjom kamatnom stopom: 5%.
   
       Prema tome mjesečna kamatna stopa se dobije :
               0.05/12 = 0.00417

       Nakon isteka prvog mjeseca, vrjednost na računu postaje:
               100 * (1 + 0.00417) = 100.417
       Nakon isteka drugog mjeseca, vrjednost na računu postaje:
               (100 + 100.417) * (1 + 0.00417) = 201.252
       Nakon isteka trećeg mjeseca, vrjednost na računu postaje:
               (100 + 201.252) * (1 + 0.00417) = 302.507
       I tako dalje..
   
       Omogućite korisniku da unese koliko mjesečno uštedi,
        a vi mu izračunajte koliku će vrjednost imati nakon šestog mjeseca.
    */
    public static void main(String[] args) {
        double  mjesecnaUsteda = 100.0;
        final double GODISNJA_KAMATNA_STOPA = 0.05 / 12;
        double stanjeNaRacunu = 0;

        stanjeNaRacunu = mjesecnaUsteda * (1 + GODISNJA_KAMATNA_STOPA);
        System.out.println("stanjeNaRacunu nakon prvog = " + Math.round(stanjeNaRacunu * 1000.0) / 1000.0);

        stanjeNaRacunu = (stanjeNaRacunu + mjesecnaUsteda) * (1 + GODISNJA_KAMATNA_STOPA);
        System.out.println("stanjeNaRacunu  nakon drugog= " + Math.round(stanjeNaRacunu * 1000.0) / 1000.0);

        stanjeNaRacunu = (stanjeNaRacunu + mjesecnaUsteda) * (1 + GODISNJA_KAMATNA_STOPA);
        System.out.println("stanjeNaRacunu nakon treceg = " + stanjeNaRacunu);

        stanjeNaRacunu = (stanjeNaRacunu + mjesecnaUsteda) * (1 + GODISNJA_KAMATNA_STOPA);
        System.out.println("stanjeNaRacunu nakon treceg = " + stanjeNaRacunu);

        stanjeNaRacunu = (stanjeNaRacunu + mjesecnaUsteda) * (1 + GODISNJA_KAMATNA_STOPA);
        System.out.println("stanjeNaRacunu nakon treceg = " + stanjeNaRacunu);

        stanjeNaRacunu = (stanjeNaRacunu + mjesecnaUsteda) * (1 + GODISNJA_KAMATNA_STOPA);
        System.out.println("stanjeNaRacunu nakon treceg = " + stanjeNaRacunu);
    }
}
 
