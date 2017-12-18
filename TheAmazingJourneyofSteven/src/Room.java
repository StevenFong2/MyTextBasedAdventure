
public class Room 
{
	Person occupant;
	int x , y;
	
	public Room(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	
	public void enterRoom(Person p)
	{
		System.out.println("You wake up in a random, worn down room...");
		occupant = p;
		p.setx(this.x);
		p.sety(this.y);
	}
	
	public void leaveRoom(Person x)
	{
		occupant = null;
	}
	
	private boolean explored = false;
	public void print()
	{
		if(!explored && occupant == null)
		{
			System.out.print("[ ]");
		}
		else if(occupant != null)
		{
			System.out.print("[");
			occupant.print();
			System.out.print("]");
		}
		else if(explored)
		{
			System.out.print("E");
		}
	}
}
