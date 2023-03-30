package nl.han.ooad.claasses;

public class Quiz {
	private Vraag[] vragen;
	private int juisteVragen;
	private int tijd;
	private int punten;

	public Quiz(Vraag[] vragen) {
		this.vragen = vragen;
		this.juisteVragen = 0;
		this.tijd = 0;
		this.punten = 0;
	}

	public Vraag getVraag(int vraag) {
		return vragen[vraag];
	}

	public void beantwoordVraag(String antwoord, int vraag) {
		if (vragen[vraag].beantwoordVraag(antwoord)) {
			juisteVragen++;
		}
	}

	public int puntentelling() {
		return new PuntentellingSimpel().puntentelling(juisteVragen, 240);
	}
}