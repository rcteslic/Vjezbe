package exeption;

import java.util.ArrayList;

public class Magacin {
    private String adresa;
    private ArrayList<String> imenaMagacionera;

    public Magacin(String adresa) {
        this.adresa = adresa;
        this.imenaMagacionera = new ArrayList<>();
    }

    public ArrayList<String> getImenaMagacionera() {
        return imenaMagacionera;

    }
    public void setImenaMagacionera(ArrayList<String> imenaMagacionera) {
        this.imenaMagacionera = imenaMagacionera;
    }
    public String getAdresa() {
        return adresa;
    }
    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }
    public void dodajMagacionera(String imeMagacionera) {
        this.imenaMagacionera.add(imeMagacionera);
    }
}
