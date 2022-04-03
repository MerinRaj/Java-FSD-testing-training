//4.Write a program Implement the filereader until the file ending character is “-1” and print all the data of the file.
package SBA_2;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Q4 {
public static void main(String[] args) {
		
		try
		{		
			FileWriter obj1=new FileWriter("D:Q3_NewFile.txt");
			obj1.write("Program to Implement the filereader until the file ending character is “-1” and print all the data of the file.");
			obj1.close();		
		}
		catch(IOException e)
		{
			System.out.println("Some unexpected error has occured");
			System.out.println(e);
		}
		try
		{
		FileReader textFileReader = new FileReader("D:Q3_NewFile.txt");
		
		 int i;    
         while((i=textFileReader.read())!=-1)    
         System.out.print((char)i);    
         textFileReader.close();    
		}
		catch(IOException e)
		{
			System.out.println("Some unexpected error has occured");
			System.out.println(e);
		}
	}

}
