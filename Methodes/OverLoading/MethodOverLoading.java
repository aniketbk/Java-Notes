package Methodes.OverLoading;

public class MethodOverLoading
{
	public static void main(String[] args)
	{
		greetings();
		greetings("aniket");
		greetings(21);
	}
	
	public static void greetings()
	{
		System.out.println("Good morning :)");
	}
	public static void greetings( String name)
	{
		System.out.println("Good morning " + name);
	}
	public static void greetings(int rollNumber)
	{
		System.out.println("Good morning rollnumber " + rollNumber);
	}
}
