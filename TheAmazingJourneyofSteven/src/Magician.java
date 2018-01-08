//Mamadou
public class Magician extends Person {
		private Item[] inventory;
		public Magician(String Name, int x, int y, Item[] inventory) {
		super(Name, x, y, inventory);
		this.health = 25;
		this.attack = 10;
		this.defense = 20;
		this.magic = 35;
		this.resistance = 18;
		this.speed = 20;
		this.setInventory(inventory);
		//please work
	}
	public Item[] getInventory() {
		return inventory;
	}
	public void setInventory(Item[] inventory) {
		this.inventory = inventory;
	}
	

}