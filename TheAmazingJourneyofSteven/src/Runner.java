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
		//Used to reference the current room you are currently in
		building[0][1] = new LockedRoom(0,1);
	
		//create a random winning room.
		int x = (int)(Math.random()*building.length);
		int y = (int)(Math.random()*building.length);
		building[x][y] = new WinningRoom(x,y);
		
		//setup Player 1 and the input scanner
		String[] inventory = new String[10];
		for (int i = 0; i < inventory.length; i++)
		{
			inventory[i] = "";
		}
		Person player1 = new Person("FirstName", "FamilyName", 0,0, inventory);
		building[0][0].enterRoom(player1);
		Scanner in = new Scanner(System.in);
		while (gameOn)
		{
			System.out.println("Where would you like to move? (Choose N, S, E, W)");
			String move = in.nextLine();
			String command = in.nextLine();
			if (building[player1.getx()][player1.gety()] instanceof LockedRoom)
			{
				int numKey = 0;
				for(int i = 0; i < player1.inventory.length; i++)
				{
					if (player1.inventory[i].equals("Key"))
					{
						numKey++;
					}
				}
				if (numKey > 0)
				{
					System.out.println("You tried opening the door with force but it did not budge.");
					System.out.println("If only I have a key...");
				}
				else if (command == "Use Key" && validMove(move, player1 , building) == true)
				{
					
				}
				else
				{
					System.out.println("You tried opening the door with force but it did not budge.");
					System.out.println("Having no Key you are stuck in that room for eternity..." +
									   "\nYou can hear the sound of your stomach growling," +
									   "\nYou grow hungrier day by day, and then you look at you own arm...");
					System.out.println("You reached the end of your adventure... Better luck next time!");
					gameOff();
				}
			}
			else if (validMove(move, player1, building) == true)
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
	
	public static void gameOff()
	{
		gameOn = false;
	}
}
