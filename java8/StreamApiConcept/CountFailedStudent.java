package StreamApiConcept;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class CountFailedStudent {
	public static void main(String[] args) {
		List<Integer> marks=Arrays.asList(25,32,44,75,23);
		checkStudent(marks);
	}

	private static void checkStudent(List<Integer> marks) {
		Predicate<Integer> p=i->i<35;
		long val=marks.stream().filter(p).count();
		System.out.println(val);
	}
}
