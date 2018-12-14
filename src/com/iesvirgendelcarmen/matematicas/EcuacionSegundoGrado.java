package com.iesvirgendelcarmen.matematicas;
/**
 * a·x² + b·x + c = 0
 * @author equipoprofesor
 *
 */
public class EcuacionSegundoGrado {
	//atributos
	private float a, b, c;

	//constructor
	public EcuacionSegundoGrado(float a, float b, float c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	//getters y setters
	public float getA() {
		return a;
	}

	public void setA(float a) {
		this.a = a;
	}

	public float getB() {
		return b;
	}

	public void setB(float b) {
		this.b = b;
	}

	public float getC() {
		return c;
	}

	public void setC(float c) {
		this.c = c;
	}
	//resto de métodos
	public boolean esResoluble() {
		return b * b - 4 * a * c >= 0; 
	}
	public float calcularX1() {
		return (float) ((-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a));
	}
	public float calcularX2() {
		return (float) ((-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a));
	}
	
	
	
	
	
	
	
}
