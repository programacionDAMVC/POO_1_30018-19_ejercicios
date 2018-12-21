package com.iesvirgendelcarmen.matematicas;

public class Geometria {

	public static double getSurfaceTriangle(double base, double height) {
		return base * height / 2.0;
	}
	public static double getSurfaceSquare(double side) {
		return side * side;
	}
	public static double  getSurfacePentagon(double side) {
		return 1.72 * side * side;
	}
	public static double getSurfaceHexagon(double side) {
		return 1.6 * side * side;
	}
}
