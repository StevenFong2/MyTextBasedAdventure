import java.util.Scanner;

public class Runner 
{
	private static boolean gameOn = true;
	
	public static void main(String[] args)
	{
		//Room[][] building = new Room[5][5];
		
		//Fill the building with normal rooms
		/*for (int x = 0; x < building.length; x++)
		{
			for (int y = 0; y < building[x].length; y++)
			{
				building[x][y] = new Room(x,y);
			}
		}
		//Used to reference the current room you are currently in
		building[0][1] = new LockedRoom(0,1);
		building[1][2] = new PoisonRoom(1,2);
		building[0][2] = new DeathRoom(0,2);
		building[4][2] = new LionRiddle(4,2);
	
		//create a random winning room.
		int x = (int)(Math.random()*building.length);
		int y = (int)(Math.random()*building.length);
		building[x][y] = new WinningRoom(x,y);*/
		Board map = new Board(5,5);
		String[] startinginventory = new String[10];
		//setup Player 1 and the input scanner
		Person player1 = new Person("FirstName", "FamilyName", 0, 0, startinginventory);
		map.dungeon[0][0].enterRoom(player1);
		Scanner in = new Scanner(System.in);
		while (gameOn)
		{
			System.out.println("Where would you like to move? (Choose N, S, E, W)");
			String move = in.nextLine();
			if (validMove(move, player1, map.getmap()) == true)
			{
				System.out.println("Your coordinates: row = " + player1.getx() + " col = " + player1.gety());
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
	
	public void printboard(Room [][] someinput, Person p)
	{
		if (someinput[p.getx()][p.gety()].occupant != null)
		{
			
		}
	}
	public static void gameOff()
	{
		gameOn = false;
	}
}
