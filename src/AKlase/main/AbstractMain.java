package AKlase.main;

import AKlase.Macka;
import AKlase.Pas;
import AKlase.Zivotinja;

public class AbstractMain {
    public static void main(String[] args) {
        Pas pas = new Pas();
        pas.setIme("Lea");
        pas.setTezina(3);
        pas.kretanje();
        pas.ispis();
        pas.pol();
        pas.jede();
        System.out.println("*********************************");


        Macka macka = new Macka();
        macka.setIme("Zivko");
        macka.setTezina(2);
        macka.kretanje();
        macka.ispis();
        macka.jede();
        macka.pol();
        System.out.println("*********************************");

        Puz puz = new Puz();
        puz.setIme("Mirko");
        puz.setTezina(1);
        puz.kretanje();
        puz.ispis();
        puz.jede();
        puz.pol();
    }


}
