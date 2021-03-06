package AssignmentQueue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueImplementation {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Queue<Integer> myQueue=new LinkedList<Integer>();
		String str="";
		
		do {
			System.out.println("Enter the operation to be performed");
			System.out.println("1.Enqueue");
			System.out.println("2.Dequeue");
			
			
			int op=sc.nextInt();
			
			switch(op) {
			case 1:
				enqueueOperation(myQueue);
				break;
			
			case 2:
				DequeueOperation(myQueue);
				break;
				
			case 3:
				peekOperation(myQueue);
				break;
								
			default:
				System.out.println("Enter Valid choice");
			
			}
			System.out.println("Do you want to Continue?");
			str=sc.next();
		}while(str.equalsIgnoreCase("yes"));
		
		
	}


	private static void enqueueOperation(Queue<Integer> myQueue) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of elements : ");
		int n=sc.nextInt();
		
		for(int i=0;i<n;i++) {
			myQueue.add(sc.nextInt());
		}
		
		System.out.println("The elements are successfully added into the queue");
		
	}

	private static void DequeueOperation(Queue<Integer> myQueue) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		if(myQueue.isEmpty()) {
			System.out.println("Your Stack is empty");
		}
		else {
		System.out.println("Enter the no of elements to be removed");
		int n=sc.nextInt();
		if(n>myQueue.size()) {
			System.out.println("The no of elements to be removed is greater than the queue size");
		}
		else {
			for(int i=0;i<n;i++) {
				Integer y=myQueue.remove();
				System.out.println(y);
			}
		}
		}
		System.out.println("Elements is my Queue");
		//System.out.println(myQueue);
		Iterator iterator=myQueue.iterator();
		while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
		
	}
	
	private static void peekOperation(Queue<Integer> myQueue) {
		// TODO Auto-generated method stub
		if(myQueue.size()==0) {
			System.out.println("Your Queue is empty");
		}
		else {
			System.out.println("The topmost element in Queue : "+myQueue.peek());
		}
		
	}


}
