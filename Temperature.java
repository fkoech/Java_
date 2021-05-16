//SCannner parses primitive types and strings using regular expressions.
//Scanner breaks its input into tokens using a delimiter pattern which by default matches whitespace.
//the result tokens may then be converted into values of different types using the various next methods.
//java.util.Scanner class is a simple text scanner which can parse primitive types and strings regular expressions.
//import is a keyword which is used to access package and its classes into the java program.
//Public keyword is an access modifier used fo classes, attributes, methods and constructors making them accessible by any other class.
import java.util.Scanner;
public class Temperature{
	public static void main(String[] args){
		System.out.println("Given in celsus value: ");
//java.util is a java package
		
		Scanner sc = new Scanner(System.in);
	//Create a variable
	double celsius = sc.nextDouble();
 double fahrenheit=9.0/5.0 *celsius+32.0; 
//print out the results
System.out.println("fahreit: "+fahrenheit);}} 
