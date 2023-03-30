package nl.han.ooad.claasses;

public class Data {
	public Vragenlijst getVragenlijst() {
		String[] antwoorden1 = { "11", "elf" };
		String[] antwoorden2 = { "Ottawa" };

		String juisteAntwoord1 = "Queen";
		String[] fouteAntwoorden1 = { "The Beatles", "Coldplay", "ABBA" };

		String juisteAntwoord2 = "50";
		String[] fouteAntwoorden2 = { "40", "48", "52" };
		Vraag[] vragen = {
				new OpenVraag("Hoeveel tijdzones zijn er in Rusland", antwoorden1),
				new OpenVraag("Hoeveel tijdzones zijn er in Rusland", antwoorden2),
				new MeerkeuzeVraag("Welke band staat het vaakst in de Top 2000 van 2022", juisteAntwoord1,
						fouteAntwoorden1),
				new MeerkeuzeVraag("Uit hoeveel staten bestaan de Verenigde Staten", juisteAntwoord2, fouteAntwoorden2)
		};

		return new Vragenlijst(vragen);
	}
}

/*
 * 
 * Open vragen:
 * 1)
 * Vraag: Hoeveel tijdzones zijn er in Rusland?
 * Antwoord: 11
 * 
 * 2)
 * Vraag: Wat is de hoofdstad van Canada?
 * Antwoord: Ottawa
 * 
 * Meerkeuze vragen:
 * 3)
 * Vraag: Welke band staat het vaakst in de Top 2000 van 2022?
 * A: The Beatles (fout)
 * B: coldplay (fout)
 * C: Queen (goed)
 * D: ABBA (fout)
 * 
 * 4)
 * Vraag: Uit hoeveel staten bestaan de Verenigde Staten?
 * A: 40 (fout)
 * B: 48 (fout)
 * C: 50 (goed)
 * D: 52 (fout)
 */