package Control_Constructs.jump_Statement;

public class Break
{
	public static void main(String[] args)
	{
		for(int i=0; i<5; i++)
		{
			if(i == 3)
			{
				break;      // get out of all control construct  
			}
			System.out.println(i + " ");
		}
	}
}
