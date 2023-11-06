package Methodes;

public class TypeOfMethodes
{
	public static void main(String[] args)
	{
		int return1 = withReturnTypeAndArguments(1,5);
		int return2 = withReturnTypeNotArguments();
		
		withoutReturnTypeAndArguments(5,1);
		withoutReturnTypeNoArguments();
	}

	public static int withReturnTypeNotArguments()
	{
		return 0;
	}

	public static int withReturnTypeAndArguments(int i, int j)
	{
		return i + j;
	}

	public static void withoutReturnTypeNoArguments()
	{
		
	}

	public static void withoutReturnTypeAndArguments(int i, int j)
	{
		
	}
	
	
}
