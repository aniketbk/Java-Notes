package Array.MultiDimenction_Array;
import java.util.Scanner;

public class ThreeDArray
{
	public static void main(String[] args)
	{

		Scanner scanner = new Scanner(System.in);
		int arr[][][] = new int [3][2][3];
		
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[i].length; j++)
			{
				for(int k=0; k<arr[k].length; k++)
				{
					arr[i][j][k] = scanner.nextInt();
				}
			}
		}
		
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[i].length; j++)
			{
				for(int k=0; k<arr[j].length; k++)
				{
					System.out.print(arr[i][j][k] + " ");
				}
				System.out.println();
			}
		}
		scanner.close();
	}
}
