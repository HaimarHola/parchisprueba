package parchisClasesPruebasUnits;

public class Ficha{

	
	private Jugador jugador;
	private int casilla;
	
	public void mover(int cs) {
		casilla+=cs;
	}
	public Ficha() {
		super();
		this.jugador=null;
		this.casilla=0;
	}
}
