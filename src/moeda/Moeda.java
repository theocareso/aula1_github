package moeda;

import java.util.Locale;
import java.util.Scanner;

public class Moeda {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		CurrencyConverter cc = new CurrencyConverter();
		
		System.out.println("what is the dollar price? ");
		cc.cotacaoDolar = sc.nextDouble();
		
		System.out.println("How many dollars will be bought? ");
		cc.valorCompra = sc.nextDouble();
		
		cc.calculo(cc.cotacaoDolar, cc.valorCompra);
		
		
		sc.close();
	}

}
//	

//	 "