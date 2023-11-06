package String.ImpFunctions;

public class ImportantFunctions
{
	public static void main(String[] args)
	{
		String s1 = "Aniket Bhaurao Kanhekar ";
		
		// Length();
		int length = s1.length();
		System.out.println("Length of String is : " + length);
		System.out.println();

		// trim();
		String trim = s1.trim();
		System.out.println("Trimed String is : " + trim);
		System.out.println();

		// split();
		String split[] = s1.split(" ");
		System.out.print("split String is : ");
		for(int i=0; i<split.length; i++)
		{
			System.out.print(split[i] + ", ");
		}
		System.out.println();
		System.out.println();

		// toCharArray();
		char charArray[] = s1.toCharArray();
		System.out.print("charactors of String are : ");
		for(int i=0; i<charArray.length; i++)
		{
			System.out.print(charArray[i] + ", ");
		}
		System.out.println();
		System.out.println();

		// replace();
		String replace = s1.replace('a','@');
		System.out.println("Replaced charactor String is : " + replace);
		System.out.println();

		// contains();
		boolean contains = s1.contains("Ani");
		System.out.println("String contain this : " + contains);
		System.out.println();

		// substring();
		String substring = s1.substring(1,9);
		System.out.println("Sub-string of string is : " + substring);
		System.out.println();
	}
}
