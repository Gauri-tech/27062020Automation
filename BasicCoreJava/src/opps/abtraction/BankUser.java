package opps.abtraction;

public class BankUser {

	public static void main(String[] args) {
		account(new SBI()); //SBI==Chrome
		account(new HDFC());//HDFC== Firefox
		account(new ICICI()); //ICICI= Edge
		

	 String name ="Sudha";
	 RBI bank= new ICICI();
	  int a=10;
	  
	  sum(a);
	  message(name);
	  account(bank);
	  
	  sum(20);
	  message("Gauri");
	  
	  RBI bank1;
	bank1=new SBI();
	
	bank1.debitCard();
	bank1.creditCard();
	bank1.savingAccount();
	bank1.currentAccount();
	}

    public static void account(RBI bank)//RBI==WedDriver
    {
    bank.creditCard();//navigate
    bank.savingAccount();//click
    bank.debitCard();//enter data
    bank.currentAccount();//select option
    }
    
public static void sum(int a)
{
System.out.println(10+a);

}

public static void message ( String name)
{
	System.out.println("Your name is ="+name);
}






}
    

