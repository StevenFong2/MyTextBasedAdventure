
public class Board 
{
	public Board (int row, int column)
	{
		Room[][] dungeon = new Room[row][column];
		int a = 0;
		int b = 0;
		for (Room i : dungeon[a])
		{
			for (Room j : dungeon[b])
			{
				j = new Room(a,b);
				b++;
			}
			a++;
		}
	}
}
