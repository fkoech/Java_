import java.util.Scanner;
public class ifelse{
	public static void main(String[] args){
		Scanner number = new Scanner(System.in);
		System.out.print("Enter Your Number of comparison: ");
               int Number = number.nextInt();
      		if (Number > 90 ){
			System.out.println("A material");
		}
		else if(Number < 90 && Number > 40){
			System.out.print("You have succeeded");
		}
		else{
			System.out.println("You have failed");
		}
	}
}
