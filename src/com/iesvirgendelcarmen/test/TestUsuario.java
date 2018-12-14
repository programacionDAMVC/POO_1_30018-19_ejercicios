package com.iesvirgendelcarmen.test;
import java.util.Scanner;

import com.iesvirgendelcarmen.prueba.Usuario;

public class TestUsuario {

	public static void main(String[] args) {
		System.out.println("Introduce login y password (nº entre 0 y 9)" );
		Scanner sc = new Scanner(System.in);
		String login = sc.next();
		Usuario usuario = new Usuario(login); //se inicializa login como password
		int password = -1;
		int contador = 0;
		while (password != usuario.getPassword()) {
			password = sc.nextInt();
			contador++;
			if (contador == 3) {
				System.out.println("Has superado los tres intentos");
				break;
			}
				
		}
		sc.close();
		System.out.println("Has acertado la contraseña " + usuario);
		/*	if (usuario.getPassword() == password){
			System.out.println("Has acertado la contraseña");
			System.out.println(usuario);
		}
		else {
			System.out.println("No has acertado la contraseña");
			System.out.println(usuario);
		}*/
	}

}
