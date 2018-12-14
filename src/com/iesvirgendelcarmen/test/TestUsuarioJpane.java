package com.iesvirgendelcarmen.test;
import javax.swing.JOptionPane;

import com.iesvirgendelcarmen.prueba.Usuario;

public class TestUsuarioJpane {
	public static void main(String[] args) {
		//solicitamos el login del usuario
		String login = JOptionPane.showInputDialog(
				"Por favor introduce login del usuario");
		Usuario usuario = new Usuario(login);
		//PARA UN SOLO INTENTO
		//solicitamos la contraseña del usuario
		//¡OJO! viene como cadena, NO como número entero (int)
		/*String password = JOptionPane.showInputDialog(
				"Por favor introduce la contraseña del usuario");
		//usando wrapper lo convertimos en int
		int passwordNumero = Integer.parseInt(password);
		
		if (passwordNumero == usuario.getPassword())
			JOptionPane.showInternalMessageDialog(null, usuario,
					"Información de usuarios", JOptionPane.PLAIN_MESSAGE);
		else
			JOptionPane.showInternalMessageDialog(null, "Contraseña no válida",
					"Información de usuarios", JOptionPane.ERROR_MESSAGE);*/
		//SE SOLICITA LA CONTRASEÑA HASTA QUE SE ACIERTA
		int passwordNumero = -1;
		do {
			//solicitamos la contraseña del usuario
			//¡OJO! viene como cadena, NO como número entero (int)
			String password = JOptionPane.showInputDialog(
					"Por favor introduce la contraseña del usuario");
			//usando wrapper lo convertimos en int
			passwordNumero = Integer.parseInt(password);
		} while(passwordNumero != usuario.getPassword());
		JOptionPane.showInternalMessageDialog(null, usuario,
				"Información de usuarios", JOptionPane.PLAIN_MESSAGE);
		
		
		
		
		
		
		
	}
}
