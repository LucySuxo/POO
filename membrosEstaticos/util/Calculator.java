package util;

public class Calculator {

	//Quando não utilizamos a palavra reservada: static, Todos os métodos para serem utilizados devem ser instanciado em uma classe
	
	public  final double PI = 3.14159; 
	
	public  double circumference(double radius) { 
		return 2.0 * PI * radius; 
	}
	
	public  double volume(double radius) {
		return 4.0 * PI * radius * radius * radius / 3.0;
	}
}
