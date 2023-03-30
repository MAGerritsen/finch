package nl.han.ooad.classes;

public class PuntentellingSimpel implements Puntentelling {
	@Override
	public int puntentelling(int juisteVragen, int tijd) {
		return (10 * juisteVragen) / (tijd / 60);
	}
}