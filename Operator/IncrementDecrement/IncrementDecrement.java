package Operator.IncrementDecrement;

public class IncrementDecrement
{
	public static void main(String[] args)
	{
		int a = 10; 
		int b = 20; 

		System.out.println("a = " + a);
		System.out.println( "++a : " + (++a) );  // first increment then print
		System.out.println( "a++ : " + (a++) );  // first print then increment
		
		System.out.println("b = " + b);
		System.out.println( "++b : " + (++b) );  // first Decrement then print
		System.out.println( "b++ : " + (b++) );  // first print then Decrement
	}
}
