import java.util.Scanner;
import java.util.Random;
public class fighting{
	public static void main(String[] args){
	//attribute of the attacker	
		Scanner ls = new Scanner(System.in);
		System.out.println("Monster attack");
		int monsterAttack = ls.nextInt();
		System.out.println("Monster Defence");
		int monsterDefence = ls.nextInt();
		System.out.println("monster life points");
		int monsterLife = ls.nextInt();
	//your attributes
	System.out.println("Your attack");
        int yourAttack = ls.nextInt();
       System.out.println("Your defence");
        int yourDefence = ls.nextInt();
      System.out.println("Your life points");
        int yourpoint = ls.nextInt();
      
   //create a random generator
   Random generator = new Random();
  boolean attacker = generator.nextBoolean();
if (attacker){
      System.out.println("you attack");
      int dice = generator.nextInt(6)+1 +generator.nextInt(6)+1;
     int attackValue=yourAttack+dice;
     System.out.println("Your rolled value: "+ dice);
    System.out.println("Your attackValues: "+attackValue);
 if (attackValue>monsterDefence){
     System.out.println("You succssfully atttacked");
    monsterLife = monsterLife - yourDefence;
   System.out.println("the remaining life of the moster: "+ monsterLife);
  
 }
 else{
	System.out.print("You where defeated");
 }
}
else{
	System.out.println("Monster attackered");
}
	}
}

