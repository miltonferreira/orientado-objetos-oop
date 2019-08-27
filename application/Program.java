package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Triangle x, y;
		
		x = new Triangle();
		y = new Triangle();
		
		
		System.out.println("Entre com as medidas do triangulo X: ");
		
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Entre com as medidas do triangulo Y: ");
		
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		
		//insert(x, 3.00, 4.00, 5.00, "X");
		//insert(y, 7.50, 4.50, 4.02, "Y");
		
		double areaX = x.area();
		double areaY = y.area();
		
		System.out.printf("Triangulo X area: %.4f%n", areaX);
		System.out.printf("Triangulo Y area: %.4f%n", areaY);
		
		if(areaX > areaY) {
			System.out.println("Maior area: X: " + areaX);
		}else {
			System.out.println("Maior area: Y: " + areaY);
		}
		
		sc.close();
		
	}
	
	public static void insert(Triangle cl, double a, double b, double c, String str) {
		
		System.out.println("Entre com as medidas do triangulo " + str + ": ");
		
		cl.a = a;
		cl.b = b;
		cl.c = c;
		
	}
	
}
