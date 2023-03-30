package nl.han.ooad.claasses;

public class Vragenlijst {
	private Vraag[] vragen;

	public Quiz maakQuiz() {
		Vraag[] quizvragen = { vragen[(int) (Math.random() * vragen.length)],
				vragen[(int) (Math.random() * vragen.length)],
				vragen[(int) (Math.random() * vragen.length)],
				vragen[(int) (Math.random() * vragen.length)] };
		Quiz quiz = new Quiz(quizvragen);
		return null;
	}
}