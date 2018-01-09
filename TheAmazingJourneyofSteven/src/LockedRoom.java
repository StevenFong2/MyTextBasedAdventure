//Steven
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
		for(int i = 0; i < occupant.inventory.length; i++)
		{
			if (p.inventory[i] instanceof Magickey)
			{
				numKey++;
				pos = i;
			}
		}
		
		Scanner in = new Scanner(System.in);
		//String command = in.nextLine().toLowerCase().trim();
		//int xe = Runner.runningplayer.getx();
		//int ye = Runner.runningplayer.gety();
		while (Runner.runningmap.dungeon[this.x][this.y].getlocked() == true)
		{
			String command = in.nextLine().toLowerCase().trim();
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
					occupant.inventory[pos].effect();
					System.out.println("All doors are now unlocked.");
			}
			else if (numKey > 0 && !command.equals("/usekey"))
			{
					System.out.println("You tried opening the door with force but it did not budge.");
					System.out.println("If only I have a key...");
			}

		}
		in.close();
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
