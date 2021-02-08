package Tema6;

public class ejemplo {
	private String autor;
	private String titulo;
	private int paginas;
	private boolean prestado;
	public ejemplo() {
		
	}
	
	public ejemplo (String t, String a, int p) {
		titulo = t;
		autor = a;
		paginas = p; 
		prestado = false;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getPaginas() {
		return paginas;
	}

	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}

	public boolean isPrestado() {
		return prestado;
	}

	public void prestar() {
		if (prestado) {
			System.out.println("Ya está prestado");
		} else {
			prestado = true;
		}
	}
	public void devolverPrestamo() {
		if (!prestado) {
			System.out.println("este libro no estaba prestado");
		} else {
			prestado = false;
		}
	}

	
	public String toString() {
		return "ejemplo [autor=" + autor + ", titulo=" + titulo + ", paginas=" + paginas + ", prestado=" + prestado
				+ "]";
	}
	
}
