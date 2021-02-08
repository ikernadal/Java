package Tema6;

public class Pizza {
	private static int TotalPedidas = 0;
	private static int TotalServidas = 0;
	
	private String tamaño;
	private String tipo;
	private boolean pedida = true;
	private boolean servida = false;
	
	public Pizza(String tamaño, String tipo) {
		this.tamaño = tamaño;
		this.tipo = tipo;
		this.pedida = pedida;
		this.servida = servida;
		pedida = true;
		TotalPedidas=TotalPedidas + 1;
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

	public boolean isPedida() {
		return pedida;
	}

	public void setPedida(boolean pedida) {
		this.pedida = pedida;
	}

	public boolean isServida() {
		return servida;
	}

	public void setServida(boolean servida) {
		this.servida = servida;
	}
	
	
	
	public static int getTotalPedidas() {
		return TotalPedidas;
	}

	public static void setTotalPedidas(int totalPedidas) {
		TotalPedidas = totalPedidas;
	}

	public static int getTotalServidas() {
		return TotalServidas;
	}

	public static void setTotalServidas(int totalServidas) {
		TotalServidas = totalServidas;
	}

	
	
	public void yaServida() {
		if (servida == true) {
			System.out.println("La pizza ya está servida");
		} else {
			System.out.println("Aqui tienen la pizza ");
			TotalServidas = TotalServidas + 1;
			servida = true;
		}
	}

	
	public String toString() {
		return "Pizza [tamaño=" + tamaño + ", tipo=" + tipo + ", pedida=" + pedida + ", servida=" + servida + "]";
	}
	
	
	//aaaaaaa
}
