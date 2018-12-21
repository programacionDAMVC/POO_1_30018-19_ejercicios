package com.iesvirgendelcarmen.test;

import java.util.Scanner;

import com.iesvirgendelcarmen.matematicas.Matematicas;
import com.iesvirgendelcarmen.matematicas.Geometria;

public class TestMatematicas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número");
		double valor = sc.nextDouble();
		System.out.println("Introduce la base del triángulo");
		double base = sc.nextDouble();
		System.out.println("Introduce la altura del triángulo");
		double altura = sc.nextDouble();
		System.out.println("Introduce el lado del poligono regular");
		double lado = sc.nextDouble();
		sc.close();
		Matematicas m = new Matematicas();
		m.setNumberValue(valor);
		System.out.println("DATOS");
		System.out.printf("El nº %.2f tiene como raíz cúbica %.2f y raíz cuadrada %.2f%n",
				m.getNumberValue(), m.getCubicRootOfNumber(), m.getSquareRootOfNumber());
		System.out.printf("El nº %.2f su valor redondeando a entero es %d y un valor aletarorio menor"
				+ " que dicho número es %d%n", m.getNumberValue(), m.getRoudIntOfNumber(),
				m.getRandomValue());
		
		System.out.printf("La superficie del triángulo de base "
				+ "%.2f y altura %.2f vale %.2f%n", base, altura,
				Geometria.getSurfaceTriangle(base, altura));
		System.out.printf("La superficie del cuadrado de lado "
				+ "%.2f vale %.2f%n", lado,
				Geometria.getSurfaceSquare(lado));
		System.out.printf("La superficie del pentágono de lado "
				+ "%.2f vale %.2f%n", lado,
				Geometria.getSurfacePentagon(lado));
		System.out.printf("La superficie del hexángo de lado "
				+ "%.2f vale %.2f%n", lado,
				Geometria.getSurfaceHexagon(lado));
	}

}
