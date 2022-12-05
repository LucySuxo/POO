package entities;

public class Rectangle {
	
	public double width; //largura
	public double height; //altura
	
	public double area() {
		double A;
		A = width * height;
		return A;
		/*return width * height; */
	}
	
	public double perimeter() {
		double P;
		P = 2 * (width + height);
		return P;
		/*return 2 * (width + height); */
	}
	
	public double diagonal() {
		double D;
		D = Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
		return D;
		/*return Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2)); */
	}
	

	
	public String toString() {//converte tudo para string
		return  "\n AREA = "
				+ String.format("%.2f", area())	
				+ "\n PERIMETER =  "
				+ String.format("%.2f", perimeter())  
	          	+ "\n DIAGONAL =  "   
				+ String.format("%.2f", diagonal());
	}
}
