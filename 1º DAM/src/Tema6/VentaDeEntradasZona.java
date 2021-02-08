package Tema6;

public class VentaDeEntradasZona {
	private int entradasporvender;

	public VentaDeEntradasZona(int n) {
		entradasporvender=n;
	}
	
	public int getEntradasporvender() {
		return entradasporvender;
	}
	
	public void vender (int n) {
		if (this.entradasporvender == 0) {
			System.out.println("No quedan entradas ");
		} else {
			if (this.entradasporvender < n) {
				System.out.println ("Sólo quedan "+ this.entradasporvender +" entradas disponibles para esa zona");
			}
		}
		
		if (this.entradasporvender >= n) {
			entradasporvender -= n;
			System.out.println ("Aquí tiene sus " + n + " entradas, gracias.");
		}
	}
}
