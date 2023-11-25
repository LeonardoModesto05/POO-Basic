package entities;

public class DigBank {
	private int accountNumber;
	private String holder;
	private double balance;
	
	public DigBank(int accountNumber, String holder,double value)
	{
		this.accountNumber = accountNumber;
		this.holder = holder;
		this.balance += value;
	}
	
	public int getAccountNumber()
	{
		return accountNumber;
	}
	
	public void setHolder(String holder)
	{
		this.holder = holder;
	}
	
	public String getHolder()
	{
		return holder;
		
	
	}
	
	public void setBalance(double value)
	{
		this.balance += value;
	}
	
	
	public double getBalance()
	{
		return balance;
	}
	public void setWithdraw(double value)
	{
		this.balance -= value + 5;
	}
}
