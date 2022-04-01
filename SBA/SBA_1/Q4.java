/*
4.Write a program to check for the occurrence of a particular character in a string and display how many times it has occurred.
note: take the String  and the character to be checked as a input from the user.*/
package SBA_1;

import java.util.Scanner;

public class Q4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 System.out.println("enter a string");
		 String s1=sc.nextLine();
		 System.out.println("Enter the character");
		 char ch=sc.next().charAt(0);
		 System.out.println("You have entered: "+ch);
		 int count=0;
		 for(int i=0;i<s1.length();i++)
		 {
			 if(s1.charAt(i)==ch)
				 count++;
		 }
		 if (count==0)
			 System.out.println("Character is not found");	
		 else
			 System.out.println("The number of times '"+ch+"' appeared = "+count);
	}

}
