package Array.Array_Sorting;

public class BoubleSorting
{
	public static void main(String[] args)
	{
		// Unsorted array
		int arr[] = {10,30,50,80,20,2,7};
		
		// Logic for sorting array
		for(int i=0; i<arr.length-1; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i] > arr[j])
				{
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}

		// printing sorted array
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
	}
}
