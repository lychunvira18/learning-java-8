public class LearningJava{
	public static void main(String[] args) {
//		int randomNumber = (int) (Math.random() * 50);
//		
//		if(randomNumber < 25) {
//			System.out.println("The random number is less than 25");
//			
//		}else if(randomNumber > 40) {
//			System.out.println("The random number is over 40");
//		}else if(randomNumber == 18) {
//			System.out.println("The random number is 18");
//		}else if(randomNumber != 18){
//			System.out.println("The random number is not 18");
//		}else {
//			System.out.println("Nothing worked.");
//		}
//		if(!(false)) {
//			System.out.println("False turned into true.");
//		}
//		
//		if((true) && (true)) {
//			System.out.println("Printed when both sides are true.");
//		}
//		
//		if((true) ^ (true)) { // Returns true if one is true and one is false
//			System.out.println("One is true");
//		}
//		
//		System.out.println("The random number is " + randomNumber);
		
		
		
//		int valueOne = 1;
//		int valueTwo = 2;
//		
//		int biggestValue = (valueOne > valueTwo) ? valueOne : valueTwo;
//		
//		System.out.println("The biggest number is " + biggestValue);
		
		
		
		char theGrade = 'B';
		switch (theGrade) {
		case 'A':
			System.out.println("Great job!");
			break;
		case 'B':
			System.out.println("Good job!");
			break;
		case 'C':
			System.out.println("OK");
			break;
		case 'D':
			System.out.println("Bad");
			break;
		default:
			System.out.println("You failed");
			break;
		}
	}
}