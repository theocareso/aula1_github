package retangulo;

public class Retangulo {
	public double width;
	public double height;

	public static double area(double x, double y) {
		double aux = x * y;
		return aux;
	}

	public static double perimeter(double x, double y) {
		double aux = (x + y) * 2;
		return aux;
	}

	public static double diagonal(double x, double y) {
		double aux = (Math.pow(x, 2)) + (Math.pow(y, 2));
		
		aux = Math.pow(aux, 2);
		return aux;
	}

}
