package com.iesvirgendelcarmen.coches;

public class Coche {
	private double cantidadCombustible = 5;
	private double consumo = 7;
	public double getCantidadCombustible() {
		return cantidadCombustible;
	}
	public void setCantidadCombustible(double cantidadCombustible) {
		this.cantidadCombustible = cantidadCombustible;
	}
	public double getConsumo() {
		return consumo;
	}
	public void setConsumo(double consumo) {
		this.consumo = consumo;
	}
	public double conocerAutonomia() {
		return 100.0 * cantidadCombustible / consumo;
	}
}
