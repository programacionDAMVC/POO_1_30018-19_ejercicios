package com.iesvirgendelcarmen.test;

import com.iesvirgendelcarmen.prueba.PruebaPaquetes1;
import com.iesvirgendelcarmen.prueba.PruebaPaquetes2;

public class TestPackages {

	public static void main(String[] args) {
		//new PruebaPaquetes1();
		new PruebaPaquetes2(); //no tiene sentido
		int numero = 6;
		System.out.println(PruebaPaquetes1.devolver5());
		System.out.println(PruebaPaquetes1.devolverDoble(numero));
		System.out.println(PruebaPaquetes2.devolver3());
		System.out.println(PruebaPaquetes2.devolverTriple(numero));

	}

}
