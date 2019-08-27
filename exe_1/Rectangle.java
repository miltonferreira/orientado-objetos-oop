package exe_1;

public class Rectangle {

	public double width = 0;
	public double height = 0;
	
	public double Area() {
		return width * height;
	}
	
	public double Perimetro() {
		return 2 * (width * height);
	}
	
	public double Diagonal() {
		return Math.sqrt(width * width + height * height);
	}
	
}
