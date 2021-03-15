package osnoveProgramiranja;
// importovati Scanner
import java.util.Scanner;

public class Celsius2Fahrenheit {

	public static void main(String[] args) {
		double djeljenje = 4.0 / 5.0;
		System.out.println(djeljenje);
		// deklarisati varijable
		double celsius, fahrenheit;

		// napraviti novi Scanner
		Scanner unos = new Scanner(System.in);

		// pitati korisnika da unese temperaturu u C
		System.out.print("Unesite temperaturu u C: ");

		// dodijeliti korisnikov unos varijabli
		celsius = unos.nextDouble();

		// izracunati temeperaturu u F
		fahrenheit = (9.0 / 5.0) * celsius + 32;

		// ispisati rezultat korisniku
		System.out.println(celsius + " Celsiusa je " + fahrenheit + " Fahrenheita.");

		// zatvoriti Scanner
		unos.close();
	}
}
