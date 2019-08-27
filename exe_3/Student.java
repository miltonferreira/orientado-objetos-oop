package exe_3;

public class Student {

	public String name;
	public double n1, n2, n3;
	
	
	public double finalGrade() {
		return n1 + n2 + n3;
	}
	
	public double missingPoints() {
		if(finalGrade() < 60.0) {
			return 60.0 - finalGrade();
		}else {
			return 0.0;
		}
			
	}
	
	public void notaFinal() {
		
		if(finalGrade() >= 60) {
			
			System.out.println("Nota final: " + String.format("%.2f", finalGrade()));
			System.out.println(name + " Passed");
			
		}else {
			
			System.out.println(name + " Failed");
			System.out.println("Faltam " + String.format("%.2f", missingPoints()) + " Pontos");
			
		}
		
	}
	
}
