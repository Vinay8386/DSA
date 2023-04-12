package Collection;
import java.util.*;
public class CustomizeSortingDemo2 
{
	public static void main(String[] args) {
		TreeSet t=new TreeSet(new MyComparator1());
		t.add(10);
		t.add(0);
		t.add(15);
		t.add(20);
		t.add(20);
		System.out.println(t);
	}
}
class MyComparator1 implements Comparator
	{
		public int compare(Object obj1,Object obj2)
		{
			Integer i1=(Integer)obj1;
			Integer i2=(Integer)obj2;
			return(i1.compareTo(i2));//ascending order
			//return(-i1.compareTo(i2));//descending order
			//return(i2.compareTo(i1));	//descending order	
			//return(-i2.compareTo(i1));//ascending order
			//return +1;//insertion order
			 //return -1;//reverse of insertion order
			//return 0;//only first element inserted and all other element considered as duplicate
			
		}
	}


