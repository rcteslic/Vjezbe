package objekti.biblioteka;

public class MainBiblioteka {
    public static void main(String[] args) {
        // kreirana istanca biblioteke, i treba nam samo jedna jer pravimo arhuivu/uvid u samo jednu
        Biblioteka biblioteka = new Biblioteka("Danilo Kis","Bojan");
        popuniKnjigama(biblioteka);
        dodajClaniove(biblioteka);

        // covjek došao u bibloteku i rekao svoje id
        // gospohja na recepociji je an osnovu imena pronašla njegov karton
        Clan clan = biblioteka.dohvatiRegistrovanogClana(2);

        // Kada smo našli Člana , on želi da iznajmi knjigu , tako da prsledjujemo Naslov knjige i Člana
        biblioteka.izdajKnjigu(clan, "Travnicka Hronika");
        biblioteka.izdajKnjigu(clan, "Tvrdjava");
        biblioteka.izdajKnjigu(clan, "Na Drini");
        biblioteka.izdajKnjigu(clan, "Mostovi");
        biblioteka.stanjeKnjiga();

/*        biblioteka.vracanjeKnjige(clan, knjiga);
        biblioteka.pregledZaduzenihKnjiga();
        biblioteka.listaClanovaSaZaduzenimKnjigama();*/
    }

    private static void dodajClaniove(Biblioteka biblioteka) {
        // ovdje smo napravili nekoliko istanci(objekata) clanova
        Clan clan = new Clan(1, "Marko", "Markovic");
        Clan clan1 = new Clan(3, "Janko");
        Clan clan2 = new Clan(2, "Marija");

        // samo dodali
        biblioteka.dodaj(clan);
        biblioteka.dodaj(clan1);
        biblioteka.dodaj(clan2);
    }


    private static void popuniKnjigama(Biblioteka biblioteka) {
        // ovdje smo napravili nekoliko istanci(objekata) knjiga
        Knjiga knjiga = new Knjiga(1, "Na Drini", "Ivo", false);
        Knjiga knjiga2 = new Knjiga(2, "Travnicka Hronika", "Ivo", false);
        Knjiga knjiga3 = new Knjiga(3, "Tvrdjava", "Mesa", false);
        Knjiga knjiga4 = new Knjiga(4, "Ministarka", "Nusic", false);
        Knjiga knjiga5 = new Knjiga(5, "Aska i vuk", "Ivo", false);
        Knjiga knjiga6 = new Knjiga(6, "Mostovi", "Ivo", false);


        // dodali ih u biblioteku
        biblioteka.dodaj(knjiga);
        biblioteka.dodaj(knjiga2);
        biblioteka.dodaj(knjiga3);
        biblioteka.dodaj(knjiga4);
        biblioteka.dodaj(knjiga5);
        biblioteka.dodaj(knjiga6);
    }
}
