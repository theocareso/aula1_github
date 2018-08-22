package cap2;
import java.util.Scanner;

public class aula33 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantos numeros inteiros? ");
		
		int n = sc.nextInt();
		
		int soma = 0;
		for (int i = 1; i <= n; i++) {
			System.out.println("Valor # "+ i);
			int x = sc.nextInt();
			soma += x;
		}
		System.out.println("Soma = " + soma);
		
		sc.close();
		
	}

}
