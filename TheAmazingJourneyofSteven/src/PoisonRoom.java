public class PoisonRoom extends Room {



	public PoisonRoom(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void enterRoom(Person x) {
		// TODO Auto-generated method stub
		occupant = x;
		x.setx(this.x);
		x.sety(this.y);
		System.out.println("As you walk into the room, you hear the door behind you slamming shut. A gas begins to fill the room from small slits"
				+ " in the walls.");
	}
	
}