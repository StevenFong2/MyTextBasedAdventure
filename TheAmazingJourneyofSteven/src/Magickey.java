//Steven, Saurabh, Mamadou
public class Magickey implements Item
{
	public Magickey() {}
	
	public String description()
	{
		return "An oddly shaped object... Well doesn't hurt taking it.";
	}
	
	public void effect()
	{
		int x = Runner.runningplayer.getx();
		int y = Runner.runningplayer.gety();
		Runner.runningmap.getdungeon()[x][y].setlocked(false);
	}
}
