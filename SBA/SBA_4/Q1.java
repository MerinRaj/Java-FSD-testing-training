/*
Write a program to take an integer array from the user and give the user a choice to sort using bubble sort (or) selection sort. Sort the array elements according to the selected algorithm of the user and display the sorted array.

*/
package SBA_4;

import java.util.Scanner;

public class Q1 {
	//*****BUBBLE SORT************
	void bubbleSort(int arr[])
	{ 
		int n = arr.length; 
		for (int i = 0; i < n-1; i++) 
			for (int j = 0; j < n-i-1; j++) 
			{
				if (arr[j] > arr[j+1])
				{
					// swap arr[j+1] and arr[j]
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
				//for debugging every move made by the algorithm
				/*for (int k=0; k<n; ++k)
				{
					System.out.print(arr[k]+",");
				}
					System.out.println("");*/
			}//inner for closes
	}

	/* Prints the array */
	void printArray(int arr[])
	{
		int n = arr.length;
		for (int i=0; i<n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}
	
	//********SELECTION SORT**************
	void Selectionsort(int arr[])
	{  		
		int n = arr.length; //6
		for (int i = 0; i < n-1; i++) 
		{
			int min_idx = i;//
			for (int j = i+1; j < n; j++) 
				{
					if (arr[min_idx] > arr[j])
					min_idx = j;//5
			}
			int temp = arr[min_idx];
			arr[min_idx] = arr[i];
			arr[i] = temp; 
			/*for (int k=0; k<n; ++k)
			{
				System.out.print(arr[k]+" ");
			}
			System.out.println();  */
		}
	}
	// Prints the array
	void printArray2(int arr[])
	{
		int n = arr.length;
		for (int i=0; i<n; ++i)
			System.out.print(arr[i]+" ");
		System.out.println();
	}
//****MAIN CLASS*********
	public static void main(String[] args) {
		//int arr[] = {64, 34, 25, 12, 22, 11, 90};
		int[] arr=new int[5];
		System.out.println("Enter 5 integer values");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<5;i++)
		{
			arr[i]=sc.nextInt();
		}

		System.out.print("Unsorted Array is : [");
		for(int i=0;i<5;i++)
		{
			System.out.print(arr[i]+",");
		}
		System.out.println("]");
		Q1 ob = new Q1();		
		System.out.println("Enter 1:Bubble Sort 2:Selection Sort");
		int n=sc.nextInt();
		switch(n)
		{
		case 1:{
			
			ob.bubbleSort(arr);
			System.out.println("Sorted array");
			ob.printArray(arr);
			break;
		}
		case 2:{
			ob.Selectionsort(arr);
			System.out.println("Sorted array");
			ob.printArray2(arr);
			break;			
		}				
		}
		
	}
}
