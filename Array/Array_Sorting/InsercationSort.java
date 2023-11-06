package Array.Array_Sorting;

public class InsercationSort
{
	public static void main(String[] args)
	{
		// Unsorted array
		int arr[] = {10,30,50,80,20,2,7};

		// Logic for sorting array
		for(int i=1; i<arr.length-1; i++)
		{
			int value = arr[i+1];
			int index = i;
			
			while(index >= 0 && value < arr[index])
			{
				arr[index+1] = arr[index];
				index--;
			}
			
			arr[index+1] = value;
		}

		// printing sorted array
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
	}
}
