package Collection;
import java.util.*;
public class CustomizeSortingDemo3 {
	public static void main(String[] args) {
		TreeSet t=new TreeSet(new MyComparator3());
		t.add("A");
		t.add("Z");
		t.add("F");
		t.add("G");
		System.out.println(t);
		
	}
}
class MyComparator3 implements Comparator
{
	public int compare(Object obj1,Object obj2)
	{
		String s1=(String)obj1;
		String s2=(String)obj2;
		return (-s1.compareTo(s2));
	}
}