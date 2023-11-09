package OOP.Inheritance.Multilevel_Inheritance;

public class Multilevel_InheritanceMain
{
	public static void main(String[] args)
	{
		Child Child = new Child();
		
		Child.GrandParentMethod();
		Child.ParentMethod();
		Child.ChildMethod();
	}
}
