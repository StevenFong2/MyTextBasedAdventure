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
				+ " you see a stone lion with a tablet beneath its paws.");
		
		//Final Challenge Started
		System.out.println("Subversive is I \n With only one eye \n I have a bell inside \n I am a way to be free \n And created by someone unhappy \n At the end, a feline resides \n What am I?"
				+ "");
	}
}