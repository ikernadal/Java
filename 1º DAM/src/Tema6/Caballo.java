package Tema6;

public class Caballo {
	private String raza;
	private int edad;
	private int peso;
	private String nombre; 
	private String color;
	private boolean disponible;
	private int precio;
	
	public Caballo(String raza, int edad, int peso, String nombre, String color, boolean disponible, int precio) {
		this.raza = raza;
		this.edad = edad;
		this.peso = peso;
		this.nombre = nombre;
		this.color = color;
		this.disponible = disponible;
		this.precio = precio;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isDisponible() {
		return disponible;
	}

	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	public void vender() {
		if (disponible) {
			System.out.println("El caballo ya está comprado ");
		} else {
			disponible = true;
		}
	}
	
	public void devolverCaballo() {
		if (!disponible) {
			System.out.println ("El caballo ya está devuelto" );
		} else {
			disponible = false; 
		}
	}

	public String toString() {
		return "Caballo [raza=" + raza + ", edad=" + edad + ", peso=" + peso + ", nombre=" + nombre + ", color=" + color
				+ ", disponible=" + disponible + ", precio=" + precio + "]";
	}
	
	
}
