import java.util.Arrays;

public class LearningJava{
	
	public static void main(String[] args) {
		
		String randomString = "I'm a random string";
		
		String gotToQuote = "He said,\"I'm here\"";
		
		int numTwo = 2;
		
		System.out.println(randomString + " " + gotToQuote + " " + numTwo);
		
		String uppercaseStr = "BIG";
		String lowercaseStr = "big";
		
		if(uppercaseStr.equalsIgnoreCase(lowercaseStr)) {
			System.out.println("They are equal");
		}
		
		String letters = "abcde";
		String moreLetters = "fghijk";
		
//		System.out.println("2nd char : " + letters.charAt(1));
//		
//		System.out.println(letters.compareTo(moreLetters));
//		
//		System.out.println(letters.contains("abc"));
//		
//		System.out.println(letters.endsWith("de"));
//		
//		System.out.println(letters.startsWith("ab"));
//		
//		System.out.println(letters.indexOf("cd"));
//		
//		System.out.println(letters.indexOf("ab",2));
//		
//		System.out.println(letters.lastIndexOf("ab"));
//		
//		System.out.println("Length: " + letters.length());
//		
//		System.out.println(letters.replace("ab", "zy"));
		
//		String[] letterArray = letters.split("");
//		
//		System.out.println(Arrays.toString(letterArray));
//		
//		char[] charArray = letters.toCharArray();
//		
//		System.out.println(Arrays.toString(charArray));
//		
//		System.out.println(letters.substring(1,4));
//		
//		System.out.println(letters.toUpperCase());
//		
//		System.out.println(letters.toLowerCase());
		
		String randString = "    abcde";
		
		System.out.println(randString.trim());
		
		StringBuilder randSB = new StringBuilder("A random value");
		
		System.out.println(randSB.append(" again"));
		
		System.out.println(randSB.delete(15, 21));
		
		System.out.println(randSB.capacity());
		
		randSB.ensureCapacity(60);
		
		System.out.println(randSB.capacity());
		
		System.out.println(randSB.length());
		
		randSB.trimToSize();
		
		System.out.println(randSB.insert(1, "nother"));
		
		String oldSB = randSB.toString();
		
		
		
	}
	
}