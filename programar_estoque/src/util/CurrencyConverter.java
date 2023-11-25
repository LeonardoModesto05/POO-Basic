package util;

public class CurrencyConverter {
	public static double paidInReais(double dolarPrice, double dolarBrought)
	{
		return dolarPrice * dolarBrought + (dolarPrice * dolarBrought * 0.06);
	}
}
