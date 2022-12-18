package util;

public class CurrencyConverter {

	//Criando um metodo static final=(ou seja o valor não altera) do preço do dollar
	public static final double DOLLAR = 3.10;
	
	
	public static double iof (double valor) {
		double R = valor * DOLLAR; //620
		double F = R * 0.06;
		return R + F;
	}
	
	/*public static double iofOther (double valor, double dollar) {
		double R = valor * dollar; //620
		double F = R * 0.06;
		return R + F;
	}*/
	

	
	
}
