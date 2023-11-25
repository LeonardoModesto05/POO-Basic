package entities;

public class Desafio {
	public double peso;
	public double idade;
	public double gotas;
	public double dosagem()
	{
		if (idade >= 12 && peso >= 60)
		{
			gotas = (1000/500.0) * 20.0;
		} else
		if (idade < 12 && peso >= 5 && peso <= 9)
		{
			gotas = (125.0/500.0) * 20.0;
		} else
		if (idade < 12 && peso >= 9.1 && peso <= 16)
		{
			gotas = (250.0/500.0) * 20.0;
		} else
		if (idade < 12 && peso >= 16.1 && peso <= 24)
		{
			gotas = (375.0/500.0) * 20.0;
		} else 
		if (idade < 12 && peso >= 24.1 && peso <= 30)
		{
			gotas = (500.0/500.0) * 20.0;
		} else
		if (idade <12 && peso > 30 && peso < 60)
		{
			gotas = (750.0/500.0) * 20.0;
		}
		return gotas;
	}
	public String toString()
	{
		return "O numero de dosagens é: " + dosagem();
	}
}
