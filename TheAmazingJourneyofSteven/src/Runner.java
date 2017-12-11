import java.util.Scanner;

public class Runner 
{
	private static boolean gameOn = true;
	
	public static void main(String[] args)
	{
		Room[][] building = new Room[5][5];
		
		//Fill the building with normal rooms
		for (int x = 0; x < building.length; x++)
		{
			for (int y = 0; y < building[x].length; y++)
			{
				building[x][y] = new Room(x,y);
			}
		}
	
		//create a random winning room.
		int x = (int)(Math.random()*building.length);
		int y = (int)(Math.random()*building.length);
		building[x][y] = new Room(x,y);
		
		//setup Player 1 and the input scanner
		Person player1 = new Person("FirstName", "FamilyName", 0,0);
		building[0][0].enterRoom(player1);
		Scanner in = new Scanner(System.in);
		while (gameOn)
		{
			System.out.println("Where would you like to move? (Choose N, S, E, W)");
			String move = in.nextLine();
			if (validMove(move, player1, building))
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
			if (p.gety() > 0)
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
				map[p.getx() + 1][p.gety()].leaveRoom(p);
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
			break;
		}
		return true;
	}
	
	public static void gameOff()
	{
		gameOn = false;
	}
}
