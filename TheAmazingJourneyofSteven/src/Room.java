
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
}
