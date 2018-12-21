package com.iesvirgendelcarmen.test;
import com.iesvirgendelcarmen.coches.Coche;
public class TestCoche {

	public static void main(String[] args) {
		Coche coche1 = new Coche();
		coche1.setConsumo(10);
		coche1.setCantidadCombustible(5);
		System.out.printf("kilómetros que puede recorrer coche1: %.2f%n", coche1.conocerAutonomia());
		Coche coche2 = new Coche();
		coche1.setCantidadCombustible(5);
		System.out.printf("kilómetros que puede recorrer coche2: %.2f%n", coche2.conocerAutonomia());
	}

}
