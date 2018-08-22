package cap2;
import java.util.Scanner;

public class metodosForaClassePrincipal31 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Entre com tres números: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int maior = calculoMaior(a, b, c);

		mostrarResultado(maior);
	}

	private static int calculoMaior(int a, int b, int c) {
		int aux;
		if (a > b && a > c) {
			aux = a;
		}
		if (b > a && b > c) {
			aux = b;
		} else {
			aux = c;
		}

		return aux;
	}

	private static void mostrarResultado(int maior) {
		System.out.println("Maior valor: " + maior);
	}

}
