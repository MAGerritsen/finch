package nl.han.ooad.claasses;

public class MeerkeuzeVraag extends Vraag {
	private String juisteAntwoord;
	private String[] fouteAntwoorden;

	public MeerkeuzeVraag(String vraag, String juisteAntwoord, String[] fouteAntwoorden) {
		super.vraag = vraag;
		this.juisteAntwoord = juisteAntwoord;
		this.fouteAntwoorden = fouteAntwoorden;
	}

	@Override
	public boolean beantwoordVraag(String antwoord) {
		return (antwoord.equals(juisteAntwoord));
	}
}