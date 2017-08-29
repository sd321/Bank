package bankprogram;

public class Customer {
     private String name;
     private Account account;
     
     public Customer(String nam,Account a){
    	 name=nam;account=a;
    	 
     }
     
     public void display(){
    	 System.err.println("Name : "+name+"Accountnumber : "+account.getAccountNumber()+"Balance : "+account.getBalance());
     }
     
     public String getName(){
    	 return name;
     }
     
     public Account getAccount(){
    	 return account;
     }
}
