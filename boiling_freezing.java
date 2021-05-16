import java.util.Scanner;
public class boiling_freezing{
public static void main(String[] args){
	System.out.println("Enter Your temperature: ");
	Scanner rl = new Scanner(System.in);
	Double temp = rl.nextDouble();
	if(temp >=100 ){
		System.out.println("Boiling point");
	}
	else if (temp <= 99 && temp >=0){
		System.out.println("Normal point");
	}
	else{
		System.out.println("Freezing point");
	}}}
