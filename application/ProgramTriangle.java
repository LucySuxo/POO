package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class ProgramTriangle {

	public static void main(String[] args) {
		//Objetos: são instâncias da classe (ex: trinagulo x e Y) < são objetos
		//Classe: é a definição do tipo (são todos os elementos que estão na classe entidade)
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Triangle x, y, r1, r2, compara; //variavei x e y do tipo Triangle (tipo composto porque tem três atributos)
		x = new Triangle(); //instanciamos a variavel e alocamos ela.
		//objeto
		y = new Triangle (); //instanciamos a variavel e alocamos ela no heap (onde são criados os objetos dinamicos)
		
		r1 = new Triangle();
		
		r2 = new Triangle();
		
		compara = new Triangle();
		
		System.out.println("Digite os valores do traingulo X: ");
        x.a = sc.nextDouble();		
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		System.out.println("Digite os valores do traingulo Y: ");
        y.a = sc.nextDouble();		
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		double areaX = x.area(); //chamada do metodo que irá calcular a area do triangulo
		double areaY = y.area();
		
		r1.show(areaX);
		
		r2.show(areaY);
		
		compara.comparation(areaX, areaY);
		
        sc.close();


	}

	

}
