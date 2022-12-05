package entities;

public class Product {

	public String name;
	public double price;
	public int quantity;

	
	
	
	public double totalValueInStock() {
		double total;
		total = price * quantity;
		return total;
	}
	
	public void addProducts(int quantidade) {
		this.quantity += quantidade; //está dizendo que quer acessar o atributo da classe, não o parametro da função
		
	}
	public void removeProducts(int quantidade) {
		this.quantity -= quantidade; //está dizendo que quer acessar o atributo da classe, não o parametro da função
		
	}
	
	public String toString() {//converte tudo para string
		return name	+ ", $ "	+ String.format("%.2f", price)	+ ", "+ quantity  + " unidades, Total: $ "   + String.format("%.2f", totalValueInStock());
	}
	
	
}
