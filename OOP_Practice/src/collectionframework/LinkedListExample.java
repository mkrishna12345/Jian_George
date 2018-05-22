package collectionframework;

import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {


		
		
		LinkedList ll=new LinkedList();
		
		ll.add(12);
		ll.add(14);
		ll.add("krishna");
		ll.add(14.0);
		//System.out.println(ll);
		ll.addFirst(5);
		//System.out.println(ll);
		ll.addLast(45);
		//System.out.println(ll);
		ll.add(4, "kumar");
		System.out.println(ll);
		ll.removeLast();
		System.out.println(ll);
		ll.removeFirst();
		System.out.println(ll);
		
		
	}

}
