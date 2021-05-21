//A simple interest calculator in java
//SI = principle*rate/100*time
//where SI is the simple interest
//principle is represented by P
//rate is represented by R
// and time is represented by T
import java.util.Scanner;
public class SimpleInterest{
   public static void main(String[] args){
   int SI;
   //Fetch input from the keyboard
   // import the scanner library.
   System.out.print("Enter the principle: ");
   Scanner pr = new Scanner(System.in);
   int P = pr.nextInt();
   System.out.print("Enter the rate: ");
   Scanner r = new Scanner(System.in);
   int R = r.nextInt();
   System.out.print("Enter the time: ");
   Scanner T = new Scanner(System.in);
   int t = T.nextInt();
   SI = P*R/100*t;
   System.out.println("the simple Interest will be: " + SI);
   int Amount = SI + P;
   System.out.println("While the Amount will be: " + Amount);
  }
}