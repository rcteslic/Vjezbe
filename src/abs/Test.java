package abs;

public class Test {

	public static void main(String[] args) {

		Animal cat = new Cat();

		cat.setIme("Cheeki");
		cat.setVrsta("Macka");

		cat.ispis();
		System.out.println();
		
		cat.jedenje();
		cat.kretanje();
		cat.oglasavanje();
		System.out.println();
		
		Animal dog = new Dog();
		
		dog.setIme("Breeki");
		dog.setVrsta("Pas");
		
		dog.ispis();
		System.out.println();

		
		dog.jedenje();
		dog.kretanje();
		dog.oglasavanje();
	}
}
