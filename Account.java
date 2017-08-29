package bankprogram;

public class Account {

	private double balance=100;
	private String accountNumber;
	private boolean firstTime=true;
	
	public Account(String acc){
		this(100,acc);
	}
	
	public Account(double bal,String acc){
	     if (bal >= 100) {
	            balance = bal;
	        } else {
	            balance = 100;
	        }
	        accountNumber = acc; 
	}
	
	public void deposit(double howmuch){
		if(howmuch > 0)
		{
			balance += howmuch;
			System.err.println(howmuch+" succesfully deposited into your accont,your new balance is "+balance );
		}
		else
		{
			System.err.println("you cannot add this amount please enter again a appropriate amount");
		}
	}
	
	public void withdraw(double howmuch){
		if(howmuch > 0)
		{
			if(firstTime==true)
			{
				double tempbalance=balance;
				tempbalance -= howmuch;
				if(tempbalance>=100)
				{
					balance=tempbalance;
					System.err.println(howmuch+" is withdrawn from your account,your new balance is "+balance);
				}
				else
				{
					System.err.println("you cannot withdraw this much of amount please enter again");
				}
				firstTime=false;
			}
			else
			{
			   Bank bank=new Bank();
			   double tf=bank.getTransactionFees();
			   double tempbalance=balance;
			   tempbalance=tempbalance-howmuch-tf;
			   if(tempbalance>100)
			   {
				   balance=balance-tf-howmuch;
				   System.err.println(howmuch+" is withdrawn from your account,your new balance is "+balance);
			   }
			   else
			   {
				   System.err.println("cannot withdraw this amount please check and enter again");
			   }
			}
		}
		else
		{
			System.err.println("you me are you fucking out of your mind");
		}
	}
	
	public double getBalance(){
		return balance;
		
	}
	
	public String getAccountNumber(){
		return accountNumber;
	}
	
}
