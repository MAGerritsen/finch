package nl.han.ooad.claasses;

public class Quiz {
	private Vraag[] vragen;
	private int juisteVragen;
	private int tijd;
	private int punten;

	public void beantwoordVraag(String antwoord, int vraag) {
		if (vragen[vraag].beantwoordVraag(antwoord)) {
			juisteVragen++;
		}
	}
}