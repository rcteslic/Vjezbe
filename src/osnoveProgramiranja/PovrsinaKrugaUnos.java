package osnoveProgramiranja;
// importovati Scanner
import java.util.Scanner;

public class PovrsinaKrugaUnos {

	public static void main(String[] args) {

		// deklarisati varijable
		double povrsina;
		double poluprecnik;

		System.out.print("Unesite vrijednost poluprecnika: ");
		// napraviti Scanner
		Scanner unos = new Scanner(System.in);

		final double PI = 3.14;
		poluprecnik = unos.nextDouble();

		// izracunati povrsinu

		povrsina = poluprecnik * poluprecnik * 3.14159;

		// ispisati rezultat
		System.out.println("Povrsina kruga poluprecnika " + poluprecnik 
				+ " iznosi " + povrsina +"cm2");

		// zatvoriti Scanner
		unos.close();
	}
}
