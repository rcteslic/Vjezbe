package primjerInterfejsi;

import AKlase.Macka;

public class Main {
    public static void main(String[] args) {
     // deklarisani tip <---> Stvarni tip
        Zivotinja pas = new Pas1();
        pas.jede();

        Macka1 macka = new Macka1();
        macka.jede();

        ispis(pas);
        ispis(macka);

    }

    public static void ispis(Zivotinja zivotinja){
        System.out.println("Ispis....");
    }
}
