package nl.han.ooad;

import java.util.Scanner;

import nl.han.ooad.classes.*;

/**
 * Hello world!
 *
 */
public class SpelerController {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		Scanner input = new Scanner(System.in);

		Speler speler = new Speler("Dani", "test123");

		speler.speelQuiz();

		for (int i = 0; i < 4; i++) {
			System.out.println(speler.getVraag(i));
			speler.beantwoordVraag(i, input.nextLine());
		}

		System.out.println("je hebt " + speler.getPunten() + " punten behaald");
	}
}
