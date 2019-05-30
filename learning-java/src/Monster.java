public class Monster {
	
	public final String TOMBSTONE = "Here lies a Dead Monster";
	
	private int health = 500;
	private int attack = 20;
	private int movement = 2;
	private int xPosition = 0;
	private int yPosition = 0;
	private boolean alive = true;
	
	public String name = "Big Monster";
	
	public int getAttack() {
		return this.attack;
	}
	public int getMovement() {
		return this.movement;
	}
	public int getHealth() {
		return this.health;
	}
	public void setHealth(int decreasedHealth) {
		this.health -= decreasedHealth;
		if (health <= 0) {
			this.alive = false;
		}
	}
	
	public void setHealth(double decreaseHealth) { // Function overloading; same function that takes different argument type
		int intDecreaseHealth = (int) decreaseHealth;
		this.health -= intDecreaseHealth;
		if (health <= 0) {
			this.alive = false;
		}
	}
	
	public Monster(int health, int attack, int movement) { // This is a constructor; Constructors can't have the return value of any type
		this.health = health;
		this.attack = attack;
		this.movement = movement;
	}
	
	
	// Without the arguments, this is the DEFAULT constructor
	public Monster() { // Constructor overloading
		
	}
	
	public Monster(int newHealth) {
		health = newHealth;
	}
	
	public Monster(int newHealth, int newAttack) {
		this(newHealth); // "this(newHealth)" launches the constructor that takes only newHealth and use it in that function
		attack = newAttack;
	}
	
}