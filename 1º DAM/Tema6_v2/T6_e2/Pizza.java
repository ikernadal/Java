package T6_e2;

public class Pizza {
	private String tama�o; 
	private String tipo; 
	private String estado;
	private static int contadorPedidas; 
	private static int contadorServidas;
	public Pizza(String tama�o, String tipo) {
		this.tama�o = tama�o;
		this.tipo = tipo;
		this.estado = "pedida";
		contadorPedidas++;
	}
	public String getTama�o() {
		return tama�o;
	}
	public void setTama�o(String tama�o) {
		this.tama�o = tama�o;
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
		return "Pizza [tama�o = " + tama�o + ", tipo = " + tipo + ", estado = " + estado + "]";
	}
	
	
	
	
	
	
}
