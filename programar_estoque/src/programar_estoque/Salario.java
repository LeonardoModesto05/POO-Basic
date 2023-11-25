package programar_estoque;

import java.util.Locale;
import java.util.Scanner;

import entities.Imposto;

public class Salario {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		Imposto tax1 = new Imposto();
		System.out.println("Employee: ");
		tax1.name = sc.next();
		System.out.println("Gross Salary: ");
		tax1.grossSalary = sc.nextDouble();
		System.out.println("Tax");
		tax1.tax = sc.nextDouble();
		System.out.println("Employee: " + tax1.toString()); 
		System.out.print("Wich percentagem to increase salary: ");
		tax1.percentage = sc.nextDouble();
		tax1.IncreaseSalary();
		System.out.println();
		System.out.println("Update data: " + tax1);
		sc.close();

	}

}
