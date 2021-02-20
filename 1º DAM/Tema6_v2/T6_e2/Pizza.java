package T6_e2;

public class Pizza {
	private String tamaño; 
	private String tipo; 
	private String estado;
	private static int contadorPedidas; 
	private static int contadorServidas;
	public Pizza(String tamaño, String tipo) {
		this.tamaño = tamaño;
		this.tipo = tipo;
		this.estado = "pedida";
		contadorPedidas++;
	}
	public String getTamaño() {
		return tamaño;
	}
	public void setTamaño(String tamaño) {
		this.tamaño = tamaño;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	} 
	
	public void servirPizza() {
		if (estado == "pedida") {
		estado = "servida";
		contadorServidas++;
		contadorPedidas--;
		}
	}
	
	public static int getPedidas() {
		return contadorPedidas; 
	}
	public static int getServidas() {
		return contadorServidas;
	}
	
	public String toString() {
		return "Pizza [tamaño = " + tamaño + ", tipo = " + tipo + ", estado = " + estado + "]";
	}
	
	
	
	
	
	
}
