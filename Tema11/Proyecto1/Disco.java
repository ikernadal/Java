package Proyecto1;

public class Disco extends Multimedia{
	
	
	private String genero;
	

	public Disco(String titulo, String autor, String formato, double duracion, String genero) {
		
		super(titulo, autor, formato, duracion);
		// TODO Auto-generated constructor stub
		this.genero = genero; 
		
	}
	

	public String getGenero() {
		
		return genero;
		
	}
	

	public void setGenero(String genero) {
		
		this.genero = genero;
		
	}


	@Override
	public String toString() {
		
		return super.toString() + "genero=" + genero;
		
	} 
	
}
