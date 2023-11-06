package Array;

import java.util.Scanner;

public class Array
{
	public static void main(String[] args)
	{
		// declaration
		int arr[] = new int[2];
		Scanner scanner = new Scanner(System.in);
		
		// putting data into array
		for(int i=0 ;i<arr.length; i++)
		{
			arr[i] = scanner.nextInt();
		}
		
		// getting data and printing
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
		
	}
}
