package Array.Array_Sorting;

public class SelectionSorting
{
	public static void main(String[] args)
	{
		// Unsorted array
		int arr[] = {10,30,50,80,20,2,7};

		// Logic for sorting array
		for(int i=0; i<arr.length-1; i++)
		{
			int minValue = arr[i];
			int minIndex = i;
			
			for(int j=i+1; j<arr.length; j++)
			{
				if(minValue > arr[j])
				{
					minValue = arr[j];
					minIndex = j;
				}
			}
			
			int temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;
		}

		// printing sorted array
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
	}
}
