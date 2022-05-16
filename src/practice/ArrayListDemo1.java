package practice;
import java.util.*;
public class ArrayListDemo1 {
	
	public static void main(String[] args)
	{
		ArrayList<String> arr1 = new ArrayList<String>();
		
		arr1.add("2");
		arr1.add("7");
		arr1.add("5");
		arr1.add("9");
		arr1.add("3");
		arr1.add("1");
		
		System.out.println(arr1);
		
		ArrayList arr2= new ArrayList();
		
		arr2.add("100");
		arr2.add("500");
		
		System.out.println(arr2);
		
		arr1.addAll(1, arr2);
		System.out.println(arr1);
		
		System.out.println(arr1.indexOf("100"));
		
	      String str = arr1.get(2);
	      System.out.println(str);
	      
	      boolean b=arr1.contains("55");
	     System.out.println(b);
	         
	     boolean c=arr1.containsAll(arr2);
	     System.out.println(c);
	     
	     arr1.set(1, "300");
	     System.out.println(arr1);
	     
		
	}

}
