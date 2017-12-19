import java.util.Scanner;
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
		int numKey = 0;
		for(int i = 0; i < occupant.inventory.length; i++)
		{
			if (occupant.inventory[i].equals("Key"))
			{
				numKey++;
			}
		}
		Scanner in = new Scanner(System.in);
		String command = in.nextLine().toLowerCase().trim();
		while (!command.equals("use key"))
		{
			if (numKey == 0)
			{
				System.out.println("You tried opening the door with force but it did not budge.");
				System.out.println("Having no Key you are stuck in that room for eternity..." +
								   "\nYou can hear the sound of your stomach growling," +
								   "\nYou grow hungrier day by day, and then you look at you own arm...");
				System.out.println("You reached the end of your adventure... Better luck next time!");
				Runner.gameOff();
			}
			if (numKey > 0)
			{
				System.out.println("You tried opening the door with force but it did not budge.");
				System.out.println("If only I have a key...");
			}
		}
		if (command.equals("use key"))
		{
			System.out.println("You made it out of the room, choose your next move");
		}
	}
}
