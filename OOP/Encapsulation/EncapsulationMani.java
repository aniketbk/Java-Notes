package OOP.Encapsulation;

public class EncapsulationMani
{
	public static void main(String[] args)
	{
		Encapsulation parent = new Encapsulation();
		
		int a = parent.getA();
		a = a * 2;
		parent.setA(a);
		System.out.println(parent.getA());
	}
}
