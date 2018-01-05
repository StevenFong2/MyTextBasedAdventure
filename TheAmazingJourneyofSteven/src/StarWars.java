//Saurabh Bansal
import java.util.Scanner;

public class StarWars extends Room
{
	Scanner in = new Scanner (System.in);
	String statement = "";
	
	public StarWars(int x, int y)
	{
		super(x,y);
	}
	
	public void enterRoom(Person x) 
	{
		// TODO Auto-generated method stub
		occupant = x;
		x.setx(this.x);
		x.sety(this.y);
		System.out.println("Entered the Stars Wars room, you have!");
		System.out.println("Play the Game you must. CHOOSE YOUR LIGHTSABER.");
		System.out.println("(Choose Lightsaber you must.)");
		System.out.println("Color in you must type.");
		
		System.out.println("Red, Yellow, Blue, Purple, Green, Black");
		statement = in.nextLine();
		if (statement.length() == 0)
		{
			System.out.println("I will not repeat myself!");
		}
		else if (findKeyword(statement, "red") >= 0)
		{
			System.out.println("Ah, you have chosen the color of the sith! There can only be two, a master and an apprentice");
			System.out.println("Who do you want to kill? The master or the apprentice?");
			if (statement.equals ("master") || statement.equals ("Master") || statement.equals("MASTER"))
			{
				System.out.println("Oh no, you've died! The sith lord is too powerful for you.");
				Runner.gameOff();
			}
			else
			{
				System.out.println("Congrats, you are now the Sith apprentice. "
						+ "/n Sadly, Count Dooku does not like this and has challenged you to a duel");
				System.out.println("How do you wish to win? Will you cheat or will you be fair?");
				if (findKeyword (statement,"cheat") >= 0)
				{
					System.out.println("You are truly a sith. You can pass this room.");
				}
				else
				{
					System.out.println("What is wrong with you? You are a sith! You don't play by the rules. "
							+ "/n YOU MAKE YOUR OWN RULES!");
					Runner.gameOff();
				}
			}
		}
		else if (findKeyword (statement, "yellow") >= 0)
		{
			System.out.println("Ah, you have chosen the color of a Jedi Sentinal! "
					+ "/n You are more towards the non-Force side of the family.");
			System.out.println("You have a choice: Become a Temple Guard or become a Jedi Shadow. "
					+ "/n (Please write the whole name)");
			if (findKeyword (statement, "temple") >= 0)
			{
				System.out.println("You have been placed to watch the holocron database. "
						+ "/n Will you stay true to your duties or will you steal a holocron?");
				if (findKeyword (statement, "steal") >= 0)
				{
					System.out.println("Tsk, Tsk. Yoda caught you. "
							+ "/n You have now been sentenced for life in prison in which you will die. "
							+ "/n Remember you are a jedi, Jedi follow the Jedi Code.");
					Runner.gameOff();
				}
				else 
				{
					System.out.println("Good job! You can now proceed to the next room.");
				}
			}
		}
		else if (findKeyword (statement, "blue") >= 0)
		{
			System.out.println ("Ah you have become a Jedi Guardian. Good choice. "
					+ "/n Your task is to defend all those who are weak. "
					+ "/n Throughout your life you will notice"
					+ "/n people fighting those who can't defend themselves. Go out and help everyone. "
					+ "/n The force will protect you.");
		}
		else if (findKeyword (statement, "purple") >= 0)
		{
			System.out.println ("Ah you have chosen a rare lightsaber. You are now Mace Windu. "
					+ "/n Sadly, you die from the hands of the Sith Lord Darth Sidious. "
					+ "/n Better luck next time.");
			Runner.gameOff();
		}
		else if (findKeyword (statement, "green") >= 0)
		{
			System.out.println("You are a Jedi Counselor. Wisest of the wise. "
					+ "/n You have a choice to teach the future generation, or meditate alongside Master Yoda. "
					+ "/n What will it be?");
			if (findKeyword (statement, "meditate") >= 0)
			{
				System.out.println("While meditating, you found out that the Chancellor is the Sith Lord. "
						+ "/n Will you tell the Jedi Order or kill him yourself?");
				if (findKeyword (statement, "kill") >= 0)
				{
					System.out.println("You have broken the Jedi code, and you have been killed "
							+ "/n by the sith lord. Did you really think you could beat him!?");
					Runner.gameOff();
				}
				else
				{
					System.out.println("Good Job! The chancellor was arrested and taken care of!");
				}
			}
			else 
			{
				System.out.println("You have taught students for 100's of years and now you have retired! "
						+ "/n Enjoy retirement!");
				Runner.gameOff();
			}
		}
		else if (findKeyword (statement, "black") >= 0)
		{
			System.out.println("THE ANCIENT DARKSABER! Used to kill the Jedi by the Mandalorian War Clan. "
					+ "/n You don't like being told what to do! You shall go on and live your own life!");
		}
		else
		{
			{
				System.out.println();
			}
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
			if (((before.compareTo("a") < 0) || (before.compareTo("z") > 0)) && ((after.compareTo("a") < 0) || 
					(after.compareTo("z") > 0)))
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
			System.out.print("[S]");
		}
	}
}