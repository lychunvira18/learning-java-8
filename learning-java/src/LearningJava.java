import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class LearningJava{
	
	public static void main(String[] args) {
		
		ArrayList arrayListOne;
		arrayListOne = new ArrayList();
		
		ArrayList arrayListTwo = new ArrayList();
		
		ArrayList<String> names = new ArrayList<String>();
		
		names.add("John Smith");
		names.add("Mohammed Salami");
		names.add("Conan O'Brien");
		
		names.add(2,"Keanu Reeves"); // Adds "Keanu Reeves" at the index 2 of the names ArrayList
		
		names.set(0, "Jamie Smith"); // Replaces the value in the index 0 to "Jamie Smith"
		
		names.remove(3); // Removes the value of 'names' ArrayList in the index 3
		
//		names.removeRange(0,1); // Removes a range of 0 to 1
		
		for (int i = 0; i < names.size(); i++) {
			
			System.out.println(names.get(i));
			
		}
		
		System.out.println(names);
		
		for(String rows: names) {
			
			System.out.println(rows);
			
		}
		
		Iterator indivItems = names.iterator();
		
		while(indivItems.hasNext()) {
			
			System.out.println(indivItems.next());
			
		}
		
		
		ArrayList nameCopy = new ArrayList();
		ArrayList nameBackup = new ArrayList();
		
		nameCopy.addAll(names);
		
		String paulYoung = "Paul Young";
		
		names.add(paulYoung);
		
		if(names.contains(paulYoung)) {
			System.out.println("Paul is here");
		}
		
		if(names.containsAll(nameCopy)) {
			System.out.println("Every in nameCopy is in names");
		}
		
		names.clear();
		
		if(names.isEmpty()) {
			System.out.println("ArrayList is empty!");
		}
		
		Object[] moreNames = new Object[4];
		moreNames = nameCopy.toArray();
		
		System.out.println(Arrays.toString(moreNames));
		
	}
	
}