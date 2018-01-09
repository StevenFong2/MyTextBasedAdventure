//Mamadou
public class Thief extends Person {
		private Item[] inventory;
		public Thief(String Name, int x, int y, Item[] inventory) 
		{
			super(Name, x, y, inventory);
			this.health = 20;
			this.attack = 26;
			this.defense = 15;
			this.magic = 16;
			this.resistance = 12;
			this.speed = 44;
			this.setInventory(inventory);
	}
	public Item[] getInventory() {
		return inventory;
	}
	public void setInventory(Item[] inventory) {
		this.inventory = inventory;
	}
	

}
