package Collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> ll=new LinkedList<String>();
		ll.add("Charles");
		ll.add("louis");
		ll.add("Cedric");
		ll.add("Harry");
		ll.add("Fred");
		
		System.out.println(ll);
		
		Iterator<String> i=ll.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		// To add an element at a specified position
		
		ll.add(2, "Chang");
		System.out.println(ll);
		
		LinkedList<String> l2=new LinkedList<String>();
		l2.add("Ria");
		l2.add("Dia");
		l2.add("Cedric");
		l2.add("Charles");
		
		//Add list l2 to ll
		
		ll.addAll(l2);
		System.out.println(ll);
		
		//Adding a l2 at a specified position in ll
		//ll.addAll(1, l2);
		//System.out.println(ll);
		
		//Adding an element at first position
		//ll.addFirst("Priya");
		//System.out.println(ll);
		
		//Adding an element at Last position
		//ll.addLast("aaliya");
		//System.out.println(ll);
		
		//Remove specific element
		//ll.remove("Charles");
		//System.out.println(ll);
		
		//Remove specific element based on index
		//ll.remove(2);
		//System.out.println(ll);
		
		//Remove First element
		//ll.removeFirst();
		//System.out.println(ll);
		
		//Remove last element
		//ll.removeLast();
		//System.out.println(ll);
		
		// Remove FirstOccurence
		//ll.removeFirstOccurrence("Cedric");
		//System.out.println(ll);
		
		//Remove LastOccurence
		ll.removeLastOccurrence("Cedric");
		System.out.println(ll);
		
		//ll.clear();
		
		//Descending Iterator
		Iterator<String> di=ll.iterator();
		while(di.hasNext()) {
			System.out.println(di.next());
		}

	}

}
