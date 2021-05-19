package abs;

public class Dog extends Animal {

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

}
