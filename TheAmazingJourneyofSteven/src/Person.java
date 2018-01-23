//Steven, Saurabh, Mamadou
public class Person 
{
	String Name;
	private int x, y;
	private Item[] inventory;
	//Variables below are not in parameter for constructor,
	//If we add these to the parameters of the constructor Person,
	//We have to manually add the specific stats to each
	//character class(magician, thief, warrior) in the runner.
	private int health;
	private int attack;
	private int defense;
	private int magic;
	private int resistance;
	private int speed;
	
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
	
	public Item[] getInventory()
	{
		return this.inventory;
	}
	
	public void setHealth(int health)
	{
		this.health = health;
	}
	
	public int getHealth()
	{
		return this.health;
	}
	
	public void setAttack(int attack)
	{
		this.attack = attack;
	}
	
	public int getAttack()
	{
		return this.attack;
	}
	
	public int getDefense()
	{
		return this.defense;
	}
	
	public void setDefense(int defense)
	{
		this.defense = defense;
	}
	
	public int getMagic()
	{
		return this.magic;
	}
	
	public void setMagic(int magic)
	{
		this.magic = magic;
	}
	
	public int getResistance()
	{
		return this.resistance;
	}
	
	public void setResistance(int resistance)
	{
		this.resistance = resistance;
	}
	
	public int getSpeed()
	{
		return this.speed;
	}
	
	public void setSpeed(int speed)
	{
		this.speed = speed;
	}
	
	public Person (String Name, int x, int y, Item[] inventory)
	{
		this.Name = Name;
		this.x = x;
		this.y = y;
		this.inventory = inventory;
	}

	public void print() 
	{
		System.out.print("C");	
	}
	
}
