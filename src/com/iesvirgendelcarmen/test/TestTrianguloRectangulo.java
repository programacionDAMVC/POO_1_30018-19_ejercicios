package com.iesvirgendelcarmen.test;
import javax.swing.JOptionPane;

import com.iesvirgendelcarmen.matematicas.TrianguloRectangulo;


public class TestTrianguloRectangulo {

	public static void main(String[] args) {
		//solicitamos los dos catetos con joptionpane
		String sCateto1 = JOptionPane.showInputDialog("Introduce el valor de cateto1");
		if ( !sCateto1.matches("[0-9]+" )) {
			JOptionPane.showMessageDialog(null, "Valor no permitido", "ERROR",
					JOptionPane.ERROR_MESSAGE); 
			return;
		}
		String sCateto2 = JOptionPane.showInputDialog("Introduce el valor de cateto2");
		if ( !sCateto2.matches("[0-9]+" )) {
			JOptionPane.showMessageDialog(null, "Valor no permitido", "ERROR",
					JOptionPane.ERROR_MESSAGE); 
			return;
		}
		
		int iCateto1 = Integer.parseInt(sCateto1);
		int iCateto2 = Integer.parseInt(sCateto2);
		//cosntruir un objeto de tipo TrianguloRectangulo
		TrianguloRectangulo trianguloRectangulo = new TrianguloRectangulo(iCateto1, iCateto2);
		
		System.out.printf("%S, de área %.2f y de perímetro %.2f%n", trianguloRectangulo.toString(), 
				trianguloRectangulo.calcularArea(), trianguloRectangulo.calcularPerimetro());
		String titulo = "Información del triángulo rectángulo";
		String mensaje = trianguloRectangulo + " " + "\nÁrea: " +
				Math.round(	trianguloRectangulo.calcularArea() * 100) / 100.0 + "\nPerímetro: " +
				Math.round(trianguloRectangulo.calcularPerimetro() * 100) / 100.0;
		JOptionPane.showMessageDialog(null, mensaje, titulo, JOptionPane.PLAIN_MESSAGE); 
	}

}
