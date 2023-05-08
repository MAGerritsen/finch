package nl.han.ooad.classes;

public class MeerkeuzeVraag extends Vraag {
	private String juisteAntwoord;
	private String[] fouteAntwoorden;

	public MeerkeuzeVraag(String vraag, String juisteAntwoord, String[] fouteAntwoorden) {
		super.vraag = vraag;
		this.juisteAntwoord = juisteAntwoord;
		this.fouteAntwoorden = fouteAntwoorden;
	}

	@Override
	public boolean controleerAntwoord(String antwoord) {
		return (antwoord.equals(juisteAntwoord));
	}

	@Override
	public String toString() {
		return super.vraag + "\n" +
				juisteAntwoord + "\n" +
				fouteAntwoorden[0] + "\n" +
				fouteAntwoorden[1] + "\n" +
				fouteAntwoorden[2] + "\n";
	}
}