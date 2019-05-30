import java.util.Scanner; // This will only import the Scanner from the Java Util library.
//import java.util.*; // This will import every single thing in the Java Util library.

public class LearningJava{
	static Scanner userInput = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Your favorite number: "); 
//		Unlike "println", "print" doesn't break the line after the output
		
		if(userInput.hasNextInt()) { //.hasNextInt() checks if the user's input is an Int or not; Int can be replaced by all data types
			int numberEntered = userInput.nextInt();
			System.out.println("You entered is " + numberEntered);
			
			int numberEnteredTimes2 = numberEntered * 2;
			System.out.println("You entered times 2 is " + numberEnteredTimes2);
			
			int numberABS = Math.abs(numberEntered);
			int whichIsBigger = Math.max(6, 7);
			int whichIsSmaller = Math.min(5, 2);
			
			double numSqrt = Math.sqrt(5.23); // Make sure that the sqrt is stored in a double variable
			
			int numCeiling = (int) Math.ceil(5.23);
			int numFlooring = (int) Math.floor(5.23);
			int numRounding = (int) Math.round(5.23);
			
			int randomNumber = (int) (Math.random() * 11);
			
			System.out.println(randomNumber);
			
			
		}else {
			System.out.println("Enter an integer next time.");
		}
	}
}