package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class ProgramStudent {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		Student estudante = new Student();
		
		System.out.println("Enter student name ");
		estudante.name = sc.nextLine();
		System.out.println("Enter first quarter grade: (at most 30)");
		estudante.t1 = sc.nextDouble();
		System.out.println("Enter second quarter grade: (at most 35)");
		estudante.t2 = sc.nextDouble();
		System.out.println("Enter third quarter grade: (at most 35)");
		estudante.t3 = sc.nextDouble();
		sc.close();

		estudante.grade();
		estudante.finale(estudante.grade());
	}

}
