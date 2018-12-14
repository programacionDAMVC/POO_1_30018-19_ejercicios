package com.iesvirgendelcarmen.test;

import java.util.Scanner;

import com.iesvirgendelcarmen.matematicas.EcuacionSegundoGrado;

public class TestEcuacionSegundoGrado {

	public static void main(String[] args) {
		//solicitamos por Scanner los datos de la ecuación
		System.out.println("Introduce tres valores correspondiente a los coeficientes");
		Scanner sc = new Scanner(System.in);
		float a = sc.nextFloat();
		float b = sc.nextFloat();
		float c = sc.nextFloat();
		sc.close();
		EcuacionSegundoGrado e = new EcuacionSegundoGrado(a, b, c);
		if (e.esResoluble()) {
			System.out.printf("Valor de x1 %.2f y valor de x2 %.2f%n",
					e.calcularX1(), e.calcularX2());
		}
		else
			System.out.println("No se puede resolver la ecuación");

	}

}
