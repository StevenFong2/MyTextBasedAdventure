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
		System.out.println("Play this game you must. Choose a universe you must. DC or Marvel. "
				+ "/n Each has a unique story. If you don't choose a universe, YOU LOSE!");
		
		statement = in.nextLine();
		if (statement.length() == 0)
		{
			Runner.gameOff();
		}
		else if (findKeyword(statement, "dc") >= 0)
		{
			System.out.println("You have a choice to be a superhero. Each hero has their own story.");
			System.out.println("Heroes: Batman, Superman, Wonder Woman, Cyborg, Green lantern");
			if (statement.length() == 0)
			{
				Runner.gameOff();
			}
			else if (findKeyword (statement, "batman") >= 0)
			{
				System.out.println("You are Bruce Wayne. Your parents were murdered in front of you, and now you have been "
						+ "/n in Nanda Parbat training with Rha's Al Ghul. You are his most experienced fighter");
				System.out.println("Rha's Al Ghul has given you the opportunity to be his successor. Do you choose to accept?");
				if (findKeyword(statement, "yes") >= 0)
				{
					System.out.println ("You are now the successor of the most elite group of Assassins, League of Assassins,"
							+ "known to mankind."
							+ "/n Gotham (your home city) has fallen prey to corruption; What would you do?"
							+ "/n Use the assassins, destroy the city and rebuild, or will you just not care.");
					if (findKeyword(statement, "assassins") >= 0)
					{
						System.out.println("You have killed all known corrupt officials. Sadly, one of them was your "
								+ "/n girlfriend who you loved with all your heart and soul. You now will live the rest of your life"
								+ "/n knowing you killed your girlfriend, but as the leader of the League of Assassins.");
					}
					else if (findKeyword (statement, "destroy") >= 0)
					{
						System.out.println("Jesus Christ! You have burnt Gotham to the ground. EVERYONE IS DEAD."
								+ "/n I can't believe you think of yourself as a hero. Some people don't like the fact"
								+ "/n you destroyed Gotham. They have come to attack you at Nanda Parbat. Will you defend, or "
								+ "/n kill them first?");
						if (findKeyword (statement, "defend") >= 0)
						{
							System.out.println("You have defended, but at a cost. You died while defending.");
							Runner.gameOff();
						}
						else 
						{
							System.out.println("You are a ruthless killer. Go on and PLZ DONT KILL ME FOR HOLDING YOU! "
									+ "/n I have a wife and child! "
									+ "/n My wife's name is Microsoft and my child is XBOX. He has truly grown!");
						}
					}
					else
					{
						System.out.println("Noice, enjoy your life with the treasure and power you have. "
								+ "/n You will sadly be stuck in the game forever because we love you that much.");
						Runner.gameOff();
					}
				}
				else
				{
					System.out.println("You have chosen the path of Batman. There comes a time in your life where you "
							+ "meet Rha's Al Ghul's daughter (Talia Al Ghul). "
							+ "/n You have a child with her, but she takes the child to Nanda Parbat."
							+ "/n He becomes a ruthless killer, but an attack leads Talia to bring the son to you."
							+ "/n Your son is an absolute killer. Are you willing to teach him the ways of Batman?");
					if (findKeyword (statement, "yes") >= 0)
					{
						System.out.println ("Patiently, you got your son to learn to think first and then kill."
								+ "/n He has now worn the mantle of Robin, and you two work together to fight crime.");
					}
					else 
					{
						System.out.println("He kills you for not being there for him.");
						Runner.gameOff();
					}
				}
			}
			else if (findKeyword(statement, "super") >= 0)
			{
				System.out.println("You are the Kryptonite (god) sent from a spaceship to keep you safe from the evil regime!"
						+ "/n You have lived a life on a farm and you are the STRONGEST man alive!"
						+ "/n Now it is your choice to be a hero or a god.");
				if (findKeyword (statement, "hero") >= 0)
				{
					System.out.println ("You chose the right path! You can proceed.");
				}
				else
				{
					System.out.println ("You are now a god feared by all and challenged to a deul by Batman."
							+ "/n It is your choice if you want to kill him or watch him suffer.");
					if (findKeyword (statement, "kill") >= 0)
					{
						System.out.println("You tried killing the batman, and he had Kryptonite (your only weakness)."
								+ "/n You have died, better luck next time.");
								Runner.gameOff();
					}
					else 
					{
						System.out.println("In the midst of your fight with Batman, Darkseid has appeared and now you must fight him.");
						System.out.println("Good luck.");
					}
				}
			}
			else if (findKeyword(statement, "wonder") >= 0)
			{
				System.out.println("");
			}
			else if (findKeyword (statement, "cyb") >= 0)
			{
				
			}
			else //Green Lantern
			{
				
			}
		}
		else if (findKeyword (statement, "marvel")>=0)
		{
			System.out.println("You have a choice to be a superhero. Each hero has their own story.");
			System.out.println("Heroes: Iron Man, Hulk, Black Widow, Captain America, or Black Panther");
			if (statement.length() == 0)
			{
				Runner.gameOff();
			}
			else if (findKeyword (statement, "iron") >= 0)
			{
				
			}
			else if (findKeyword(statement, "hulk") >= 0)
			{
				
			}
			else if (findKeyword(statement, "widow") >= 0)
			{
				
			}
			else if (findKeyword (statement, "america") >= 0)
			{
				
			}
			else //Black Panther
			{
				
			}
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