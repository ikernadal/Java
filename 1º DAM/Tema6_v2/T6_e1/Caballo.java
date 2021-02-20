package T6_e1;
public class Caballo {
	private String raza;private String nombre;private int edad;private int kg;private int altura;private int precio;private boolean disponibilidad;
	public Caballo(String raza, String nombre, int edad, int kg, int altura, int precio, boolean disponibilidad) {
		this.raza = raza;
		this.nombre = nombre;
		this.edad = edad;
		this.kg = kg;
		this.altura = altura;
		this.precio = precio;
		this.disponibilidad = disponibilidad;
	}
	public String getRaza() {
		return raza;
	}
	public void setRaza(String raza) {
		this.raza = raza;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public int getKg() {
		return kg;
	}
	public void setKg(int kg) {
		this.kg = kg;
	}
	public int getAltura() {
		return altura;
	}
	public void setAltura(int altura) {
		this.altura = altura;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public boolean isDisponibilidad() {
		return disponibilidad;
	}
	public void setDisponibilidad(boolean disponibilidad) {
		this.disponibilidad = disponibilidad;
	}
	public String toString() {
		return "Caballo: raza=" + raza + ", nombre=" + nombre + ", edad=" + edad + ", kg=" + kg + ", altura=" + altura
				+ ", precio=" + precio + ", disponibilidad=" + disponibilidad;
	}	
}
