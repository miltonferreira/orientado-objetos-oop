package estoque;

public class Product {
	
	public String name;
	public double price;
	public int quantity;
	
	public double TotalValueInStock() {
		return quantity * price;	
	}
	
	public void AddProducts(int quantity) {
		this.quantity += quantity;
	}
	
	public void RemoveProducts(int quantity) {
		this.quantity -= quantity;
	}
	
	public String toString() {
		return "Produto: " + name + ", $ " + String.format("%.2f", price) + ", " + quantity + " quantidades, total: $ " + String.format("%.2f", TotalValueInStock());
	}
	
}
