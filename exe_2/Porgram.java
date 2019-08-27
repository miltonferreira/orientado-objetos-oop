package exe_2;

import java.util.Locale;
import java.util.Scanner;

public class Porgram {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee emp = new Employee();
		
		showf("Nome: " );
		emp.name = sc.nextLine();
		
		showf("Salario Bruto: " );
		emp.grossSalary = sc.nextDouble();
		showf("Imposto: " );
		emp.tax = sc.nextDouble();
		
		show("Empregado: " + emp.name + ", $" + String.format("%.2f", emp.netSalary()));
		
		showf("Quantos porcento de aumento do salario: ");
		emp.increaseSalary(sc.nextDouble());
		
		System.out.println();
		show("Atualizacao: Empregado: " + emp.name + ", $" + String.format("%.2f", emp.netSalary()));
		
		sc.close();
	}
	
	public static void show(String str) {
		System.out.println(str);
	}
	public static void showf(String str) {
		System.out.print(str);
	}

}
