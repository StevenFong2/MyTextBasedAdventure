public class Thief extends Person {
		private String[] inventory = {"Dagger", "Lockpick"};
		public Thief(String firstName, String familyName, int x, int y, String[] inventory) {
		super(firstName, familyName, x, y, inventory);
		this.health = 19;
		this.attack = 26;
		this.defense = 15;
		this.magic = 16;
		this.resistance = 12;
		this.speed = 44;
		this.setInventory(inventory);
	}
	public String[] getInventory() {
		return inventory;
	}
	public void setInventory(String[] inventory) {
		this.inventory = inventory;
	}
	

}
