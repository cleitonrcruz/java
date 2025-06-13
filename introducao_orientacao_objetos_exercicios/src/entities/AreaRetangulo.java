package entities;

public class AreaRetangulo {

	public double width;
	public double height;
	
	// Calcula a área do retangulo
	public double areaRetangulo() {
		return width * height;
	}
	
	// Calcula o perímetro do retângulo
	public double perimetroRetangulo() {
		return 2 * (width + height);
	}
	
	// Calcula a diagonal do retângulo
	public double diagonalRetangulo() {
		return Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
	}
	
}
