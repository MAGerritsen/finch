package nl.han.ooad.claasses;

public class OpenVraag extends Vraag {
	private String[] juisteAntwoorden;

	public OpenVraag(String vraag, String[] juisteAntwoorden) {
		super.vraag = vraag;
		this.juisteAntwoorden = juisteAntwoorden;
	}

	@Override
	public boolean beantwoordVraag(String antwoord) {
		for (int i = 0; i < juisteAntwoorden.length; i++) {
			if (antwoord.equals(juisteAntwoorden[i])) {
				return true;
			}
		}

		return false;
	}

	@Override
	public String toString() {
		return super.vraag + "\n";
	}
}