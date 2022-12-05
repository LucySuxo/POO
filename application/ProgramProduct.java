package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class ProgramProduct {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int add, remove;
		char acrescentar;
		char diminuir;
		
		Product produto = new Product(); //a variavel produto é do tipo composto: Product que recebe um novo Product
		
		System.out.println("Digite o nome do product: ");
        produto.name = sc.nextLine();	//está armazenando o valor digitado dentro do name que é uma tributo da classe entidade deste programa
        System.out.println("Digite o preço do product: ");
        produto.price = sc.nextDouble();
        System.out.println("Digite a quantidade de product: ");
        produto.quantity = sc.nextInt();
       

        System.out.println();
        System.out.println("Dados do produto: " + produto); //exibe o toStringo da entidade product
        
        
         
        System.out.println("Deseja acrescentar produtos? (s/n)");
        acrescentar = sc.next().charAt(0);
        if(acrescentar == 's') {
        	System.out.println("Digite a quantidade que deseja acrescentar: ");
        	 add = sc.nextInt();
        	produto.addProducts(add);
        	 System.out.println("Dados do produto: " + produto);
        }else {
        	System.out.println("Finalizado! ");
        }
        
        System.out.println("Deseja diminuir produtos? (s/n)");
        diminuir = sc.next().charAt(0); //irá ler apenas a primeira letra
        if(diminuir == 's') {
        	System.out.println("Digite a quantidade que deseja diminuir: ");
        	 remove = sc.nextInt();
        	produto.removeProducts(remove);
        	 System.out.println("Dados do produto: " + produto);
        }else {
        	System.out.println("Finalizado! ");
        }
        
        
        

		
		
		
		sc.close();

	}

}
