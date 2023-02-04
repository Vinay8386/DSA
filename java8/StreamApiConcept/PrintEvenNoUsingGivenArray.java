package StreamApiConcept;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PrintEvenNoUsingGivenArray {
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(2,3,4,5,6,7,8);
		checkEven(list);
	}
	
	private static void checkEven(List<Integer> list) {	
		List<Integer> l=list.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(l);	
		//or
		Predicate<Integer> p=i->i%2==0;
		list.stream().filter(p).forEach(System.out::println);
	}
}
