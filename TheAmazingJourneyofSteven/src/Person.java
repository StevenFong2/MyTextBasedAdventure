
public class Person 
{
	String firstName;
	String familyName;
	int x, y;
	String[] inventory;
	int health;
	int attack;
	int defense;
	int magic;
	int resistance;
	int speed;
	
	public String getfirstName()
	{
		return this.firstName;
	}
	
	public String getfamilyName()
	{
		return this.familyName;
	}
	
	public void setx(int x)
	{
		this.x = x;
	}
	
	public int getx()
	{
		return this.x;
	}
	
	public void sety(int y)
	{
		this.y = y;
	}
	
	public int gety()
	{
		return this.y;	
	}
	
	public Person (String firstName, String familyName, int x, int y, String[] inventory)
	{
		this.firstName = firstName;
		this.familyName = familyName;
		this.x = x;
		this.y = y;
		this.inventory = inventory;
	}
	
	

	public void print() {
		System.out.print("C");
		
	}
	
}
