//Steven, Saurabh, Mamadou
public class Thief extends Person
{
	public Thief(String Name, int x, int y, Item[] inventory) 
	{
		super(Name, x, y, inventory);
		//setting up the specific stats for each job;
		setHealth(20);
		setAttack(26);
		setDefense(15);
		setMagic(16);
		setResistance(12);
		setSpeed(44);
	}
}
