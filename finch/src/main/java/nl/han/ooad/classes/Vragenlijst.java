package nl.han.ooad.classes;

public class Vragenlijst {
	private Vraag[] vragen;

	public Vragenlijst(Vraag[] vragen) {
		this.vragen = vragen;
	}

	public Quiz maakQuiz() {
		Vraag[] quizvragen = { vragen[(int) (Math.random() * vragen.length)],
				vragen[(int) (Math.random() * vragen.length)],
				vragen[(int) (Math.random() * vragen.length)],
				vragen[(int) (Math.random() * vragen.length)] };
		Quiz quiz = new Quiz(quizvragen);
		return quiz;
	}
}