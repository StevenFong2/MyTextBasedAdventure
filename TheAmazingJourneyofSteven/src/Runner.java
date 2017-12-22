import java.util.Scanner;

public class Runner 
{
	private static String firstname;
	private static String familyname;
	private static boolean gameOn = true;
	private static boolean pregame = true;
	
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		//Used to reference the current room you are currently in
		/*building[0][1] = new LockedRoom(0,1);
		building[1][2] = new PoisonRoom(1,2);
		building[0][2] = new DeathRoom(0,2);
		building[4][2] = new LionRiddle(4,2);
	
		//create a random winning room.
		int x = (int)(Math.random()*building.length);
		int y = (int)(Math.random()*building.length);
		building[x][y] = new WinningRoom(x,y);*/
		Board map = new Board(5,5);
		while (pregame)
		{
			System.out.println("This is where the introduction of the game goes and the explanation of all the rules which I am not too sure of what if is yet.");
			System.out.println("Please eneter your full name with a space between your first and last, if you have a middle, name too bad,");
			String fullname = in.nextLine();
			setupname(fullname);
			System.out.println("Welcom to the game Mr." + familyname);
			
			pregame = false;
		}
		String[] startinginventory = new String[10];
		Person player1 = new Person(firstname, familyname , 0, 0, startinginventory);
		map.dungeon[0][0].enterRoom(player1);
		while (gameOn)
		{
			System.out.println("You wake up in a dirty, worn down room. You don't remember much about yourself or why you are here, but something tells you that staying here won't end well for you.");
			System.out.println("Where would you like to move? (Choose N, S, E, W)");
			map.printMap();
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
					map[p.getx()][p.gety() - 1].leaveRoom(p);
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
		somename = somename.trim().toLowerCase();
		int psn = somename.indexOf(" ");
		firstname = somename.substring(0, 1).trim().toUpperCase() + somename.substring(1, psn).trim();
		familyname = somename.substring(psn + 1, psn + 2).trim().toUpperCase() + somename.substring(psn + 2).trim();
	}
	
	public static void gameOff()
	{
		gameOn = false;
	}
}
