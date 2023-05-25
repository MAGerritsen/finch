package nl.han.ooad.classes;

import java.util.ArrayList;

public class Speler {
	private String gebruikersnaam;
	private String wachtwoord;
	private int saldo;

	private Vragenlijst lijst;
	private Quiz quiz;
	private ArrayList<LifetimeBest> topscores = new ArrayList<>();

	public Speler(String gebruikersnaam, String wachtwoord) {
		this.gebruikersnaam = gebruikersnaam;
		this.wachtwoord = wachtwoord;
		this.saldo = 100;
	}

	public float koopVragenlijst(String thema) {
		// niet geimplementeerd
		return 0;
	}

	public void koopMunten(int munten) {
		// niet geimplementeerd
	}

	public void kiesBetaalmethode() {
		// niet geimplementeerd
	}

	public void betaal() {
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
		int score = quiz.berekenPuntentelling();
		topscores.add(new LifetimeBest(lijst, score));
		return score + "";
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
