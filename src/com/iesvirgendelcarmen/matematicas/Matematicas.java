package com.iesvirgendelcarmen.matematicas;

public class Matematicas {
	private double numberValue;

	public double getNumberValue() {
		return numberValue;
	}

	public void setNumberValue(double numberValue) {
		this.numberValue = numberValue;
	}
	
	public double getSquareRootOfNumber() {
		return Math.sqrt(numberValue);
	}
	
	public double getCubicRootOfNumber() {
		return Math.cbrt(numberValue);
	}
	
	public int getRoudIntOfNumber() {
		return (int) Math.abs(Math.round(numberValue));
	}

	public int getRandomValue() {
		return (int) (Math.random() * getRoudIntOfNumber());
	}

}
