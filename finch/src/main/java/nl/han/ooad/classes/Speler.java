package nl.han.ooad.claasses;

public class Speler {
	private String gebruikersnaam;
	private String wachtwoord;
	private int saldo;

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
	}
}