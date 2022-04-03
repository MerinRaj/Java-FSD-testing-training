/*Implement an ArrayDequeue and all of its methods such as add(), addFirst(), addLast(), element(), poll(), push(), remove.
*/
package SBA_3;
import java.util.ArrayDeque;

public class Q1 {
public static void main(String[] args) {
ArrayDeque<String> animals = new ArrayDeque<>();
// Using add() 
animals.add("Dog");
// Using addFirst() 
animals.addFirst("Cat");
// Using addLast() 
animals.addLast("Horse");
System.out.println("ArrayDeque: " + animals);
// Using poll()
String element = animals.poll(); 
System.out.println("Removed Element: " + element); 
System.out.println("New ArrayDeque: " + animals);
// Using pollFirst()
String firstElement = animals.pollFirst(); 
System.out.println("Removed First Element: " + firstElement);
// Using pollLast()
String lastElement = animals.pollLast(); 
System.out.println("Removed Last Element: " + lastElement);
// using push() 
animals.push("Rabbit"); 
animals.push("cow");
animals.push("goat");
System.out.println("After push method ArrayDeque: " + animals);
// using element()--returns element present in the head 
System.out.println("Head element by element() method: " +animals.element());
// Using remove()
String element1 = animals.remove(); 
System.out.println("Removed Element: " + element1);
System.out.println("New ArrayDeque: " + animals);
// Using removeFirst()
String firstElement1 = animals.removeFirst(); 
System.out.println("Removed First Element: " + firstElement1);
// Using removeLast()
String lastElement1 = animals.removeLast(); 
System.out.println("Removed Last Element: " + lastElement1);
}
}

