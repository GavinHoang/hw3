package hw3;

public class BankAccount implements Comparable<BankAccount>{
	private int accountNumber;
	private double balance; 

	//constructor 1
	public BankAccount()
	{
		accountNumber = 0;
		balance = 0;
	}
	
	//constructor 2
	public BankAccount(int accountNum, double initialBalance)
	{
		accountNumber = accountNum;
		balance = initialBalance;
	}
	
	//setter method
	public void deposit(double x)
	{
		balance += x;
	}
	
	public double getbalance()
	{
		return balance;
	}
	
	public int getAccountNumber()
	{
		return accountNumber;
	}
	
	public void withDraw(double amount)
	{
		balance -= amount;
	}
	
	@Override
	public int compareTo(BankAccount arg0) { // Collections.sort(list) will do the job defined follow
		// TODO Auto-generated method stub
		if(balance < arg0.balance )  // < will make the balance in increasing order
			return -1;
		else if(balance > arg0.balance)
			return 1;
		else 
			return 0;
	}
	

	
	
}
