import java.util.*;
import java.util.ArrayList;
import java.util.LinkedHashSet;

public class PracticeRemDuplicates {

	public static void main(String[] args) {

		ArrayList duplicates = new ArrayList();
		
		duplicates.add("s");
		duplicates.add("s");
		duplicates.add("a");
		duplicates.add("i");
		duplicates.add("i");
		duplicates.add(2);
		duplicates.add(4);
		duplicates.add(4);
		duplicates.add(6);
		duplicates.add(8);
		duplicates.add(8);
	
		System.out.println("Before remove Duplicates: " +duplicates);
		
		Set removeDuplicates = new LinkedHashSet(duplicates);
		
		duplicates.clear(); // to print removed duplicates in same Arraylist reference name clear the arraylist first.
		
		duplicates.addAll(removeDuplicates);
		
		System.out.println("After Removed Duplicates: "+ removeDuplicates);
		
		System.out.println(duplicates);
		
		
		
		
		
		
		
		
		
		
	}

}
