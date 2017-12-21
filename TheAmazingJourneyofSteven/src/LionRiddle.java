public class LionRiddle extends Room {



	public LionRiddle(int x, int y) {
		super(x, y);
	}
	public void enterRoom(Person x) {
		occupant = x;
		x.setx(this.x);
		x.sety(this.y);
		System.out.println("You enter a room that gives you an eerie feeling. Unlike the rest of the rooms, this one is decorated \n "
				+ "with drawing of weapons. One image stands out in particular, a king being hung. \n \n At the center of the room"
				+ " you see a stone lion with a tablet beneath its paws. The the tablet reads:");
		
		//Final Challenge Started
		System.out.println("Subversive is I \nWith only one eye \nI have a bell inside \nI am a way to be free \nAnd created by someone unhappy \nAt the end, a feline resides \nWhat am I?"
				+ "");
	}
}