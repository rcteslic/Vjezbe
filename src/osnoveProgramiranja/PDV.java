package osnoveProgramiranja;
// importovati Scanner
import java.util.Scanner;

public class PDV {

	public static double izracunaj() {

		// deklarisati varijable
		double orginalniIznos;
		double vrijednostPDVa;
		double konacniIznos;

		// kreirati novi Scanner
		Scanner unos = new Scanner(System.in);

		// pitati korisnika da unese pocetni iznos
		System.out.print("Unesite vrijednost za koju zelite izracunati PDV: ");

		// dodijeliti korisnikov unos varijabli
		orginalniIznos = unos.nextDouble();

		// izracunati vrijednost PDVa
		vrijednostPDVa = orginalniIznos * 0.17;

		// izracunati konacni iznos
		konacniIznos = orginalniIznos + vrijednostPDVa;

		// ispisati rezultate korisniku
		System.out.println("Vrijednost PDVa je: " + vrijednostPDVa);
		System.out.println("Konacan iznos je: " + konacniIznos);

		// zatvoriti Scanner
		unos.close();
		return konacniIznos;
	}
}
