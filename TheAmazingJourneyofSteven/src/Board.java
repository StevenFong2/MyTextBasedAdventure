//Steven, Saurabh, Mamadou
import java.util.Random;

public class Board 
{
	Room[][] dungeon;
	Random r = new Random();
	public Board (int row, int column)
	{
		this.dungeon = new Room[row][column];
		for (int i = 0; i < dungeon.length; i++)
		{
			for (int j = 0; j < dungeon[i].length; j++)
			{
				int a = r.nextInt(7);
				switch(a)
				{
				case 0:
					dungeon[i][j] = new LionRiddle(i, j);
					break;
				case 1:
					dungeon[i][j] = new PoisonRoom(i, j);
					break;
				case 2:
					dungeon[i][j] = new StarWars(i, j);
					break;
				case 3:
					dungeon[i][j] = new LockedRoom(i, j);
					break;
				case 4:
					dungeon[i][j] = new DeathRoom(i, j);
					break;
				case 5:
					dungeon[i][j] = new MarvelvDC(i, j);
					break;
				case 6:
					dungeon[i][j] = new Room(i, j);
					break;
				default:
					dungeon[i][j] = new Room(i, j);
					break;
				}
			}
		}
		dungeon[0][0] = new Room(0,0);
		dungeon[row - 1][column - 1] = new WinningRoom(row - 1, column - 1);
		
	}
	
	public void printMap()
	{
		for (int i = 0; i < dungeon.length; i++)
		{
			for (int j = 0; j < dungeon[i].length; j++)
			{
				dungeon[i][j].print();
			}
			System.out.println();
		}
	}
	
	public Room[][] getmap()
	{
		return this.dungeon;
	}
}