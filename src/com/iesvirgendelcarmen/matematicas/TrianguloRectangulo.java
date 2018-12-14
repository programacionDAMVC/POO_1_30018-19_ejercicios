package com.iesvirgendelcarmen.matematicas;

public class TrianguloRectangulo {

	//atributos
	private int cateto1;
	private int cateto2;
	//constructor
	public TrianguloRectangulo(int cateto1, int cateto2) {
		this.cateto1 = cateto1;
		this.cateto2 = cateto2;
	}
	//getters y setters
	public int getCateto1() {
		return cateto1;
	}
	public void setCateto1(int cateto1) {
		this.cateto1 = cateto1;
	}
	public int getCateto2() {
		return cateto2;
	}
	public void setCateto2(int cateto2) {
		this.cateto2 = cateto2;
	}
	//método que calcula la hipotenusa
	public double calcularHipotenusa() {
		return Math.hypot(cateto2, cateto1);
	}
	//método que calcula el área
	public double calcularArea() {
		return cateto1 * cateto2 / 2.0;
	}
	//método que calcula el perímetro
	public double calcularPerimetro() {
		return cateto1 + cateto2 + calcularHipotenusa();
	}
	@Override
	public String toString() {
		return "TrianguloRectangulo [cateto1=" + cateto1 + ", cateto2=" + cateto2 +
				", hipotenusa=" + Math.round(calcularHipotenusa() * 100) / 100.0 + "]";
	}
}
