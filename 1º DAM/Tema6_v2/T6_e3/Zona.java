package T6_e3;

public class Zona {
	private int entradas;
	 
	
	public Zona (int entradas)  {
		this.entradas = entradas;
	}
	public void venderEntradas(int c) {
		if (entradas >= c) {
			System.out.println("Hay suficientes entradas ");
			 
		} else {
			System.out.println ("No hay tantas entradas disponibles ");
		}
		
	
		
	}
	public int getEntradas() {
		return entradas;
	}
	public void setEntradas(int entradas) {
		this.entradas = entradas;
	}
}
