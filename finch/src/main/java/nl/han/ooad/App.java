package nl.han.ooad;

import nl.han.ooad.claasses.*;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		Speler speler = new Speler("Dani", "test123");

		speler.speelQuiz();
	}
}
