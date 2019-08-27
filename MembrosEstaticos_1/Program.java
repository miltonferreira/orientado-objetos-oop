package MembrosEstaticos_1;

import java.util.Locale;
import java.util.Scanner;

import util.Calculator;

public class Program {
	
	public static final void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com o radio: ");
		double radius = sc.nextDouble();
		
		double c = Calculator.circuferencia(radius);
		
		double v = Calculator.volume(radius);
		
		System.out.printf("Circuferencia: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("Valor do PI: %.2f%n", Calculator.PI);
		
		sc.close();

	}
	
	

}
