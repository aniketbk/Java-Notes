package Array.Element_Searching;

public class LinearSearch
{
	public static void main(String[] args)
	{
		int arr[] = {10,6,7,30,9,50};
		int element = 50;
		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] == element)
			{
				System.out.println("Element found at position : " + (i+1));
				break;
			}
		}
	}
}
