package Proyecto1;

public class Pelicula extends Multimedia {
	
	private String actorPrincipal; 
	private String actrizPrincipal; 

	public Pelicula(String titulo, String autor, String formato, double duracion, String autorPrincipal, String actrizPrincipal) {
		
		super(titulo, autor, formato, duracion);
		// TODO Auto-generated constructor stub
		this.actorPrincipal = actorPrincipal;
		this.actrizPrincipal = actrizPrincipal;
		
			if (this.actorPrincipal == null && this.actrizPrincipal == null) {
				
				throw new IllegalArgumentException();
				
			}
		
	}

	
	public String getActorPrincipal() {
		
		return actorPrincipal;
	
	}

	
	public void setActorPrincipal(String actorPrincipal) {
		
		this.actorPrincipal = actorPrincipal;
	
	}

	
	public String getActrizPrincipal() {
		
		return actrizPrincipal;
	
	}

	
	public void setActrizPrincipal(String actrizPrincipal) {
	
		this.actrizPrincipal = actrizPrincipal;
	
	}

	
	
	

	@Override
	public String toString() {
		
		return super.toString() + "actorPrincipal=" + actorPrincipal + ", actrizPrincipal=" + actrizPrincipal;
	
	}


	
	

	
	
	
	
	
}
