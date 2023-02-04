package methodReference;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class InstanceMethodReferenceOfArbitraryObject {
	public static void main(String[] args) {
		
		List<String> personList=Arrays.asList("Raju","Vinay","aman");
		
		// Method reference to String type
		Collections.sort(personList,String::compareToIgnoreCase);
		
		// Printing the elements(names) on console
		personList.forEach(System.out::println);
	}

}
