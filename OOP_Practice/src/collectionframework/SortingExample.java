package collectionframework;

import java.util.ArrayList;
import  java.util.Collections;

public class SortingExample {

	public static void main(String[] args) {

Enployee e=new Enployee(12, "krishna");

Enployee e1=new Enployee(15, "Kumar");


System.out.println(e);
System.out.println(e1);
		
		ArrayList al=new ArrayList();
		al.add(e1);
		al.add(e);
		//al.add("krishna");
		
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
		
	
		
		
	}

}
