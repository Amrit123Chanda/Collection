package practice;
import java.util.*;
public class LinkedListDemo1 {

	public static void main(String[] args) {
		LinkedList linkElem1 = new LinkedList();
		linkElem1.add("60");
		linkElem1.add("70");
		linkElem1.add("50");
		linkElem1.add("60");
		linkElem1.add("80");
		linkElem1.add("50");
		System.out.println(linkElem1);
		
		linkElem1.add(2,"5");
		System.out.println(linkElem1);
		
		linkElem1.addFirst("10");
		System.out.println(linkElem1);
		
		linkElem1.addLast("20");
		System.out.println(linkElem1);
		
		ArrayList arr2 = new ArrayList<>();
		arr2.add("One");
		arr2.add("Two");
		arr2.add("three");
		
		System.out.println(arr2);
		linkElem1.addAll(arr2);
		System.out.println(linkElem1);
		
		int x= linkElem1.size();
		System.out.println(x);
		
		linkElem1.remove(0);
		System.out.println(linkElem1);
	
	}

}
