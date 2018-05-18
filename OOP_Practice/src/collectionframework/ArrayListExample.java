package collectionframework;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args) {


		
		// Create ArrayLst Object
		ArrayList list=new ArrayList(1000);


		// Adding
		list.add(12);
		list.add(13);
		list.add(14);
		list.add(15);
		list.add(16);
		
		
		
		System.out.println(list);
		
		
		ArrayList list1=new ArrayList();
		list1.add(34);
		list1.add(56);
		
		list.addAll(list1);
		
		System.out.println(list);
		
		
		System.out.println("***********************************");
		System.out.println(" Size is :"+list.size());
		System.out.println("Is Emply ?"+list.isEmpty());
		System.out.println(" List Containt 166 "+list.contains(166));
		System.out.println(list.containsAll(list1));
		
		
		System.out.println("*****************Removing*************************");
		
		
		System.out.println(list.remove(0));
		System.out.println(list);
		System.out.println(list.retainAll(list1));
		System.out.println(list);
	
		
		/*
		Iterator i=list.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}*/

	}

}
