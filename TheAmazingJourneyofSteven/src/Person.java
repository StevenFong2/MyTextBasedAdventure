//Steven
public class Person 
{
	String Name;
	int x, y;
	Item[] inventory;
	//Variables below are not in parameter for constructor,
	//If we add these to the parameters of the constructor Person,
	//We have to manually add the specific stats to each
	//character class(magician, thief, warrior) in the runner.
	int health;
	int attack;
	int defense;
	int magic;
	int resistance;
	int speed;
	
	public String getName()
	{
		return this.Name;
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
	
	public void setHealth(int health)
	{
		this.health = health;
	}
	
	public int getHealth()
	{
		return this.health;
	}
	
	public Item[] getInventory()
	{
		return this.inventory;
	}
	
	public Person (String Name, int x, int y, Item[] inventory)
	{
		this.Name = Name;
		this.x = x;
		this.y = y;
		this.inventory = inventory;
	}
	
	

	public void print() {
		System.out.print("C");
		
	}
	
}
