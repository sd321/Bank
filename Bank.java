package bankprogram;

public class Bank {
      private double transactionFees=10;
      private double interestRate=8;
      //private double interestAmount;
      private Customer[] customers=new Customer[1000];
      
      public double getTransactionFees(){
    	  return transactionFees;
      }
      
      public void calculateInterest(Customer customer){
    	  Account a=customer.getAccount();
    	  double bal=a.getBalance();
    	  double interestAmount=bal*interestRate/100;
    	  double totalBalance=bal+interestAmount;
    	  System.err.println("InterestAmount : "+interestAmount+" Total balance : "+totalBalance );
      }
      
      public double getInterestRate(){
    	  return interestRate;
      }
      
      public Customer[] getCustomer()
      {
    	  return customers;
      }
      
}
