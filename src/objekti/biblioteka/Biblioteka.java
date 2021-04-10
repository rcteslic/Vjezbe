package objekti.biblioteka;

import java.util.ArrayList;

public class Biblioteka {
    private String ime;
    private ArrayList<Clan> clanovi;
    private ArrayList<Knjiga> knjige;
    private String ulica;


    // kada se kreira sa ovim konstruktorom , onda inicializujemo liste i pravimo prostor za listu clanova (700) i listu knjiga (2100)
    public Biblioteka(String ime, String ulica) {
        this.clanovi = new ArrayList<>(700);
        this.knjige = new ArrayList<>(2100);
        this.ime = ime;
        this.ulica = ulica;
    }

    public Clan dohvatiRegistrovanogClana(int clanskiBroj) {
        // deklarisali objekat(napravili) bez konkretne vrjednosti
        Clan clan = null;
        for (int i = 0; i < clanovi.size(); i++) {
            // inicijalizovali-dodjelili vrjednost
            // kako prolazimo kroz listu, svaku put mu dajemo dtrugu vrjednost
            clan = clanovi.get(i);

            // gdje smo ispitivali podudaranje prosledjenog clanskoig broja sa konkretnim brojem iz liste
            if (clan.getId() == clanskiBroj) {
                break;
            }
        }

        return clan;
    }

    public void izdajKnjigu(Clan clan, String imeKnjige) {

        Knjiga knjiga = null;
        for (int i = 0; i < knjige.size(); i++) {
            // prolazimo kroz sve knjige u biblioteci
            knjiga = knjige.get(i);
            // na osnovu naslova , iskačemo iz petlje
            if (knjiga.getNaslov().equals(imeKnjige)) {
                break;
            }
        }
        // dalje tu nadjenu knjigu "obradjujemo" , konkretno provjeravamo je li izdana
        if (knjiga.isIzdata()) {
            System.out.println("Knjiga " + imeKnjige + " je već izdata.");
            // ako nije nizdana ulazimo u postupak izdavanja
        } else {
            // medjutim provjeravamo je li i clam ima više od 3 knjige već izdate
            if (clan.getPozajmnjeneKnjige().size() < 3) {
                //ako su svi uslovi ispunjeni , setujemo nove vrjednostu-stanja za knjigu i clana
                knjiga.setIzdata(true);
                clan.dodaj(knjiga);
                System.out.println(knjiga.getNaslov() + " je upravo izdata clanu: " + clan.getIme());
            }
            // ispisujemo samo poruku , ako član ima već 3 knjige podignute
            else {
                System.out.println("Clan biblioteke " + clan.getIme() + " već ima iznajmljene tri knjige");
            }
        }
    }

    public ArrayList<Knjiga> getKnjige() {
        return knjige;
    }

    public ArrayList<Clan> getClanovi() {
        return clanovi;
    }

    public void setClanovi(ArrayList<Clan> clanovi) {
        this.clanovi = clanovi;
    }

    public void setKnjige(ArrayList<Knjiga> knjige) {
        this.knjige = knjige;
    }

    // dohvatili atribut listu knjiga i pospremili konkretnu knjigu u tu listu
    public void dodaj(Knjiga knjiga) {
        this.knjige.add(knjiga);
    }

    // dohvatili atribut listu clanova i pospremili clana u konkretnu listu clanova
    public void dodaj(Clan clan) {
        this.clanovi.add(clan);
    }

    public void stanjeKnjiga() {
        System.out.println("****************************");
        System.out.println("Lista slobodnih knjiga:");

        // iterirali kroz listu knjiga
        for (int i = 0; i < knjige.size(); i++) {
            //provjeravamo za svaku knjigu po na osob da li je izdata
            if (!knjige.get(i).isIzdata()) {
                // ako nije izdata, ispis
                System.out.println(knjige.get(i).getNaslov());
            }
        }
    }

    @Override
    public String toString() {
        return "Biblioteka{" +
                "clanovi=" + clanovi +
                ", knjige=" + knjige +
                ", ime=" + ime +
                '}';
    }

}
