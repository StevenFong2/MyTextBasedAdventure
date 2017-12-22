//Saurabh Bansal
import java.util.Scanner;
public class MarvelvDC extends Room
{
	Scanner in = new Scanner (System.in);
	String statement = "";
	
	public MarvelvDC(int x, int y)
	{
		super(x,y);
	}
	

	public void enterRoom(Person x) 
	{
		// TODO Auto-generated method stub
		occupant = x;
		x.setx(this.x);
		x.sety(this.y);
		
		System.out.println("AH the fantastic world of Comics. An infinite universe ");
		System.out.println("Play this game you must. Choose a universe you must. DC or Marvel. Each has a unique story. If you don't choose a universe, "
				+ "YOU LOSE!");
		
		statement = in.nextLine();
		if (statement.length() == 0)
		{
			Runner.gameOff();
		}
		else if (findKeyword(statement, "dc") >= 0)
		{
			System.out.println("You have a choice to be a superhero. Each hero has their own story.");
			System.out.println("Heroes: Batman, Superman, Wonder Woman, Cyborg, Green lantern");
		}
		else
		{
			return;
		}
	}
	public void leaveRoom(Person x)
	{
		occupant = null;
	}
	
	private int findKeyword(String statement, String goal,int startPos)
	{
		String phrase = statement.trim().toLowerCase();
		goal = goal.toLowerCase();
		int psn = phrase.indexOf(goal, startPos);
		while (psn >= 0)
		{
			String before = " ", after = " ";
			if (psn > 0)
			{
				before = phrase.substring(psn - 1, psn);
			}
			if (psn + goal.length() < phrase.length())

			{
				after = phrase.substring(psn + goal.length(),psn + goal.length() + 1);
			}
			if (((before.compareTo("a") < 0) || (before.compareTo("z") > 0)) && ((after.compareTo("a") < 0) || (after.compareTo("z") > 0)))
			{
				return psn;
			}
			psn = phrase.indexOf(goal, psn + 1);
		}
		return -1;
	}
	
	private int findKeyword(String statement, String goal)
	{
			return findKeyword (statement, goal, 0);
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
			System.out.print("[M]");
		}
	}
}