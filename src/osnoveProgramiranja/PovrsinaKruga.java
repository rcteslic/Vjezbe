package osnoveProgramiranja;

import java.util.Scanner;

public class PovrsinaKruga {

	public static void main(String[] args) {

// deklarisati varijable
		double povrsina;
		double poluprecnik;

		double PI = 3.14;
		poluprecnik = 10;

		// izracunati povrsinu
		povrsina = poluprecnik * poluprecnik * 3.14159;

		// ispisati rezultat
		System.out.println("Povrsina kruga poluprecnika " + poluprecnik
				+ " iznosi " + povrsina + "cm2");

	}
}
