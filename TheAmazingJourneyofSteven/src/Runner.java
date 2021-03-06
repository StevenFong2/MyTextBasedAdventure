// Saurabh Bansal, Mamadou Diallo, Steven Fong		AP Java Pd 2		Text Based Adventure
import java.util.Scanner;

public class Runner 
{
	//The private variables are useful only in the runner
	//The non private variables are replicas of the created object,
	//They are not private because I needed to call the 
	//current running map and the current running player for the Item interface.
	private static boolean gameOn = true;
	public static Board runningmap;
	public static Person runningplayer;
	//Every class will use same scanner
	//somehow creating another scanner in another
	//class makes a noelementexception error for the scanner,
	//this gets rid of it.
	public static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		//Sets up board
		runningmap = new Board(10,10);
		
		//This is the pre-game, where it explains everything about the game before we begin
		//It is also where we set up the player name.
		System.out.println("Wow.. you must have gone far to be playing this game..."
					+ "\nThis is gonna be pretty boring, and yet you are still willing to play it?"
					+ "\nThat is some determination."
					+ "\nThe point is... you must be really bored to be playing this.. well whatever"
					+ "\nbefore you start complaining about how hard the game is"
					+ "\nwhy don't you tell me your name so that I can put it up on"
					+ "\nthe wall of failures when you do rage quit..?"
					+ "\nGo ahead, type in your name");
		String name = in.nextLine();
		System.out.println(name + "?" + "Really? That's... well ...basic... whatever..");
		System.out.println("Welcome to the game " + name
					+ "\nPlease choose a class, not that it matters:"
					+ "\n1. Warrior"
					+ "\n2. Thief"
					+ "\n3.Magician");
		String job = in.nextLine().toLowerCase().trim();
		//Explanation of game goes here, all the rule, all the commands, and everything else
		
		//This is the creation and the set up for the player.
		Item[] startinginventory = new Item[10];
		for (int i = 0; i < 10; i++)
		{
			startinginventory[i] = new Placeholder();
		}
		
		if (job .equals("warrior") || job .equals("1"))
		{
			runningplayer = new Warrior(name, 0, 0, startinginventory);
		}
		
		if (job .equals("thief") || job .equals("2"))
		{
			runningplayer = new Thief(name, 0, 0, startinginventory);
		}
		
		if (job .equals("magician") || job .equals("3"))
		{
			runningplayer = new Magician(name, 0, 0, startinginventory);
		}
		
		System.out.println("Well, everything is set up now.. I hope you have a miserable time,"
					+ "\nI'm gonna leave now, BYE!!!!"
					+ "\n");
		System.out.println("*** Story Time ****"
					+ "\n");
		
		//testing code
		startinginventory[0] = new Magickey();
		
		runningplayer = new Person(name, 0, 0, startinginventory);
		
		//testing code
		runningmap.getdungeon()[0][1] = new LockedRoom(0,1);
		//testing code
		runningmap.getdungeon()[1][0] = new LionRiddle(1,0);
		
		System.out.println("The Dungeon of Steven. Locked away for countless years, the\n"
				+ "dungeon was the goal of countless adventurers, all who entered with\n"
				+ "great ambitions but never left. With time, warriors stopped trying to clear\n"
				+ "the dungeon that had killed so many already. It was unbeatable. The end goal\n"
				+ "unacheivable. The challenges unfathomable. Until now that is...");
		
		System.out.println("You wake up in a dirty, worn down room. You don't remember much about yourself or why you are here," + "\nbut something tells you that staying here won't end well for you.");
		runningmap.getdungeon()[0][0].enterRoom(runningplayer);
		System.out.println("Where would you like to move? (Choose N, S, E, W)");
		runningmap.printMap();

		while (gameOn)
		{
			String move = in.nextLine().toLowerCase().trim();

			if (validMove(move, runningplayer, runningmap.getmap()) == true)

			{
				System.out.println("Your coordinates: row = " + runningplayer.getx() + " col = " + runningplayer.gety());
				runningmap.printMap();
			}
			
			else
			{
				System.out.println("Choose a valid move");
			}
		}
		in.close();
	}
	
	public static boolean validMove(String move, Person p, Room[][] map)
	{
		move = move.toLowerCase().trim();

			switch (move)
			{
			case "n":
				if (p.getx() > 0 && runningmap.getdungeon()[p.getx()][p.gety()].getlocked() == false)
				{
					map[p.getx()][p.gety()].leaveRoom(p);
					map[p.getx() - 1][p.gety()].enterRoom(p);
					return true;
				}
				else
				{
					return false;
				}
			
			case "e":
				if (p.gety() < map[p.getx()].length - 1 && runningmap.getdungeon()[p.getx()][p.gety()].getlocked() == false)
				{
					map[p.getx()][p.gety()].leaveRoom(p);
					map[p.getx()][p.gety() + 1].enterRoom(p);
					return true;
				}
				else
				{
					return false;
				}
			
			case "s":
				if (p.getx() < map.length - 1 && runningmap.getdungeon()[p.getx()][p.gety()].getlocked() == false)
				{
					map[p.getx()][p.gety()].leaveRoom(p);
					map[p.getx() + 1][p.gety()].enterRoom(p);
					return true;
				}
				else
				{
					return false;
				}
			case "w":
				if (p.gety() > 0 && runningmap.getdungeon()[p.getx()][p.gety()].getlocked() == false)
				{
					map[p.getx()][p.gety()].leaveRoom(p);
					map[p.getx()][p.gety() - 1].enterRoom(p);
					return true;
				}
				else
				{
					return false;
				}
			default:
				return false;
			}
	}
	
	public static void gameOff()
	{
		gameOn = false;
	}
}
