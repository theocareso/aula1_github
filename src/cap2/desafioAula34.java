package cap2;
import java.util.Scanner;

public class desafioAula34 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número positivo: ");
		int n = sc.nextInt();

		while (n <= 0) {
			System.out.println("O número deve ser positivo, tente novamente! ");
			n = sc.nextInt();
		}
		int maior = Integer.MIN_VALUE;
		for (int i = 1; i <= n; i++) {
			System.out.print("Valor # " + i);
			int x = sc.nextInt();

			if (x > maior) {
				maior = x;
			}
		}
		
		System.out.println("Maior valor = " + maior);
		sc.close();
	}
}
