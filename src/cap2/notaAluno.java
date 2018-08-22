package cap2;
import java.util.Scanner;

public class notaAluno {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com as tres notas do aluno: ");
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		double z = sc.nextDouble();
		
		double maior = calculoMaior(x, y, z);
		
		resultadoFinal(maior);
		
		sc.close();
	}

	private static void resultadoFinal(double nota) {
		if (nota > 60) {
			System.out.println("Aluno aprovado! " + nota);
		} else {
			System.out.println("Aluno reprovado!" + nota);
		}
	}

	private static double calculoMaior(double x, double y, double z) {
		double aux = (x + y + z);

		return aux;
	}
	
}
