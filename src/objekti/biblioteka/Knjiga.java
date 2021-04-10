package objekti.biblioteka;

public class Knjiga {
    private long id;
    private String naslov;
    private String autor;
    private boolean izdata;

    public Knjiga() {
    }

    public Knjiga(long id, String naslov, String autor, boolean izdata) {
        this.id = id;
        this.naslov = naslov;
        this.autor = autor;
        this.izdata = izdata;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setNaslov(String naslov) {
        this.naslov = naslov;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setIzdata(boolean izdata) {
        this.izdata = izdata;
    }

    public long getId() {
        return id;
    }

    public String getNaslov() {
        return naslov;
    }

    public String getAutor() {
        return autor;
    }

    public boolean isIzdata() {
        return izdata;
    }

    @Override
    public String toString() {
        return "Knjiga{" +
                "id=" + id +
                ", naslov='" + naslov + '\'' +
                ", autor='" + autor + '\'' +
                ", izdata=" + izdata +
                '}';
    }
}
