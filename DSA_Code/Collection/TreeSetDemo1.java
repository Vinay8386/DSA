package Collection;
import java.util.*;
public class TreeSetDemo1 {
	public static void main(String[] args) {
		TreeSet t=new TreeSet();
		t.add(new StringBuffer("N"));  
		
/*StringBuffer doesn't implements comparable interface and still program 
 * doesn't give ClassCastException.according to rule if we are depending
 * on default natural sorting order then object should be homogeneous and
 *  comparable otherwise we will get runtime exception saying
 *   ClassCastException*/
   
		t.add(new StringBuffer("A"));
		t.add(new StringBuffer("Z"));
		t.add(new StringBuffer("L"));
		t.add(new StringBuffer("B"));
		System.out.println(t);
	}
}
