package moeda;

public class CurrencyConverter {
	public double iof = 0.6;
	public double cotacaoDolar;			
	public double valorCompra;
	
	public void calculo(double moeda, double valor) {
		double aux =  ((valor * moeda)+ moeda * 6/100);
				
		System.out.println("Amount to be paid in reais = " + aux);
		
	}
	


}
