package bank;

import java.util.ArrayList;

public class Bank2

{   
	
   	
   class Bank  {
	   
         accounts = new ArrayList<BankAccount>();
      
   }


   public void addAccount(int anAccountNumber, double initialDeposit) {
	   
	   accounts.add(new BankAccount(anAccountNumber));
	   
   }
   
   
   public void deposit(int anAccountNumber, double amount) {
	   
	   BankAccount.deposit(amount);
      
   }
   
   
   public void withdraw(int anAccountNumber, double amount) {
	   
   }

 
   public double getBalance(int anAccountNumber) {
	   
      double total = 0;
      
      for (BankAccount account : accounts)
    	  
      {
    	  
         total = total + account.getBalance();
         
      }
      
      return total;
      
   }
   
  
   public void suspendAccount(int anAccountNumber) {
   }

 
   public void openAccount(int anAccountNumber) {
   }

   public void closeAccount(int anAccountNumber) {
	   
   }
   
   public String getAccountStatus(int anAccountNumber) {
	   
	   String accountStatus = getAccountStatus(anAccountNumber);
	   
	   return accountStatus;
	   
   }

   public String accountTransactionsString(int anAccountNumber) {
	   
	   String accountTransactions = accountTransactionsString(anAccountNumber);
	   
	   return accountTransactions;
	   
   }
   
  
    public String summarizeAllAccounts(){
    
       String acctSum = "Bank Account Summary \n \n" + "Account \t \t Balance \t #Transactions \t \t Status \n";
 	   
 	   for (BankAccount account : accounts)
 		   
 	      {
 		      acctSum += account.transactionsString() + "\t\t " + account.getBalance() + "\t\t\t " + account.numTransactions() + "\t\t\t\t" + account.getStatus() + "\n";
 	      }
 	   
 	   return acctSum;
 	   
    }
    
 
    public BankAccount find(int anAccountNumber)
    
    {
    	
    	for (BankAccount account : accounts)
    		
    {
    		
       if (account.getAccountNumber() == anAccountNumber) // Found a match
          return account;
       
    } 
    	  
    
 }

   private ArrayList<BankAccount> accounts;
   
}