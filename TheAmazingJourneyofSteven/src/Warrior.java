//Steven, Saurabh, Mamadou
public class Warrior extends Person
{
	public Warrior(String Name, int x, int y, Item[] inventory)
	{
		super(Name, x, y, inventory);
		//setting up the specific stats for each job;
		setHealth(30);
		setAttack(19);
		setDefense(36);
		setMagic(13);
		setResistance(28);
		setSpeed(12);
	}
}

