import java.util.Random;

public class Board 
{
	Room[][] dungeon;
	Random r = new Random();
	public Board (int row, int column)
	{
		this.dungeon = new Room[row][column];
		//Room[][] dungeon = new Room[row][column];
		//int a = 0;
		//int b = 0;
		/*for (Room[] i : dungeon)
		{
			for (Room j : i)
			{
				j = new Room(a,b);
				b++;
			}
			a++;
		}*/
		// I still need to finish this and add more rooms because as of right now the GAME IS MADDDD HARD TO BEAT!!
		for (int i = 0; i < dungeon.length; i++)
		{
			for (int j = 0; j < dungeon[i].length; j++)
			{
				int a = r.nextInt(7);
				switch(a)
				{
				case 0:
					dungeon[i][j] = new LionRiddle(i, j);
				case 1:
					dungeon[i][j] = new PoisonRoom(i, j);
				case 2:
					dungeon[i][j] = new StarWars(i, j);
				case 3:
					dungeon[i][j] = new LockedRoom(i, j);
				case 4:
					dungeon[i][j] = new DeathRoom(i, j);
				case 5:
					dungeon[i][j] = new MarvelvDC(i, j);
				case 6:
					dungeon[i][j] = new Room(i, j);
				default:
					dungeon[i][j] = new Room(i, j);
				}
			}
		}
		dungeon[0][0] = new Room(0,0);
		
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