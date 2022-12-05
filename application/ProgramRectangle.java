package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class ProgramRectangle {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		Rectangle retangulo = new Rectangle();
		
	
		
		System.out.println("Enter rectangle width"); //insira a largura do retangulo
		retangulo.width = sc.nextDouble();
		System.out.println("Enter rectangle height");
		retangulo.height = sc.nextDouble();
		
		retangulo.area();
		 retangulo.perimeter();
		retangulo.diagonal();
		
		System.out.println(retangulo);
		
		sc.close();

	}

}