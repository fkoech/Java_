import java.util.Scanner;
//a class that contain the main method
public class BankingApp{
	public static void main(String[] args){
		/**
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Number ");
		int a =scanner.nextInt();
		System.out.println("value "+ a);
		*/
		BankingAccount obj1 = new BankingAccount();
		obj1.showMenu();
	}
}
//another class
class BankingAccount{
	int balance;
	int previousTransaction;
	String customerName;
	String customerId;
//a constructor
    void   BankingAccount(String cname, String cid)
    {
	    customerName = cname;
	    customerId = cid;


  }
  //method

  void deposit(int amount)
  {
	  if(amount != 0)
	  {
	  balance = balance + amount;
	  previousTransaction = amount;
	  }
  }
  //method
  void withdraw(int amount)
  {
	  if(amount != 0)
	  {
		  balance = balance - amount;
		  previousTransaction = - amount;
	  }
  }
  //method
  void getPreviousTransaction()
  {
	  if(previousTransaction > 0)
	  {
		  System.out.println("Deposited "+ previousTransaction);
	  }
	  else if(previousTransaction < 0)
	  {
		  System.out.println("Withdraw: "+ Math.abs(previousTransaction));
          }
	  else
	  {
		  System.out.println("No transaction occured");
	  }
  }
  //method

  void showMenu()
  {    
	  //when terminating a string, the logically char c = 0 is equivalent to char c='\0'
	  //since null(ASCII) byte is 0 but usually poeople tend to do '\0' instead
	  //Emphasize the character nature of some expression, but the numeric value is just 0.
	  
	  char option = '\0';
	  Scanner scanner = new Scanner(System.in);
	  System.out.println("Welcome "+ customerName);
	  System.out.println("Your id "+ customerId);
	  System.out.println("\n");
	  System.out.println("A. check balance ");
	  System.out.println("B. Deposit");
          System.out.println("C. withdraw");
	  System.out.println("D. Previous transaction");
	  System.out.println("E. exit");
  
  do{
	  System.out.println("---------------------------------------------");
	  System.out.println("Enter an option");
	  System.out.println("------------------------------------------");
	  option=scanner.next().charAt(0);
	  System.out.println("\n");
	  

	  switch(option)
	  {
	 case 'A':
	     System.out.println("-----------------------");
	     System.out.println("Balance "+ balance);
	     System.out.println("---------------------");
	     System.out.println("\n");
	     break;

	 case 'B':
	     System.out.println("-------------------------");
	     System.out.println("Enter an amount to deposit: ");
	     System.out.println("----------------------------");
	     int amount  = scanner.nextInt();
	     deposit(amount);
	     System.out.println("\n");
	     break;
	 case 'C':
	     System.out.println("-----------------------");
	     System.out.println("how much do you want to withdraw ");
	     System.out.println("-----------------------------");
	     int amount2 = scanner.nextInt();
	     System.out.println("\n");
	     break;
	 case 'D':
	     System.out.println("----------------------------------");
	     getPreviousTransaction();
	     System.out.println("-------------------------------");
	     System.out.println("\n");
	     break;
	  case 'E':
	     System.out.println("---------------------------------");
	     break;
	   default:
	     System.out.println("Invalid option please enter again");
	     break;

     }
  }while(option != 'E');
	    System.out.println("Thank you for using our service");
  }
}
   



