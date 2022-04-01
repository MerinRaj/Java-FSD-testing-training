/*(Day-13 afternoon session)
1.Write a program to create a arraylist of double element and add the elements.
sort the elements in descending order and print it.

*/
package SBA_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q1 {
	public static void main(String[] args) {
		  List<Double> list2=new ArrayList<Double>();  
		  list2.add(21.22);  
		  list2.add(11.22);  
		  list2.add(16.22); 
		  list2.add(26.22);
		  Collections.sort(list2,Collections.reverseOrder());
		  System.out.println("Array elements in descending order");
		  for(Double number:list2)  
			    System.out.println(number); 

}
}
