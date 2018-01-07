//Mamadou
public class Warrior extends Person {
	private String[] inventory = {"Longsword", "Health"};
	public Warrior(String firstName, String familyName, int x, int y, String[] inventory) {
	super(firstName, familyName, x, y, inventory);
	//Please Work
	this.health = 30;
	this.attack = 19;
	this.defense = 36;
	this.magic = 13;
	this.resistance = 28;
	this.speed = 12;
	this.setInventory(inventory);
}
public String[] getInventory() {
	return inventory;
}
public void setInventory(String[] inventory) {
	this.inventory = inventory;
}


}

