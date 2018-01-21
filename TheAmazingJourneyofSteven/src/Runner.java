// Saurabh Bansal, Mamadou Diallo, Steven Fond		AP Java Pd 2		Text Based Adventure
import java.util.Scanner;

public class Runner 
{
	//The private variables are useful only in the runner
	//The non private variables are replicas of the created object,
	//They are not private because I needed to call the 
	//current running map and the current running player for the Item interface.
	private static String Name;
	private static boolean gameOn = true;
	private static boolean pregame = true;
	static Board runningmap;
	static Person runningplayer;
	static Scanner in = new Scanner(System.in);
	//static String currentmove;
	
	public static void main(String[] args)
	{
		//Sets up board
		Board map = new Board(5,5);
		runningmap = map;
		
		//This is the pre-game, where it explains everything about the game before we begin
		//It is also where we set up the player name.
		while (pregame)
		{
			System.out.println("The Dungeon of Steven. Locked away for countless years, the\n"
					+ "dungeon was the goal of countless adventurers, all who entered with\n"
					+ "great ambitions but never left. With time, warriors stopped trying to clear\n"
					+ "the dungeon that had killed so many already. It was unbeatable. The end goal\n"
					+ "unacheivable. The challenges unfathomable. Until now that is...");
			System.out.println("Please enter your name");

			String name = in.nextLine();
			System.out.println(name + "?" + "Really? That's so basic... well whatever..");
			System.out.println("Welcome to the game " + name);
			
			pregame = false;
		}
		
		//This is the creation and the set up for the player.
		Item[] startinginventory = new Item[10];
		for (int i = 0; i < 10; i++)
		{
			startinginventory[i] = new Placeholder();
		}
		startinginventory[0] = new Magickey();
		Person player = new Person(Name, 0, 0, startinginventory);
		runningplayer = player;
		runningmap.dungeon[0][1] = new LockedRoom(0,1);
		runningmap.dungeon[1][0] = new LionRiddle(1,0);
		System.out.println("You wake up in a dirty, worn down room. You don't remember much about yourself or why you are here," + "\nbut something tells you that staying here won't end well for you.");
		runningmap.dungeon[0][0].enterRoom(runningplayer);
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
				if (p.getx() > 0 && runningmap.dungeon[p.getx()][p.gety()].getlocked() == false)
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
				if (p.gety() < map[p.getx()].length - 1 && runningmap.dungeon[p.getx()][p.gety()].getlocked() == false)
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
				if (p.getx() < map.length - 1 && runningmap.dungeon[p.getx()][p.gety()].getlocked() == false)
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
				if (p.gety() > 0 && runningmap.dungeon[p.getx()][p.gety()].getlocked() == false)
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
	
	public static void setupname(String somename)
	{
		Name = somename;
	}
	
	public static void gameOff()
	{
		gameOn = false;
	}
}
