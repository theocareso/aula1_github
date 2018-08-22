package retangulo;

import java.util.Scanner;

public class RetanguloMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor da altura: ");
		double altura = sc.nextDouble();
		System.out.println("Digite o valor da base: ");
		double base = sc.nextDouble();
		
		System.out.println("Area = "+ Retangulo.area(altura, base));
		System.out.println("Perimeter = " + Retangulo.perimeter(altura, base));
		System.out.println("Diagonal = " + Retangulo.diagonal(altura, base));
		
		
		sc.close();
		
	}

}
