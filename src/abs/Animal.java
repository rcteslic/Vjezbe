package abs;

public abstract class Animal {

	private String vrsta;
	private String ime;

	// apstraktne metode
	public abstract void jedenje();

	public abstract void kretanje();

	public abstract void oglasavanje();

	// konkretna metoda
	public void ispis() {
		System.out.println("Vrsta zivotinje; " + this.vrsta);
		System.out.println("Ime zivotinje: " + this.ime);
	}

	// setteri
	public void setVrsta(String vrsta) {
		this.vrsta = vrsta;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}
}
