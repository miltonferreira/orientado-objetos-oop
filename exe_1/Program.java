package exe_1;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Rectangle rec = new Rectangle();
		
		Show("Entre com altura e largura do retangulo");
		rec.width = sc.nextDouble();
		rec.height = sc.nextDouble();
		
		Area(rec.Area());
		Peri(rec.Perimetro());
		Dia(rec.Diagonal());
		
		sc.close();
	}
	
	public static void Show(String str) {
		System.out.println(str);
	}
	
	public static void Area(double x) {
		Show("Area: " + String.format("%.2f", x));
	}
	
	public static void Peri(double x) {
		Show("Perimetro: " + String.format("%.2f", x));
	}
	
	public static void Dia(double x) {
		Show("Diagonal: " + String.format("%.2f", x));
	}

}
