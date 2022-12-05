package entities;//entities porque estamos considerando que o triangulo é um entidade do nosso bussines

public class Triangle {//nome da classe
	
	//Os atributos da nossa função
	
		public double a;//Atributos da classe                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  
		public double b;
		public double c;
		//o prefixo "public" indica que o atributo ou método pode ser usado em outros arquivos
		// METODO:
		public double area() { //quando está vazia significa que vai pegar todos os atributos que existem nessa entidade. //o Double é o tipo de dad que o método retorna (se o método não retorna nada, usa-se a palavra void)
			double A, R;
		A = (a + b + c) /2.0;
		R = Math.sqrt(A*(A-a)*(A - b)*(A - c));//corpo do método
		 return R;
			
		}
		
		public static void show(double value) {
			
			System.out.printf("Area do triangulo por ordem em que foi digitado: %.2f%n", value);
		}
		
		public static void comparation(double value1, double value2) {
			
			if(value1 > value2 ) {
				System.out.println("A area mais grande é a área X");
			}else {
				System.out.println("A area mais grande é a area Y");
			}
		}

}
