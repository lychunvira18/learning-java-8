public class HelloWorld {
//	This is how to declare class variables
//	static String randomString = "String to print"; 
	
//	This is how to declare constant class variables 
//	static final double PINUM = 3.141529;
	
	public static void main(String[] args) { // Static declares that this function can be used by the class 
//		System.out.println(PINUM);
		
//		This is how to declare a normal variable
//		int integerOne = 22;
//		This is an expression statement
//		int integerTwo = integerOne + 1;
		
		byte bigByte = 127; // Smallest Value of a byte is -128
		short bigShort = 32767; // Smallest Value of a short is -32768
		int bigInt = Integer.MAX_VALUE;// Biggest Value of int is 2.1 billion 
		long bigLong = 9220000000000000000L; // You need to end a long number with an "L"
		float bigFloat = 3.14F; // You need to end a float with an "F"; the decimal points that floats can store is machine dependant
		double bigDouble = 3.14823235134239D; // You can add a D to the end of a double but it is not necessary
		
		System.out.println(Float.MAX_VALUE);
		System.out.println(Double.MAX_VALUE);
		
		boolean trueOrFalse = true;
		
		char randomChar = 65; // Can store ASCII values that will get displayed when you print it out
		char anotherChar = 'A';
		char escapedChars = '\b';
		
		String randomString = "Bruh.exe";
		String anotherString = "Stuff";
		
		String andAnotherString = randomString + " " + anotherString;
		
		String byteString = Byte.toString(bigByte);
		String shortString = Short.toString(bigShort);
		String intString = Integer.toString(bigInt);
		String booleanString = Boolean.toString(trueOrFalse);
		
		int doubleToInt = (int) bigFloat;
		
		int stringToInt = Integer.parseInt(intString);
		
		System.out.println(randomChar);
		System.out.println(anotherChar);
		System.out.println(andAnotherString);
		System.out.println(byteString);
		System.out.println(doubleToInt);
		
		// END
	}
}