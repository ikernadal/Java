package Tema6;

public class Libro {
	private String isbn;
	private String titulo;
	private String autor;
	private int numeroPaginas;
	private boolean prestado;
	
	public Libro(String isbn) {
		this.isbn=isbn;
	}

	public Libro(String isbn, String titulo, String autor, int numeroPaginas) {
		this.isbn = isbn;
		this.titulo = titulo;
		this.autor = autor;
		this.numeroPaginas = numeroPaginas;
		this.prestado = prestado;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getNumeroPaginas() {
		return numeroPaginas;
	}

	public void setNumeroPaginas(int numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}

	public boolean isPrestado() {
		return prestado;
	}

	public void prestar() {
		if (prestado) {
			System.out.println("El libro ya está prestado ");
		} else {
			prestado = true;
		}
	}
	
	public void devolverPrestamo() {
		if (!prestado) {
			System.out.println("No se puede devolver un libro no prestado ");
		} else {
			prestado = false; 
		}
	}

	
	public String toString() {
		return "Libro [isbn=" + isbn + ", titulo=" + titulo + ", autor=" + autor + ", numeroPaginas=" + numeroPaginas
				+ ", prestado=" + prestado + "]";
	}
	
	
	
}
