package OOP.Inheritance.Hybrade_Inheritance;

public class HybradeInheritanceMain
{
	public static void main(String[] args)
	{
		Child1 Child1 = new Child1();
		Child2 Child2 = new Child2();
		
		Child1.GrandParentMethod();
		Child1.ParentMethod();
		Child1.Child1Method();

		Child2.GrandParentMethod();
		Child2.ParentMethod();
		Child2.Child2Method();
	}
}
