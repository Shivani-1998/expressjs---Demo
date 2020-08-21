#Abstract Class Method

public abstract class BankAccount {
     public static void main (String args[]);
	double balance;
	double interestRate;
	double monthlyFee;

	int numberOfDeposits = 0;
	int numberOfWithdrawals = 0;
	
	BankAccount(double bal, double interest, double cost) {
		balance = bal;
		interestRate = interest;
		monthlyFee = cost;
	}
	

	public void deposit(double depositAmount) {
		balance += depositAmount;
		numberOfDeposits++;
	}
	
	public void withdrawal(double withdrawalAmount) {
		balance -= withdrawalAmount;
		numberOfWithdrawals++;
	}
	
	public void addInterest() {
		double monthlyInterestRate = (getInterestRate() / 100) / 12;
		double monthlyInterest = balance * monthlyInterestRate;
		balance += monthlyInterest;
	}
	
	 
	public void monthlyTotalAmount() {
		balance -= monthlyFee;
		addInterest();
		numberOfDeposits = 0;
		numberOfWithdrawals = 0;
	}
	
	
	public void setMonthlyFee(double newFee)
	{		
		monthlyFee = newFee;
	}
	

	public double getBalance()
	{		
		return balance;
	}
	
	public int getNumberOfDeposits()
	{		
		return numberOfDeposits;
	}
	
	
	public int getNumberOfWithdrawals()
	{		
		return numberOfWithdrawals;
	}
	
	public double getInterestRate()
	{		
		return interestRate;
	}
	
	 
	public double getMonthlyFee()
	{		
		return monthlyFee;
	}
	
	
	public abstract void withdraw();
	
	 
	public abstract void deposit();
	
	public abstract void monthlyTotal();
}
