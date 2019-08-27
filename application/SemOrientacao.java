package application;

import java.util.Locale;
import java.util.Scanner;

public class SemOrientacao {
	//Calcula e compara a area do 2 triangulos *** Sem orientacao a objetos
	
	public static void main(String[] args) {
		
		double xA, xB, xC;
		double yA, yB, yC;
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com as medidas do triangulo X: ");
		
		xA = sc.nextDouble();
		xB = sc.nextDouble();
		xC = sc.nextDouble();
		
		System.out.println("Entre com as medidas do triangulo Y: ");
		
		yA = sc.nextDouble();
		yB = sc.nextDouble();
		yC = sc.nextDouble();
		
		double p = (xA + xB + xC) / 2.0;
		double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));
		
		p = (yA + yB + yC) / 2.0;
		double areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));
		
		System.out.printf("Triangulo X area: %.4f%n", areaX);
		System.out.printf("Triangulo Y area: %.4f%n", areaY);
		
		if(areaX > areaY) {
			System.out.println("Maior area: X: " + areaX);
		}else {
			System.out.println("Maior area: Y: " + areaY);
		}
		
		sc.close();
		
	}

}
