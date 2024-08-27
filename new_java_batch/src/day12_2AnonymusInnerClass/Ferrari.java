package day12_2AnonymusInnerClass;

public class Ferrari {
	public void drive()
	{
		System.out.println("ferrari");
	}
}
class car {
	Ferrari p =new Ferrari()
	{
	public void drive()
	{
		System.out.println("anonymus class");
	}

};
	
}

