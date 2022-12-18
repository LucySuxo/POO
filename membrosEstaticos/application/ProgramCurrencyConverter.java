package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class ProgramCurrencyConverter {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		
		/*System.out.println("Whtas is the dollar price?");
		double dollar = sc.nextDouble();*/
		
		System.out.println("How many dollar will be bought?");
		double paid = sc.nextDouble();
		
		paid = CurrencyConverter.iof(paid);
		
		/*double x = CurrencyConverter.iofOther(paid,dollar); */
		
		System.out.printf("Amount to be paid in reais = %.2f%n ", paid);
		
		/*System.out.printf("Amount to be paid in reais = %.2f%n ", x);*/

		sc.close();
	}

}
