package cap2;
import java.util.Locale;
import java.util.Scanner;

public class aula32 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entre com um número inteiro para obter a raiz: ");
		double numero = sc.nextDouble();
		while (numero >=0.0) {
			double sr = Math.sqrt(numero);
			System.out.printf("Raiz de " + numero +" = "+ "%.3f%n", sr);
			System.out.print("Entre com outro número: ");
			numero = sc.nextDouble();
			
		}
		System.out.println("Opa... Número negativo! ");
	sc.close();	
	}

}
