package application;

import java.util.Locale;
import java.util.Scanner;

import estoque.Product;

public class MainEstoque {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product pr = new Product();
		
		System.out.println("Entre com informacoes do produto");
		System.out.print("Nome: ");
		pr.name = sc.nextLine();
		System.out.print("Preco: ");
		pr.price = sc.nextDouble();
		System.out.print("Quantidade: ");
		pr.quantity = sc.nextInt();
		
		show(pr);
		
		System.out.print("Entre com a quantidade do produto: ");
		pr.AddProducts(sc.nextInt());
		
		show(pr);
		
		System.out.print("Entre com a quantidade do produto para tirar: ");
		pr.RemoveProducts(sc.nextInt());
		
		show(pr);
		
		sc.close();

	}
	
	public static void show(Product pr) {
		System.out.println();
		System.out.println(pr);
		System.out.println();
	}

}
