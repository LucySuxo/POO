package entities;

public class Employee {

	public String name; 
	public double grossSalary; //salario bruto
	public double tax;
	public double percentage;
	
	public double salary() {
		double finale;
		finale = grossSalary - tax;
		return finale;
	}
	
	public String toString() {
		return "Employee: "
				+ name 
				+ ", $ "
				+ String.format("%.2f", salary());
	}
	
	public void increaseSalary(double percentage) {
		this.percentage = percentage;
		double finale;
		finale = (grossSalary * percentage / 100) + grossSalary - tax;
		System.out.printf("Updated data: %s, $ %.2f", name, finale);
	}
}
