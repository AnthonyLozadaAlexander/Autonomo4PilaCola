package modelo;

public class Libro implements Comparable<Libro> {
	private String titulo;
	private int año;
	
	public Libro(String titulo, int año) {
		this.titulo = titulo;
		this.año = año;
	}

	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}
	
	
	@Override
	public int compareTo(Libro l) {
	    // Comparamos el año
	    if (this.año == l.getAño()) {
	        return 0;
	    } else if (this.año > l.getAño()) {
	        return 1;
	    } else {
	        return -1;
	    }
	}
	
	public String toString() {
		return this.titulo + "_" + this.año;
	}
	
}
