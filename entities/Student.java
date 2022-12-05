package entities;

public class Student {
	
	public String name;
	public double t1;
	public double t2;
	public double t3;
	
	public double grade() {
		return t1+t2+t3;
	}
	
	public void finale (double grade) {
		if(grade > 59.0) {
			System.out.printf("FINAL GRADE = %.2f %nPASS", grade );
		}else {
			double valor;
			valor = 60.0 - grade;
			System.out.printf("FINAL GRADE = %.2f FAILED %nMISSING %.2f POINTS", grade, valor);
		}
	}

}
