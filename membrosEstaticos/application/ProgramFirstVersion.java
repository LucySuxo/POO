package application;

import java.util.Locale;
import java.util.Scanner;

public class ProgramFirstVersion {
	
    public static final double PI = 3.14159; //final é uma palavra reservada para dizer que esse membro estatico é uma constante e que não irá mudar o valor
    //se fosse apenas public static double PI = 3.14159 seria um membro estatico variavel que poderia mudar de valor
    //O NOME DADO AO MEMBRO DEVE CONTEM APENAS LETRAS MAIUSCULAS E CASO SEJA MAIS DE UMA PALAVRA USA-SE _ (underline) como espaço.
    
	public static void main(String[] args) { //O método main por padrão é estático
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter radius: ");
		double radius = sc.nextDouble(); //o nome da variavel pode ser outro não necessariamente o mesmo nome do parametro do membro estatico
		
		double c = circumference(radius); //variavel c vai receber o valor do resultado do metodo estatico 
		
		double v = volume(radius);
		
		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", PI);
		
		
		sc.close();

		
	}
	
	//Os métodos dentro de uma classe que já é static devem ser static
	
	public static double circumference(double radius) { //membro estatico circumference que recebe como parametro um valor double, ou uma variavel que possui um valor double dentro de si
		return 2.0 * PI * radius; //metodo estatico variavel que pode alterar de valor, já que não está com a palavra final 
	}
	
	public static double volume(double radius) {
		return 4.0 * PI * radius * radius * radius / 3.0;
	}
//OBS: Dentro de uma classe você não pode chamar outros métodos que não sejam static, APENAS PODEM SER INSERIDAS METODOS STATIC DENTRO DE UMA CLASSE
}
