package nl.han.ooad.classes;

public abstract class Vraag {
	String vraag;

	public abstract boolean controleerAntwoord(String antwoord);

	public abstract String toString();
}