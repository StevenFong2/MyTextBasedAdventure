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
		this.explored = true;
		
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
			System.out.println("Heroes: Batman, Superman, Wonder Woman");
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
				System.out.println("Ah you are the beautiful Amazonian Princess. You find a man on the beach of Amazon."
						+ "/n You have a choice to help him in WW2 or to execute him.");
				if (findKeyword (statement, "Help") >= 0)
				{
					System.out.println("You helped him throughout WW2, but you discover a new thing about yourself,"
							+ "/n you are the daughter of Hades. Yikkes. Please pass through and don't kill me.");
				}
				else
				{
					System.out.println("A great war came to Amazon and everyone died. Since you're immortal, you didn't die."
							+ "/n Now you must live your life with the guilt of the death of all your sisters.");
				}
			}
			else
			{
				return;
			}
		}
		else
		{
			System.out.println("You have a choice to be a superhero. Each hero has their own story.");
			System.out.println("Heroes: Iron Man, Captain America, or Black Panther");
			if (statement.length() == 0)
			{
				Runner.gameOff();
			}
			else if (findKeyword (statement, "iron") >= 0)
			{
				System.out.println("Tony Stark. The Invincible Iron Man. You are the tech genius who made a fortune "
						+ "as CEO of Stark Industries."
						+ "/n You see a dilemma in your weapons creation, bad people get ahold of it and then they hurt inncoent people."
						+ "/n You now embark on an adventure to end all production of weapons, but there are people who don't like this plan."
						+ "/n Will you end all production as CEO of Stark Industries, or as Iron Man, or both?");
				if (findKeyword (statement, "iron") >= 0)
				{
					System.out.println("You vanquished all the villains using your tech, but the high stackholders of Stark "
							+ "/n Industries voted you out of the CEO position so that they can continue weapon production.");
					Runner.gameOff();
				}
				else if (findKeyword (statement, "ceo") >= 0)
				{
					System.out.print("The stakeholders were convinced that weapon production must end because of all the innocent people who get hurt, but"
							+ "/n the villains still had your weapons and were able to destroy cities. You failed the people.");
					Runner.gameOff();
				}
				else 
				{
					System.out.println("AYYYY Good job. You vanquished the enemies and stakeholders. Now everyone happy.");
				}
			}
			else if (findKeyword (statement, "captain") >= 0)
			{
				System.out.println("Ah you are Steven Rogers, the First Avenger because you were the Captain in WW2. Your tales keep your image alive, but there is a dilemma"
						+ "/n your best friend Bucky is The Winter Soldier. He has slaughtered thousands to million people. He is the real weapon of mass destruction."
						+ "/n You have him cornered and now you have a choice to kill him or try to help him.");
				if (findKeyword (statement, "kill") >= 0)
				{
					System.out.println("You killed your best friend! Bruh, go on but if you're ready to kill your bestie you not a real friend.");
				}
				else 
				{
					System.out.println("You tried helping him, but he just ended up getting carbon frozen in Wakanda and created a civil war amongst the Avengers. Good job?");
				}
			}
			else //Black Panther
			{
				System.out.println("Ah the great kind T'Challa. Your father died from a mercenary being greedy for vibranium (the strongest metal in the universe, it absorbs "
						+ "energy)."
						+ "/n You must now avenge your father. Would you rather use your powers as the Black Panther or would you rather use your immense army?");
				if (findKeyword (statement, "powers") >= 0)
				{
					System.out.println("You investigate and you found him. You killed your father's killer. Congrats.");
				}
				else
				{
					System.out.println("Your army ravages cities upon cities to find your father's killer. This creates a huge International dilemma, but you destroyed everything."
							+ "/n Now you control the world with an iron fist and you then get assassinated by the rebellion. Sad, but you have a son to continue controlling the world.");
					Runner.gameOff();
				}
			}
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