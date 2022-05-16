package practice;
import java.util.*;
public class ArrayListDemo2 {

	public static void main(String[] args) {
		 ArrayList arr1 = new ArrayList();
		 
		 System.out.println(arr1.isEmpty());
		 
		 arr1.add("amrit");
		 arr1.add("shivam");
		 arr1.add("harsh");
		 arr1.add("saurav");
		 arr1.add("karan");
		 arr1.add("suraj");
		 
		 System.out.println(arr1.isEmpty());
		 System.out.println(arr1);
		 
		 arr1.clear();
		 
		 System.out.println(arr1.isEmpty());
		 
		 
	}

}
