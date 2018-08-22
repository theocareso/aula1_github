package cap2;

import java.util.Scanner;

public class Exercicio36 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de glicose: ");
		double glicose = sc.nextDouble();

		if (glicose <= 100) {
			System.out.println("Normal");
		} else if (glicose >100 && glicose <= 140) {
			System.out.println("Alta");
		} else {
			System.out.println("Diabetes");
		}
		
		sc.close();
	}

}
