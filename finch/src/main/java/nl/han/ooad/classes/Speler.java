package nl.han.ooad.classes;

import java.util.Scanner;

public class Speler {
	private String gebruikersnaam;
	private String wachtwoord;
	private int saldo;

	Vragenlijst lijst;
	Quiz quiz;

	public Speler(String gebruikersnaam, String wachtwoord) {
		this.gebruikersnaam = gebruikersnaam;
		this.wachtwoord = wachtwoord;
		this.saldo = 100;
	}

	public void koopVragenlijst(String thema) {
		// niet geimplementeerd
	}

	public void koopMunten(int munten) {
		// niet geimplementeerd
	}

	public void speelQuiz() {
		// word later nog geimplementeerd

		System.out.println("spelen quiz");

		// Quiz quiz = new Quiz(Data.getVragenlijst().maakQuiz());
		lijst = new Data().getVragenlijst();
		quiz = lijst.maakQuiz();
	}

	public String getVraag(int vraag) {
		return quiz.getVraag(vraag).toString();
	}

	public void beantwoordVraag(int vraag, String antwoord) {
		quiz.beantwoordVraag(antwoord, vraag);
	}

	public String getPunten() {
		return quiz.berekenPuntentelling() + "";
	}
	// System.out.println(quiz);
	// for (int i = 0; i < 4; i++) {
	// System.out.println(quiz.getVraag(i));
	// quiz.beantwoordVraag(input.nextLine(), i);
	// }

	// System.out.println("je hebt " + quiz.berekenPuntentelling() + " punten
	// behaald");

	// }
}