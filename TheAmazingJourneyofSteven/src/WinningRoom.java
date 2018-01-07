//Steven 
public class WinningRoom extends Room
{
	public WinningRoom(int x, int y)
	{
		super(x,y);
	}
	@Override
	public void enterRoom(Person x)
	{
		occupant = x;
		x.setx(this.x);
		x.sety(this.y);
		System.out.println("You successfully escaped alive! You live for another day.");
		Runner.gameOff();
	}
}
