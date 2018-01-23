//Steven, Saurabh, Mamadou
public class Placeholder implements Item
{
	public Placeholder(){}
	
	public String description()
	{
		return "This is an empty slot.";
	}
	
	public void effect()
	{
		System.out.print("There is no effect... YOU HAVE NO ITEM HERE!!!");
	}
}
