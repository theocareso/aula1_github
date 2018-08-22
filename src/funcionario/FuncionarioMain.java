package funcionario;

import java.util.Scanner;
import funcionario.Funcionario;

public class FuncionarioMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Funcionario fun = new Funcionario();
		
		System.out.println("Digite o nome: ");
		fun.name = sc.nextLine();
		System.out.println("Digite o salário bruto: ");
		fun.grossSalary = sc.nextDouble();		
		System.out.print("Digite a taxa: ");
		fun.tax = sc.nextDouble();
				
		System.out.println("Employee "+ fun.toString());
		
		System.out.print("Which percentage to increase salary? ");
		double percentage = sc.nextDouble();
		fun.increaseSalary(percentage);
		System.out.println();
		System.out.println("Updated data: " + fun);
		
		sc.close();
		
	}

}
