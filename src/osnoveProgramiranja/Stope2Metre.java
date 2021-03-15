package osnoveProgramiranja;// importovati Scanner
import java.util.Scanner;

public class Stope2Metre {

	public static void main(String[] args) {
		
		// deklarisati varijable
		double stope, metri;

		// napraviti novi Scanner
		Scanner unos = new Scanner(System.in);

		// pitati korisnika da unese stope
		System.out.print("Unesite broj stopa: ");

		// dodijeliti korisnikov unos varijabli
		stope = unos.nextDouble();

		// pretvoriti stope u metre
		metri = stope * 0.305;

		// ispisati rezultat korisniku
		System.out.println(stope + " stopa je " + metri + " metara.");

		// zatvoriti Scanner
		unos.close();
	}
}
