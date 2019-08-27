package exe_3;

import java.util.Locale;
import java.util.Scanner;

public class Porgram {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student stu = new Student();
		
		show("Nome: ");
		stu.name = sc.nextLine();
		show("Nota 1: ");
		stu.n1 = sc.nextDouble();
		show("Nota 2: ");
		stu.n2 = sc.nextDouble();
		show("Nota 3: ");
		stu.n3 = sc.nextDouble();
		
		stu.notaFinal();
		
		sc.close();

	}
	
	public static void show(String str) {
		System.out.println(str);
	}

}
