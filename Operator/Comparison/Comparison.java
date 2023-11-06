package Operator.Comparison;

public class Comparison
{
	public static void main(String[] args)
	{
		int a = 10;
		int b = 20;
		
		boolean lessThan = a < b;
		boolean greaterThan = a > b;
		boolean lessThanEqulaTo = a <= b;
		boolean greaterThanEqulaTo = a >= b;
		boolean EqulaToEqulaTo = a == b;
		boolean notEqulaTo = a != b;
		
		System.out.println("a < b  : " + lessThan);
		System.out.println("a > b  : " + greaterThan);
		System.out.println("a <= b : " + lessThanEqulaTo);
		System.out.println("a <= b : " + greaterThanEqulaTo);
		System.out.println("a == b : " + EqulaToEqulaTo);
		System.out.println("a != b : " + notEqulaTo);
	}
}
