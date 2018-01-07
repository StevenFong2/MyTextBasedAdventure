//Mamadou
public class Magician extends Person {
		private String[] inventory = {"Spellbook", "Lockpick"};
		public Magician(String firstName, String familyName, int x, int y, String[] inventory) {
		super(firstName, familyName, x, y, inventory);
		this.health = 25;
		this.attack = 10;
		this.defense = 20;
		this.magic = 35;
		this.resistance = 18;
		this.speed = 20;
		this.setInventory(inventory);
		//please work
	}
	public String[] getInventory() {
		return inventory;
	}
	public void setInventory(String[] inventory) {
		this.inventory = inventory;
	}
	

}