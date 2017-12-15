
public class LockedRoom extends Room
{
	public LockedRoom(int x, int y)
	{
		super(x, y);
	}
	
	public void enterRoom(Person p)
	{
		System.out.println("You see a dark room, curious you walk towards it, suddenly the doors slammed shut, locking you in..." 
							+ "\nIf only you had a key...");
		occupant = p;
		p.setx(this.x);
		p.sety(this.y);
	}
}
