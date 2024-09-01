package Collection;
import java.util.*;

public class LinkedListDemo 
{
	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		l.add("Vinay");
		l.add(30);
		l.add(null);
		l.add("Vinay");
		System.out.println(l);
		l.set(0, "software");
		l.removeLast();
		l.addFirst("Mishra");
		System.out.println(l);
	}
}
