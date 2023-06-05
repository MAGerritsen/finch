package nl.han.ooad.classes;

public class PuntentellingIngewikkeld implements Puntentelling {
	@Override
	public int berekenPuntentelling(int juisteVragen, int tijd) {
		return (10 * juisteVragen) * (tijd / 60);
	}
}