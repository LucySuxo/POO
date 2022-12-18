package application;

import java.util.Locale;
import java.util.Scanner;

import util.CalculatorThirdVersion;

public class ProgramThirdVersion {

	public static void main(String[] args) {
		
		
	Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter radius: ");
		double radius = sc.nextDouble(); 
		
		//Para utilizar aqueles métodos static da classe CalculatorThirdVersion
		//é só chamar o nome da classe utilitaria e chamar o método (não esqueça de importar a clase)
		//exemplo: CalculatorThirdVersion.circumference(radius)
		
		double c = CalculatorThirdVersion.circumference(radius); 
		
		double v = CalculatorThirdVersion.volume(radius); //foi chamado as alterações apartir dos objetos
		
		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", CalculatorThirdVersion.PI);
		
		
		sc.close();
	}

}
