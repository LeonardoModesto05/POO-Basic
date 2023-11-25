package entities;

public class Imposto {
	public String name;
	public double grossSalary;
	public double tax;
	public double percentage;
	
	public double netSalary()
	{
		return grossSalary - tax;
	}
	
	public String toString()
	{
		return  name + " $ " + netSalary();
	}
	public void IncreaseSalary()
	{
		grossSalary += (grossSalary * percentage) / 100.0;
	}
}
