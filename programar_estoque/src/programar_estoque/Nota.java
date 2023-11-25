package programar_estoque;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Nota {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		Student sGrade = new Student();
		sGrade.name = sc.next();
		sGrade.grade1 = sc.nextDouble();
		sGrade.grade2 = sc.nextDouble();
		sGrade.grade3 = sc.nextDouble();
		System.out.println(sGrade);
		if (sGrade.finalGrade() < 60.0)
		{
			System.out.println("Failed");
			System.out.printf("Missing %.2f Points", sGrade.missingGrade());
		}else
		{
			System.out.println("Pass");
		}
		sc.close();
	}

}
