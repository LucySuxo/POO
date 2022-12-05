package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class ProgramEmployee {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		
		char resposta;
		
		Employee funcionario = new Employee(); //ctrl + shift + o para fazer a importação
		
		System.out.println("enter name: ");
		funcionario.name = sc.nextLine();
		System.out.println("enter gloss salary: ");
		funcionario.grossSalary = sc.nextDouble();
		System.out.println("enter tax in percentage");
		funcionario.tax = sc.nextDouble();
		
		 funcionario.salary();
		 System.out.println(funcionario);
		
		 System.out.println("\nDo you want to increase salary? s/n ");
		 resposta = sc.next().charAt(0);
		 if (resposta == 's') {
			 System.out.println("enter the percentage");
			 funcionario.percentage = sc.nextDouble();
			 funcionario.increaseSalary(funcionario.percentage);
		 }else {
			 System.out.println("Thank you!");
		 }
		 
		 
		
		
		
		
		
		
		
		
		
		
		
		sc.close();
	}

}
