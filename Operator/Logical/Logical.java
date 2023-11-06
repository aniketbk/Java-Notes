package Operator.Logical;

public class Logical
{
	public static void main(String[] args)
	{
		boolean a = true;
		boolean b = false;
		
		boolean And = a && b;
		boolean Or = a || b;
		
		System.out.println(a + " && " + b + " = " + And);
		System.out.println(a + " || " + b + " = " + Or);
	}
}
