package intI;

public class Test {

	public static void main(String[] args) {

		Animal cat = new Cat("Cheeki", "zutkasta");

		cat.ispis();
		System.out.println();

		cat.jedenje();
		cat.kretanje();
		cat.oglasavanje();
		System.out.println();

		Animal dog = new Dog("Breeki", "Doge");

		dog.ispis();
		System.out.println();

		dog.jedenje();
		dog.kretanje();
		dog.oglasavanje();
	}

}
