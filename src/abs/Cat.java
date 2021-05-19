package abs;

public class Cat extends Animal {

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

}
