package methodReference;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

class Person2{
	private String name;
	private int age;
	
	//constructor
	public Person2() {
		Random ren=new Random();
		
		//assigning a random val to name
		this.name=ren
				.ints(65,90)  //IntStream is stream of primitive int value. It has built in concepts of range(..) and sum(..)
				.limit(7)
				.collect(StringBuilder::new,
						StringBuilder::appendCodePoint,
						StringBuilder::append)
				.toString();
	}
	
	public String getName() {
		return name;
	}
	public Integer getAge() {
		return age;
	}
}

public class ConstructorReference {
	
	public static <T> List<T> getObjectList(int length, Supplier<T> objectSupply){
		List<T> list=new ArrayList<>();
		
		for(int i=0;i<length;i++) {
			list.add(objectSupply.get());
		}
		return list;
	}
	
	public static void main(String[] args) {
		// Get 10 person by supplying
        // person supplier, Supplier is
        // created by person constructor
        // reference
        List<Person2> personList
            = getObjectList(5, Person2::new);
 
        // Print names of personList
        personList.stream()
            .map(x -> x.getName())
            .forEach(System.out::println);
	}
}
