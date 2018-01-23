//Steven, Saurabh, Mamadou
public class Magician extends Person
{
	public Magician(String Name, int x, int y, Item[] inventory) 
	{
		super(Name, x, y, inventory);
		//setting up the specific stats for each job;
		setHealth(25);
		setAttack(10);
		setDefense(20);
		setMagic(35);
		setResistance(18);
		setSpeed(20);
	}
}