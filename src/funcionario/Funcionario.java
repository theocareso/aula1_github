package funcionario;

public class Funcionario {
	public String name;
	public double grossSalary;
	public double tax;
	
	public double netSalary() {
		
		return grossSalary - tax;
	}
	
	public void increaseSalary(double porcentagem) {
		grossSalary += grossSalary * porcentagem/100;
		
	}

	public String toString() {
		return name + ", $ " + String.format("%.2f", netSalary());
				
	}
	
	
}
