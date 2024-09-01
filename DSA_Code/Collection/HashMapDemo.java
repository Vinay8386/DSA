package Collection;
import java.util.*;
public class HashMapDemo {
	public static void main(String[] args) {
		HashMap m=new HashMap();
		m.put("chiranjeevi", 700);
		m.put("vinay", 800);
		m.put("ravi", 1000);
		m.put("anand", 500);
		System.out.println(m);
		//{anand=500, vinay=800, chiranjeevi=700, ravi=1000}
		//It is not in insertion order because insertion is based on the hashcode on the keys.
		System.out.println(m.put("vinay", 1000));
		Set s=m.keySet();
		System.out.println(s);//print  only keys in square bracket
		Collection c=m.values();
		System.out.println(c);//print only values in square bracket
		Set s1=m.entrySet();
		System.out.println(s1);//print key and value in square bracket
		//value of vinay is already changed
		Iterator itr=s1.iterator();
		while (itr.hasNext()) 
		{
			Map.Entry m1 = (Map.Entry) itr.next();
			System.out.println(m1.getKey()+"   "+m1.getValue());
			if(m1.getKey().equals("vinay"))
			{
				m1.setValue(10000);
			}
		}
		System.out.println(m);
	}
}
