package cotacaoDolar;

import java.util.Locale;
import java.util.Scanner;

public class CurrencyConverter {
	
	private static final double IOF = 0.06;
	private static double dolar = 3.10;
	
	public static void compraDolar() {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double v;
		
		show("Quantos dolares você quer? ");
		v = sc.nextDouble();
		
		show("Você vai pagar em reais: R$ " + String.format("%.2f", converter(v)));
		
		sc.close();
	}
	
	private static double converter(double value) {
		return  (value * dolar) + (value * dolar * IOF);
	}
	
	private static void show(String str) {
		System.out.println(str);
	}
	
}
