package cap2;
import java.util.Locale;
import java.util.Scanner;

public class desafioDoWhile {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		char resp;
		
		do {
			System.out.println("Digite o número: ");
			double n = sc.nextDouble();
			double sq = Math.sqrt(n);
			System.out.printf("Raiz quadrada: "+ sq);
			
			System.out.println("Deseja calcular outro número?  (s/n) ");
			resp = sc.next().charAt(0);			
		}while(resp != 'n');
		
		sc.close();
	}

}
