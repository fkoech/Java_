import java.util.Scanner;
public class Boiling{
	public static void main(String[] args){
		System.out.println("Enter the temperature: ");
		Scanner sc = new Scanner(System.in);
		int temperature = sc.nextInt();
		if (temperature >=100 ){
			System.out.println("The water is boiling");}
			else{
				System.out.println("Inrease the temperature for it to boil since it is below the boiling point");}}}
