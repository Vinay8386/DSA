package Collection;
import java.util.*;
public class CursorDemo {
  public static void main(String[] args) {
	Vector v=new Vector();
	Enumeration e=v.elements();
	Iterator itr=v.iterator();
	ListIterator ltr=v.listIterator();
	System.out.println(e.getClass().getName());
	System.out.println(itr.getClass().getName());
	System.out.println(ltr.getClass().getName());
}
}
