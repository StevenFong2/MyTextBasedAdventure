//Steven, Saurabh, Mamadou
import java.util.Random;

public class DeathRoom extends Room
{
	private boolean explored = false;
	public DeathRoom(int x, int y)
	{
		super(x,y);
	}
	
	public void enterRoom(Person p)
	{
		occupant = p;
		p.setx(this.x);
		p.sety(this.y);
		explored = true;
		System.out.println("You enter a room," + 
						   "\nsuddenly metal bars come out from the entrance," + 
						   "\nlocking you in, slowly the lights start to dim out " +
				           randomDeath() +
						   "You reached the end of your adventure... Better luck next time!");
		Runner.gameOff();
	}
	
	public String randomDeath()
	{
		Random r = new Random();
		return deaths[r.nextInt(deaths.length)];
	}
	
	String[] deaths = {
			"\nsuddenly, the ground stars to split and underneath hot lava rises," + "\nslowly your skin starts to peel off and the only thing you can do is scream.",
			"\nthen the ceiling lights up and giant bone grinding motors roars loudly," + "\nthe ceiling then starts lowerng itelf.",
			"\nslowly you feel yourself loosing conciousness," + "\nas your vision blurs you loose sense of the world"
	};
	
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
			System.out.print("[D]");
		}
	}
}
