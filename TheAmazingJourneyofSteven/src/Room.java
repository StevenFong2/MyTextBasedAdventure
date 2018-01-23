//Steven, Saurabh, Mamadou
public class Room 
{
	Person occupant;
	int x , y;
	boolean explored = false;
	boolean locked = false;
	
	public Room(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	
	public void enterRoom(Person p)
	{
		System.out.println("This just looks like a plain old room...");
		occupant = p;
		p.setx(this.x);
		p.sety(this.y);
		explored = true;
	}
	
	public void leaveRoom(Person x)
	{
		occupant = null;
	}
	
	public void print()
	{
		if(explored == false && occupant == null)
		{
			System.out.print("[ ]");
		}
		else if(occupant != null)
		{
			System.out.print("[");
			occupant.print();
			System.out.print("]");
		}
		else if(explored == true)
		{
			System.out.print("[R]");
		}
	}
	
	public void setlocked(boolean s)
	{
		this.locked = s;
	}
	
	public boolean getlocked()
	{
		return this.locked;
	}
}
