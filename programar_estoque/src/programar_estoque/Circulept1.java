package programar_estoque;

import java.util.Locale;
import java.util.Scanner;

import util.Calculator;

public class Circulept1 {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Enter radio: ");
		double radius = sc.nextDouble();
		
		double c = Calculator.circuference(radius);
		
		double v = Calculator.volume(radius);
		
		System.out.printf("Circuference: %.2f%n ", c);
		System.out.printf("volume: %.2f%n ", v);
		System.out.printf("PI: %.2f%n ", Calculator.PI);
	}
	
}
