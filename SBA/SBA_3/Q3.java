//Implement a Stack and all of its methods peek(), push(), pop(), and to determine the size of the stack.
package SBA_3;
import java.util.Stack;

public class Q3 {
public static void main(String[] args) {
// Creating an empty Stack 
	Stack<Integer> stk = new Stack<Integer>();

// Use add() method to add elements stk.push(10);
stk.push(15);
stk.push(30);
stk.push(20);
stk.push(5);

// Displaying the Stack 
System.out.println("Initial Stack: " + stk);

// Removing elements using pop() method 
System.out.println("Popped element: "+ stk.pop()); System.out.println("Popped element: "+ stk.pop());

// Displaying the Stack after pop operation 
System.out.println("Stack after pop operation "+ stk);
// Fetching the element at the head of the Stack 
System.out.println("The element at the top of the"+ " stack is: " + stk.peek());

// Displaying the Stack after the Operation 
System.out.println("Final Stack: " + stk);
// Displaying the size of stack 
System.out.println("The size is: " + stk.size());

}

}
