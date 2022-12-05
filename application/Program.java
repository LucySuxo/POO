package application;




import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double xA, xB, xC, yA, yB, yC, P1, P2, R;
		
		System.out.println("Digite os lados do triangulo X: ");
		xA = sc.nextDouble();
		xB = sc.nextDouble();
		xC = sc.nextDouble();
		System.out.println("Digite os lados do triangulo Y: ");
		yA = sc.nextDouble();
		yB = sc.nextDouble();
		yC = sc.nextDouble();
		
		
		
		
		P1 = area(xA,xB,xC);
		System.out.printf("Resultado do triangulo X: %.2f%n", P1);
		P2 = area(yA,yB,yC);
		System.out.printf("Resultado do triangulo Y: %.2f%n", P2);
		
		res(P1,P2);
		
		
		
		
		sc.close();

	}
	
	public static double area (double X, double Y, double Z) {
		
		double p;
		double puesta;
		
		p = (X + Y + Z) /2;
		puesta = Math.sqrt(p*(p-X)*(p-Y)*(p-Z));
		return puesta;
		
		
	}
	
	public static void res (double A1, double A2) {
		
		
		if(A1 > A2) {
			System.out.println("A maior area é o: " +  A1);
		}else {
			System.out.println("A maior area é o: " +  A2);
		}
	}

}
