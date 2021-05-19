package intI;

public class Cat implements Animal {

	private String ime;
	private String bojaKrzna;

	public Cat(String ime, String bojaKrzna) {
		this.ime = ime;
		this.bojaKrzna = bojaKrzna;
	}

	@Override
	public void jedenje() {
		System.out.println("Macka jede meso.");
	}

	@Override
	public void kretanje() {
		System.out.println("Pogon na sve cetri.");
	}

	@Override
	public void oglasavanje() {
		System.out.println("Mjau, Mjau.");
	}

	@Override
	public void ispis() {
		System.out.println("Ime zivotinje: " + this.ime);
		System.out.println("Boja krzna: " + this.bojaKrzna);
	}
}
