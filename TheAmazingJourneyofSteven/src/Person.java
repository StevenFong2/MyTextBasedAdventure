
public class Person 
{
	private String firstName;
	private String familyName;
	private int x, y;
	
	public Person (String firstName, String familyName, int x, int y)
	{
		this.firstName = firstName;
		this.familyName = familyName;
		this.x = x;
		this.y = y;
	}
	
	public String getfirstName()
	{
		return this.firstName;
	}
	
	public String getfamilyName()
	{
		return this.familyName;
	}
	
	public int getx()
	{
		return this.x;
	}
	
	public int gety()
	{
	return this.y;	
	}
	
}
