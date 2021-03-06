package AssignmentStack;
import java.util.Scanner;
import java.util.Stack;

public class StackImplementaion {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Stack<Integer> myStack=new Stack<Integer>();
		String str="";
		
		do {
			System.out.println("Enter the operation to be performed");
			System.out.println("1.Push");
			System.out.println("2.Pop");
			System.out.println("3.Peek");
			System.out.println("4.Search");
			
			int op=sc.nextInt();
			
			switch(op) {
			case 1:
				pushOperation(myStack);
				break;
			
			case 2:
				popOperation(myStack);
				break;
				
			case 3:
				peekOperation(myStack);
				break;
				
			case 4:
				searchOperation(myStack);
				break;
				
			default:
				System.out.println("Enter Valid choice");
			
			}
			System.out.println("Do you want to Continue?");
			str=sc.next();
		}while(str.equalsIgnoreCase("yes"));
		
		
	}


	private static void pushOperation(Stack<Integer> myStack) {
		// TODO Auto-generated method stub
		// In order to add an element to the stack, we can use the push() method.
		//This push() operation place the element at the top of the stack.
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of elements : ");
		int n=sc.nextInt();
		
		for(int i=0;i<n;i++) {
			myStack.push(sc.nextInt());
		}
		
		System.out.println("The element are successfully pushed into the stack");
		//sc.close();
		
	}
	
	private static void popOperation(Stack<Integer> myStack) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		if(myStack.empty()) {
			System.out.println("Your Stack is empty");
		}
		else {
		System.out.println("Enter the no of elements to be poped");
		int n=sc.nextInt();
		if(n>myStack.size()) {
			System.out.println("The no of elements to be popped is greater than the stack size");
		}
		else {
			for(int i=0;i<n;i++) {
				Integer y=myStack.pop();
				System.out.println(y);
			}
		}
		}
		System.out.println("Elements is my stack");
		System.out.println(myStack);
		
	}
	
	private static void peekOperation(Stack<Integer> myStack) {
		// TODO Auto-generated method stub
		//To retrieve or fetch the first element of the Stack or the element present at the top of the Stack,
		//we can use peek() method.
		if(myStack.size()==0) {
			System.out.println("Your Stack is empty");
		}
		else {
			System.out.println("The topmost element in stack : "+myStack.peek());
		}		
	}
	
	private static void searchOperation(Stack<Integer> myStack) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the element to be searched");
		int n=sc.nextInt();
		Integer pos=myStack.search(n);
		if(pos==-1) {
			System.out.println("Element not found");
		}
		else {
			System.out.println("Element is at position : "+pos);
		}
		
	}

}
