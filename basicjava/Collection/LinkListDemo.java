package Collection;

import java.util.*;

public class LinkListDemo 
{
public static void main(String[] args) {
	LinkedList l=new LinkedList();
	l.add("vinay");
	l.add(30);
	l.add(null);
	l.add("vinay");
	l.set(0,"software");
	l.set(0,"private");
	l.removeLast();
	l.addFirst("limited");
	l.getLast();
	System.out.println(l);
}
}
