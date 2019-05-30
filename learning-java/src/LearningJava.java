//public class LearningJava{
//	public static void main(String[] args) {
//		divideByZero(2);
//	}
//	public static void divideByZero(int a) {
//		try {
//			System.out.println(a / 0);
//		} catch (ArithmeticException e) {
//			System.out.println("You divided by zero!");
//			System.out.println(e.getMessage()); // Prints out what causes the exception at the first place
//			System.out.println(e.toString()); // Prints out the name of the exception; basically turns the event that happened and print it out
//			e.printStackTrace(); // Prints out the regular error message that would show if the exception was not tried and caught
//		}
//	}
//}


//import java.util.*;
//public class LearningJava{
//	static Scanner userInput = new Scanner(System.in);
//	public static void main(String[] args) {
//		System.out.print("How old are you? : ");
//		int age = checkValidAge();
//		
//		if (age != 0) {
//			System.out.println("You are " + age + " years old.");
//		}
//	}
//	
//	public static int checkValidAge() {
//		try {
//			return userInput.nextInt();
//		} catch (InputMismatchException e) {
//			userInput.hasNext(); // Discards and skips what the user has input and goes for the next input
//			System.out.println("That isn't a whole number");
//			return 0;
//		}
//	}
//}


//import java.io.*;
//public class LearningJava{
//	public static void main(String[] args) {
//		getAFile("./somestuff.txt");
//	}
//	
//	public static void getAFile(String fileName){
//		try {
//			FileInputStream file = new FileInputStream(fileName);
//		} catch (FileNotFoundException e) {
//			System.out.println("Sorry can't find that file");
//		} catch (IOException e) {
//			System.out.println("Unknown IO Error");
//		} catch (Exception e) {
//			System.out.println("Some error occurred.");
//		} finally {
//			System.out.println("Bruh");
//		}
//	}
//}


import java.io.*;
public class LearningJava {
	public static void main(String[] args) {
		try {
			getAFile("./somestuff.txt");
		} catch(Exception e) {
			System.out.println(e.toString());
		}
	}
	
	public static void getAFile(String fileName) throws IOException, FileNotFoundException {
		FileInputStream file = new FileInputStream(fileName);
	}
}