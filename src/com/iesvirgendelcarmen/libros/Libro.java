package com.iesvirgendelcarmen.libros;

public class Libro {
	private String titulo;
	private String isbn;
	private String autor;
	private int numeroEjemplares;
	public Libro(String titulo, String isbn, String autor, int numeroEjemplares) {
		this.titulo = titulo;
		this.isbn = isbn;
		this.autor = autor;
		this.numeroEjemplares = numeroEjemplares;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getNumeroEjemplares() {
		return numeroEjemplares;
	}
	public void setNumeroEjemplares(int numeroEjemplares) {
		this.numeroEjemplares = numeroEjemplares;
	}
	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", isbn=" + isbn + ", autor=" + autor + ", numeroEjemplares="
				+ numeroEjemplares + "]";
	}

	
}
