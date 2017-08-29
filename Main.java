package bankprogram;

import java.io.*;

class Main {
	
	public static void main(String[] args) throws Exception{
		
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		int numberOfCustomers=0;
		Bank bank=new Bank();
		Customer[] c=bank.getCustomer();
		while(true){
			System.out.println("Please enter your choice");
			System.out.println("1: Add customer");
			System.out.println("2: Deposit money");
			System.out.println("3: Withdraw money");
			System.out.println("4: CheckBalance");
			System.out.println("5: Calculate Interest");
			System.out.println("6: Exit ");
			int choice=Integer.parseInt(reader.readLine());
			switch(choice)
			{
			    case 1:
			    	System.out.println("Adding a new Customer:");
			    	System.out.println("please enter the initial amount for your account : ");
			    	double bal=Double.parseDouble(reader.readLine());
			    	System.out.println("Enter your account number");
			    	String s=reader.readLine();
			    	Account account=new Account(bal,s);
			    	System.out.println("please enter your name : ");
			    	String name=reader.readLine();
			    	Customer customer=new Customer(name,account);
			    	c[numberOfCustomers]=customer;
			    	System.err.println("Name: "+name+"   2Account : "+s+"   balance : "+bal);
			    	numberOfCustomers++;
				    break;
			    case 2:
			    	System.out.println("Enter your account number : ");
			    	s=reader.readLine();
			    	if(numberOfCustomers==0)
			    	{
			    		System.err.println("Account not found");
			    	}
			    	else
			    	{
			    		boolean found=false;
			    		for(int i=0;i<numberOfCustomers;i++){
			    			Account temp=c[i].getAccount();
			    			String accTemp=temp.getAccountNumber();
			    			if(accTemp.equals(s))
			    			{
			    				System.out.println("Enter the amount to be deposited : ");
			    				double money=Double.parseDouble(reader.readLine());
			    				temp.deposit(money);
			    				found=true;
			    			}
			    		}
			    		if(found==false)
			    		{
			    			System.err.println("Account number not found");
			    		}
			    	}
			    	
			    	break;
			    case 3:
			    	System.out.println("Enter your account number : ");
			    	s=reader.readLine();
			    	if(numberOfCustomers==0)
			    	{
			    		System.err.println("Account not found");
			    	}
			    	else
			    	{
			    		boolean found=false;
			    		for(int i=0;i<numberOfCustomers;i++){
			    			Account temp=c[i].getAccount();
			    			String accTemp=temp.getAccountNumber();
			    			if(accTemp.equals(s))
			    			{
			    				System.out.println("Enter the amount to be withdrawn: ");
			    				double money=Double.parseDouble(reader.readLine());
			    				temp.withdraw(money);
			    				found=true;
			    			}
			    		}
			    		if(found==false)
			    		{
			    			System.err.println("Account number not found");
			    		}
			    	}


                   
			    	break;
			    case 4:
			    	System.out.println("Enter your account number : ");
			    	s=reader.readLine();
			    	if(numberOfCustomers==0)
			    	{
			    		System.err.println("Account not found");
			    	}
			    	else
			    	{
			    		boolean found=false;
			    		for(int i=0;i<numberOfCustomers;i++){
			    			Account temp=c[i].getAccount();
			    			String accTemp=temp.getAccountNumber();
			    			if(accTemp.equals(s))
			    			{
			    				System.out.println("Balance :  "+temp.getBalance());
			    				
			    			}
			    		}
			    		if(found==false)
			    		{
			    			System.err.println("Account number not found");
			    		}
			    	}
			    	
			    	break;
			    case 5:
			    	System.out.println("Enter your account number : ");
			    	s=reader.readLine();
			    	if(numberOfCustomers==0)
			    	{
			    		System.err.println("Account not found");
			    	}
			    	else
			    	{
			    		boolean found=false;
			    		for(int i=0;i<numberOfCustomers;i++){
			    			Account temp=c[i].getAccount();
			    			String accTemp=temp.getAccountNumber();
			    			if(accTemp.equals(s))
			    			{
			    				bank.calculateInterest(c[i]);
			    				found=true;
			    				
			    			}
			    		}
			    		if(found==false)
			    		{
			    			System.err.println("Account number not found");
			    		}
			    	}
			    	break;
			    case 6:
			    	System.exit(0);
			    	break;
			    default:
			    	break;
			    
			    	
			
			}

			
		}
		
		
		
		
	}

}
