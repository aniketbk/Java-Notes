package DataType;

public class TypeCasting
{
	public static void main(String[] args)
	{
		int a = 10;
		float b = 20;
		
		float c = (b = a);     // implicit.
		System.out.println("Float b = " + c );
		
		int d = (a = (int)b);  // explicit.
		System.out.println("Int a = " + d );
	}
}
