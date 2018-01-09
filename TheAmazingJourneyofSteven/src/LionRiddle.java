//Mamadou
import java.util.Random;
import java.util.Scanner;
public class LionRiddle extends Room {

	
	public LionRiddle(int x, int y) {
		super(x, y);
	}
	public void enterRoom(Person x) {
		Random R = new Random();
		String Answer = "";
		occupant = x;
		x.setx(this.x);
		x.sety(this.y);
		this.explored = true;
	
		System.out.println("You enter a room that gives you an eerie feeling, the sound"
				+ "\nof the door behind you locking as you look around"
				+ ". Unlike the rest of the rooms, this one is decorated \n"
				+ "with drawing of weapons. One image stands out in particular, a king being hung. "
				+ "\n \nAt the center of the room "
				+ "you see a stone lion with a tablet beneath its paws. "
				+ "\nThe the tablet reads:\n");
		
		//Challenge Started
		int riddlevalue = R.nextInt(5) + 1;
		boolean Answered = false;
		if(riddlevalue == 1)
		{
		System.out.println("Subversive is I "
				+ "\nWith only one eye "
				+ "\nI have a bell inside"
				+ " \nI am a way to be free"
				+ " \nAnd created by someone unhappy "
				+ "\nAt the end, a feline resides");
		Answer = "rebellion";
		}
		if(riddlevalue == 2)
		{
			System.out.println("He comes by bedsides, icy bridges,"
					+ "\nbattlefronts, and crumbling ridges."
					+ "\nWhen he comes, he comes alone,"
					+ "\ntaps a shoulder, then is gone.");
			Answer = "death";
		}
		if(riddlevalue == 3)
		{
			System.out.println("I am a word, six letters long."
					+ "\nI sometimes enter with a gong."
					+ "\nAll in order from A to Z,"
					+ "\nI start with the letter B.");
			Answer = "begin";
		}
		if(riddlevalue == 4)
		{
			System.out.print("I eat, I live"
					+ "\nI breath, I live"
					+ "\nI drink, I die");
			Answer = "fire";
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
			Answer = "war";
		}
		int deathtime = 6;
		Scanner in = new Scanner(System.in);
		while(Answered == false)
		{
			String UserAns = in.nextLine();
			if(UserAns.equals(Answer))
			{
				Answered = true;
				System.out.println("The stone lion lets out a roar, the sound of the door on the"
						+ "\nother end of the room unlocking. Which way would you like to move?");
			}
			else 
			{
				Answered = false;
				System.out.println("You feel yourself draw closer to death."
						+ "\nInput the answer to the riddle and save yourself.");
			}
			
			deathtime--;
			if(deathtime == 0)
			{
				System.out.println("You see the statue of the lion come to life and walks towards you."
						+ "\nIt looks disappointed as it stares into your very soul."
						+ "\n"
						+ "\n'Tragic...I thought you were worthy', it says as it bites down on your"
						+ "\nhead, killing you.");
				Runner.gameOff();
				in.close();
			}
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