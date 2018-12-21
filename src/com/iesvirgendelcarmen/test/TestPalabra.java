package com.iesvirgendelcarmen.test;

import java.util.Scanner;

import com.iesvirgendelcarmen.com.Palabra.Palabra;

public class TestPalabra {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce palabra");
		String palabraLeida = sc.next();
		Palabra palabra = new Palabra(palabraLeida);
		sc.close();
		System.out.println("Datos");
		System.err.printf("Palabra leida %s%n", palabraLeida);
		System.err.printf("Palabra en mayúscula %s%n", palabra.getUpperWord());
		System.err.printf("Palabra en minúscila %s%n", palabra.getLowerWord());
		System.err.printf("Nº de letras %d%n", palabra.getNumberOfLetter());
		System.err.printf("Primera letra %c%n", palabra.getFirstLetterOfWord());
		System.err.printf("Palabra reemplazando %c por %c, %s%n", 'o', 'a', 
				palabra.replaceLettersOfWord('o','a'));


	}

}
