// Saurabh Bansal, Mamadou Diallo, Steven Fond		AP Java Pd 2		Text Based Adventure
import java.util.Scanner;

public class Runner 
{
	private static String Name;
	private static boolean gameOn = true;
	private static boolean pregame = true;
	static Board runningmap;
	static Person runningplayer;
	
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		Board map = new Board(5,5);
		runningmap = map;
		while (pregame)
		{
			System.out.println("This is where the introduction of the game goes and the explanation of all the rules which I am not too sure of what if is yet.");
			System.out.println("Please eneter your full name with a space between your first and last, if you have a middle, name too bad,");
			String name = in.nextLine();
			System.out.println("Welcome to the game " + name);
			
			pregame = false;
		}
		Item[] startinginventory = new Item[10];
		for (int i = 0; i < 10; i++)
		{
			startinginventory[i] = null;
		}
		Person player1 = new Person(Name, 0, 0, startinginventory);
		runningplayer = player1;
		map.dungeon[0][0].enterRoom(player1);
		//map.dungeon[0][1] = new LockedRoom(0,1);
		map.dungeon[1][0] = new LionRiddle(1,0);
		System.out.println("You wake up in a dirty, worn down room. You don't remember much about yourself or why you are here," + "\nbut something tells you that staying here won't end well for you.");
		System.out.println("Where would you like to move? (Choose N, S, E, W)");
		map.printMap();
		while (gameOn)
		{
			String move = in.nextLine();

			if (validMove(move, player1, map.getmap()) == true)

			{
				System.out.println("Your coordinates: row = " + player1.getx() + " col = " + player1.gety());
				map.printMap();
			}
			
			else
			{
				System.out.println("You have reached a wall");
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
				if (p.getx() > 0)
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
				if (p.gety() < map[p.getx()].length - 1)
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
				if (p.getx() < map.length - 1)
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
				if (p.gety() > 0)
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
