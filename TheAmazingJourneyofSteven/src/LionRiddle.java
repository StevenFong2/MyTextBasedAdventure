import java.util.Random;
public class LionRiddle extends Room {

	
	private boolean explored = false;
	public LionRiddle(int x, int y) {
		super(x, y);
	}
	public void enterRoom(Person x) {
		Random R = new Random();
		occupant = x;
		x.setx(this.x);
		x.sety(this.y);
		System.out.println("You enter a room that gives you an eerie feeling. Unlike the rest of the rooms, this one is decorated \n "
				+ "with drawing of weapons. One image stands out in particular, a king being hung. \n \n At the center of the room"
				+ " you see a stone lion with a tablet beneath its paws. The the tablet reads:");
		
		//Final Challenge Started
		int riddlevalue = R.nextInt(5) + 1;
		if(riddlevalue == 1)
		{
		System.out.println("Subversive is I "
				+ "\nWith only one eye "
				+ "\nI have a bell inside"
				+ " \nI am a way to be free"
				+ " \nAnd created by someone unhappy "
				+ "\nAt the end, a feline resides");
		}
		if(riddlevalue == 2)
		{
			System.out.println("He comes by bedsides, icy bridges,"
					+ "\nbattlefronts, and crumbling ridges."
					+ "\nWhen he comes, he comes alone,"
					+ "\ntaps a shoulder, then is gone.");
		}
		if(riddlevalue == 3)
		{
			System.out.println("I'm a word, six letters long,"
					+ "\nI sometimes enter with a gong."
					+ "\nAll in order from A to Z,"
					+ "\nI start with the letter B.");
		}
		if(riddlevalue == 4)
		{
			System.out.print("I eat, I live"
					+ "\nI breath, I live"
					+ "\nI drink, I die");
		}
		if(riddlevalue ==5)
		{
			System.out.println("A crawling contradiction I aim to create"
					+ "\nMy antithesis, my ideal state"
					+ "\nlacks the very thing I so often make"
					+ "\nAn example of hypocricy of the gods above,"
					+ "\nI breed hate in the name of love"
					+ "\nWhether it be a country or city"
					+ "\nPatience and Time will always win me"
					+ "\nWith nothing but a sign of ink, I come to life upon request"
					+ "\nAnd in my final breathe, I determine not who's right, but who is left" );
		}
	}
	
	public void print()
	{
		if(explored == false && occupant == null)
		{
			System.out.print("[ ]");
		}
		else if(occupant != null)
		{
			System.out.print("[");
			occupant.print();
			System.out.print("]");
		}
		else if(explored == true && occupant == null)
		{
			System.out.print("[R]");
		}
	}
}