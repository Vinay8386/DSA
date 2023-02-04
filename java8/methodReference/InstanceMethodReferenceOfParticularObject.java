package methodReference;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Person1
{
	private String name;
	private int age;
	
	Person1(String name,int age){
		this.name=name;
		this.age=age;
	}
	
	public String getName() {
		return name;
	}
	public Integer getAge() {
		return age;
	}
}

class ComparisonProvider{
	//create non-static method to compare with name
		public int compareByName(Person a, Person b) {
			return a.getName().compareTo(b.getName());
		}	
		//create non-static method to compare with age
		public int compareByAge(Person a, Person b) {
			return a.getAge().compareTo(b.getAge());
		}	 
}
public class InstanceMethodReferenceOfParticularObject {
	public static void main(String[] args) {
		
		List<Person> personList=Arrays.asList(new Person("Vinay",25),new Person("Raju",35),new Person("Aman",20));	
		
		ComparisonProvider c=new ComparisonProvider();

		System.out.println("Sort by name: ");	
		
		//sort array by name using static method reference
		Collections.sort(personList,c::compareByName);	
		
		// Using streams over above object of Person type
		personList.stream().map(x->x.getName()).forEach(System.out::println);	
		
		System.out.println("Sort by age: ");		
		
		//sort array by name using static method reference
		Collections.sort(personList,c::compareByAge);	
		
		// Using streams over above object of Person type
		personList.stream().map(x->x.getName()).forEach(System.out::println);	
	}
}
