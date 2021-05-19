package AKlase;

public abstract class Zivotinja {
    private String ime;
    private int tezina;

    public abstract void kretanje();

    public abstract void jede();

    public abstract void pol();

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public int getTezina() {
        return tezina;
    }

    public void setTezina(int tezina) {
        this.tezina = tezina;
    }

    public void ispis() {
        System.out.println("Osnovne karakteristike: \nIme: " + this.ime + "\nTezina" + this.tezina);
    }
}
