package Array.Element_Searching;

public class BinarySearch
{
	public static void main(String[] args)
	{
		// Sorted array
		int arr[] = {10,20,30,40,50,60,70,80}; 
		
		// element you want to find
		int element = 10;              
		
		int start = 0;
		int end = arr.length;

		// Logic for finding element
		while( start <= end )
		{
			int mid = ( start + end ) / 2;
			
			if( arr[mid] == element )
			{
				System.out.println("Element found at position : " + ( mid + 1) );
				return;
			}
			else if( arr[mid] > element )
			{
				end = mid - 1;
			}
			else if( arr[mid] < element )
			{
				start = mid + 1;
			}
		}
		System.out.println("Element not found :(");
	}
}
