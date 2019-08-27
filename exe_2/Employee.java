package exe_2;

public class Employee {
	
	public String name;
	public double grossSalary;
	public double tax;
	
	public double netSalary() {
		return grossSalary - tax;
	}
	
	public void increaseSalary(double per) {
		grossSalary += grossSalary * per / 100.0;
	}
	
	//SobreEscrevendo o metodo toString da classe Object
	public String toString() {
		return name + ", $ " + String.format("%.2f", netSalary());
	}
	
}
