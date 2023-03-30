package nl.han.ooad.claasses;

public class Speler {
	private String email;
	private String voornaam;
	private String achternaam;
	private String wachtwoord;
	private int saldo;

	public Speler(String email, String wachtwoord) {
		this.email = email;
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
	}
}