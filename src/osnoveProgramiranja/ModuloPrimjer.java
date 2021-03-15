package osnoveProgramiranja;
// importovati Scanner
import java.util.Scanner;

public class ModuloPrimjer {

	public static void main(String[] args) {

		// deklarisati varijable
		int korisnikovUnos;
		int minute, sekunde;

		// napraviti novi Scanner
		Scanner unos = new Scanner(System.in);

		// pitati korisnika da unese broj sekundi i dodijeliti unos varijabli
		System.out.print("Unesite broj sekundi: ");
		korisnikovUnos = unos.nextInt();

		// izracunati broj minuta i sekundi
		minute = korisnikovUnos / 60;
		sekunde = korisnikovUnos % 60;

		// ispisati rezultat korisniku
		System.out.println(korisnikovUnos + " sekundi je: " + minute 
				+ " minuta i " + sekunde + " sekundi.");
		
		// zatvoriti Scanner
		unos.close();
	}
}
