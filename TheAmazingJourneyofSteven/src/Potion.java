//Steven, Saurabh, Mamadou
public class Potion implements Item
{
	public Potion() {}
	
	public String description()
	{
		return "Tasty refreshing questionable liquid, maybe it's medicine?" + "\n(Can be used to restore a small amount of health)";
	}
	
	public void effect()
	{
		Runner.runningplayer.setHealth(Runner.runningplayer.getHealth() + 20);
	}
}
