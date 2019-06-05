import java.util.Arrays;
import java.util.LinkedList;

public class LearningJava{
	
	public static void main(String[] args) {
	
		LinkedList linkedListOne = new LinkedList();
		
		LinkedList<String> names = new LinkedList();
		
		names.add("SURAN");
		names.add("Cracker");
		
		names.addLast("Paul Kim");
		
		names.addFirst("Eric Nam");
		
		names.add(0, "TWICE");
		
		names.set(2, "ITZY");
		
		names.remove(4);
		
		names.remove("Eric Nam");
		
		System.out.println("\nFirst Index : " + names.get(0));
		
		System.out.println("\nLast Index : " + names.getLast());
		
		LinkedList<String> namesCopy = new LinkedList<String>(names);
		
		System.out.println("\nFirst Index : " + namesCopy.get(0));
		
		System.out.println("\nLast Index : " + namesCopy.getLast());
		
		System.out.println();
		
		for(String name : names) {
			
			System.out.println(name);
			
		}
		
		if(names.contains("TWICE")) {
			System.out.println("\nTWICE is HERE!");
		}
		
		if(names.containsAll(namesCopy)) {
			System.out.println("\nSame music taste!");
		}
		
		System.out.println("\nTWICE index at: " + names.indexOf("TWICE"));
		
		System.out.println("\nList Empty ? : " + names.isEmpty());
		
		System.out.println("\nList size : " + names.size());
		
		System.out.println("\nLook without Error : " + names.peek());
		
		System.out.println("\nRemove first element : " + namesCopy.poll());
		
		System.out.println("\nRemove last element : " + namesCopy.pollLast());
		
		namesCopy.push("TWICE");
		
		for(String name : namesCopy) {
			
			System.out.println(name);
			
		}
		
		Object[] nameArray = new Object[4];
		
		nameArray = names.toArray();
		
		System.out.println(Arrays.toString(nameArray));
	}
	
}