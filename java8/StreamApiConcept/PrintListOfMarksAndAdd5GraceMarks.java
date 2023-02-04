package StreamApiConcept;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrintListOfMarksAndAdd5GraceMarks {
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(10,12,32,44,76,89);
		printList(list);
	}

	private static void printList(List<Integer> list) {
		List<Integer> l=list.stream().map(i->i+5).collect(Collectors.toList());
		System.out.println(l);
		//or
		list.stream().map(i->i+5).forEach(System.out::println);
	}

}
