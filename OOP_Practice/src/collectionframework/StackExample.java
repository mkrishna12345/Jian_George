package collectionframework;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {


		Stack s=new Stack();
		s.push(20);
		s.push(50);
		System.out.println(s);
		s.pop();
		
		System.out.println(s);
		
		
		s.add(45);
		
		System.out.println(s);
		s.add(1,76);
		System.out.println(s);
		
		System.out.println(s.peek());
		System.out.println(s);
		System.out.println(s.pop());
		System.out.println(s);
		

	}

}
