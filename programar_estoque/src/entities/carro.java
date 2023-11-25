package entities;

public class carro {
	public String marca;
	public String modelo;
	public int ano;
	public String carOn;
	
	public String toString()
	{
		return "Marca:" + marca + " Modelo:" + modelo + " Ano:" + ano;
	}
	public String ligar(int on)
	{
		if (on == 1)
		{
			carOn = "O carro está ligado";
		} else
		{
			carOn = "O carro está desligado";
		}
		return carOn;
	}
}
