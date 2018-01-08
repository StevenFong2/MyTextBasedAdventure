//Mamadou
public class Warrior extends Person {
	private Item[] inventory;
	public Warrior(String Name, int x, int y, Item[] inventory) {
	super(Name, x, y, inventory);
	//Please Work
	this.health = 30;
	this.attack = 19;
	this.defense = 36;
	this.magic = 13;
	this.resistance = 28;
	this.speed = 12;
	this.setInventory(inventory);
}
public Item[] getInventory() {
	return inventory;
}
public void setInventory(Item[] inventory) {
	this.inventory = inventory;
}


}

