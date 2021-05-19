package intI;

public class Dog implements Animal {

	private String ime;
	private String pasmina;

	public Dog(String ime, String pasmina) {
		this.ime = ime;
		this.pasmina = pasmina;
	}

	@Override
	public void jedenje() {
		System.out.println("Pas jede sve.");
	}

	@Override
	public void kretanje() {
		System.out.println("Pogon na sve cetri + rep.");
	}

	@Override
	public void oglasavanje() {
		System.out.println("Vau, Vau.");
	}

	@Override
	public void ispis() {
		System.out.println("Ime zivotinje: " + this.ime);
		System.out.println("Pasmina: " + this.pasmina);

	}
}
