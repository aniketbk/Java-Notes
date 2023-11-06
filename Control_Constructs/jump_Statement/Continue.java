package Control_Constructs.jump_Statement;

public class Continue
{
	public static void main(String[] args)
	{
		for(int i=0; i<5; i++)
		{
			if(i == 3)
			{
				continue;  // from here Go to increment step.
			}
			System.out.println(i + " ");
		}
	}
}
