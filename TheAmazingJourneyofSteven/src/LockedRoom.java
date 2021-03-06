//Steven, Saurabh, Mamadou
import java.util.Scanner;

public class LockedRoom extends Room
{
	boolean explored = false;
	boolean locked = true;
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
		this.explored = true;
		int numKey = 0;
		int pos = 0;
		for(int i = 0; i < occupant.getInventory().length; i++)
		{
			if (occupant.getInventory()[i] instanceof Magickey)
			{
				numKey++;
				pos = i;
			}
		}
		
		while (Runner.runningmap.getdungeon()[this.x][this.y].getlocked() == true)
		{
			String command = Runner.in.nextLine().toLowerCase().trim();
			if (numKey == 0)
			{
				System.out.println("You tried opening the door with force but it did not budge.");
				System.out.println("Having no Key you are stuck in that room for eternity..." +
								   "\nYou can hear the sound of your stomach growling," +
								   "\nYou grow hungrier day by day, and then you look at you own arm...");
				System.out.println("You reached the end of your adventure... Better luck next time!");
				Runner.gameOff();
				break;
			}
			else if (numKey > 0 && command.equals("/usekey"))
			{
					occupant.getInventory()[pos].effect();
					System.out.println("All doors are now unlocked.");
					occupant.getInventory()[pos] = new Placeholder();
			}
			else if (numKey > 0 && !command.equals("/usekey"))
			{
					System.out.println("You tried opening the door with force but it did not budge.");
					System.out.println("If only I have a key...");
			}

		}
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
			System.out.print("[L]");
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
