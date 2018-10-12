package lt.balt;

import java.util.Scanner;

public class Skaiciuokle {

	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Kiek valandų rodo valandinė laikrodžio rodyklė? Įveskite sveiką skaičių nuo 0 iki 23.");
		double valandos = scanner.nextDouble();
		System.out.println("Kiek minučių rodo minutinė laikrodžio rodyklė? Įveskite sveiką skaičių nuo 0 iki 59.");
		double minutes = scanner.nextDouble();

		RodyklinisLaikrodis laikrodis = new RodyklinisLaikrodis(valandos, minutes);

		System.out.println("Laipsniai tarp valandinės ir minutinės laikrodžio rodyklių: "
				+ laikrodis.skaiciuotiKampaTarpLaikrodzioRodykliu() + ".");
	}

}
