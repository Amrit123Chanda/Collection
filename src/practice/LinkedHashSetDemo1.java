package practice;
import java.util.*;
public class LinkedHashSetDemo1 {

	public static void main(String[] args)
	{
		LinkedHashSet linkHashSetObj1 = new  LinkedHashSet();
		
		linkHashSetObj1.add("2");
		linkHashSetObj1.add("100");
		linkHashSetObj1.add("12");
		linkHashSetObj1.add("10");
		linkHashSetObj1.add("2");
		linkHashSetObj1.add("30");
		linkHashSetObj1.add(null);
		
		System.out.println("linkHashSetObj1=" +linkHashSetObj1);
		System.out.println("size="+ linkHashSetObj1.size());
		
		linkHashSetObj1.remove("100");
		System.out.println(linkHashSetObj1);
		System.out.println("size=" + linkHashSetObj1.size());
		
		LinkedHashSet linkHashSetObj2 = new  LinkedHashSet();
		
		linkHashSetObj2.add("Amrit");
		linkHashSetObj2.add("karan");
		linkHashSetObj2.add("30");
		System.out.println("linkHashSetObj2="+ linkHashSetObj2);
		
		linkHashSetObj1.addAll(linkHashSetObj2);
		System.out.println("final set = " + linkHashSetObj1);
		
		int size2= linkHashSetObj1.size();
		System.out.println(size2);
		
		linkHashSetObj1.remove("12");
		System.out.println(linkHashSetObj1);
		
		linkHashSetObj1.removeAll(linkHashSetObj2);
		System.out.println(linkHashSetObj1);
		
		linkHashSetObj1.retainAll(linkHashSetObj2);
		System.out.println(linkHashSetObj1);
		
		
		
		
		
		
	}
	
		public void checkTreeSet()
		{
			
		}

}
