package programar_estoque;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Dolar {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		System.out.print("What is the dolar price? ");
		double dolarPrice = sc.nextDouble();
		System.out.print("How many dollar will be bought? ");
		double dolarBought = sc.nextDouble();
		double paid = CurrencyConverter.paidInReais(dolarPrice, dolarBought);
		System.out.println();
		System.out.printf("Amount to be paid in reais = %.2f",paid );
		sc.close();
	}

}
