package objekti.biblioteka;

import java.util.ArrayList;

public class Clan {
    private long id;
    private String ime;
    private String prezime;
    private ArrayList<Knjiga> pozajmnjeneKnjige;

    public Clan(long id, String ime) {
        this.id = id;
        this.ime = ime;
        pozajmnjeneKnjige = new ArrayList<>();
    }
    public Clan(long id, String ime,String prezime) {
        this.id = id;
        this.ime = ime;
        this.prezime = prezime;
        pozajmnjeneKnjige = new ArrayList<>();
    }

    public Clan(){}

    public void dodaj(Knjiga knjiga) {
        pozajmnjeneKnjige.add(knjiga);
    }

    public long getId() {
        return id;
    }

    public String getIme() {
        return ime;
    }

    public ArrayList<Knjiga> getPozajmnjeneKnjige() {
        return pozajmnjeneKnjige;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public void setPozajmnjeneKnjige(ArrayList<Knjiga> pozajmnjeneKnjige) {
        this.pozajmnjeneKnjige = pozajmnjeneKnjige;
    }

    @Override
    public String toString() {
        return "Clan{" +
                "id=" + id +
                ", ime='" + ime + '\'' +
                ", pozajmnjeneKnjige=" + pozajmnjeneKnjige +
                '}';
    }


}
