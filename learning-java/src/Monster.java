import java.util.*;


public class Monster {
	
	static char[][] battleBoard = new char[10][10];
	
	public static void buildBattleBoard() {
		for(char[] row : battleBoard) {
			Arrays.fill(row, '*');
			
		}
	}
	
	public static void redrawBoard() {
		int k = 1;
		while (k <= 30) {
			System.out.print('-');
			k++;
		}
		System.out.println();
		for (int i = 0; i < battleBoard.length; i++) {
			for (int j = 0; j < battleBoard[i].length; j++) {
				System.out.print("|" + battleBoard[i][j] + "|");
			}
			System.out.println();
		}
		k = 1;
		while (k <= 30) {
			System.out.print('-');
			k++;
		}
	}
	
	
	public final String TOMBSTONE = "Here lies a Dead Monster";
	
	private int health = 500;
	private int attack = 20;
	private int movement = 2;
	
	private boolean alive = true;
	
	public String name = "Big Monster";
	public char nameChar1 = 'B';
	public int xPosition = 0;
	public int yPosition = 0;
	public static int numOfMonsters = 0;
	
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
	
	public boolean getAlice() {
		return alive;
	}
	
	public Monster(int health, int attack, int movement, String name) { // This is a constructor; Constructors can't have the return value of any type
		this.health = health;
		this.attack = attack;
		this.movement = movement;
		this.name = name;
		
		int maxXBoardSpace = battleBoard.length - 1;
		int maxYBoardSpace = battleBoard[0].length - 1;
		
		int randNumX, randNumY;
		
		do {
			randNumX = (int) (Math.random() * maxXBoardSpace);
			randNumY = (int) (Math.random() * maxYBoardSpace);
		} while(battleBoard[randNumX][randNumY] != '*');
		
		this.xPosition = randNumX;
		this.yPosition = randNumY;
		
		this.nameChar1 = this.name.charAt(0);
		
		battleBoard[this.yPosition][this.xPosition] = this.nameChar1;
		
		numOfMonsters++;
		
	}
	
	
	// Without the arguments, this is the DEFAULT constructor
	public Monster() { // Constructor overloading
		numOfMonsters++;
	}
	
	public Monster(int newHealth) {
		health = newHealth;
	}
	
	public Monster(int newHealth, int newAttack) {
		this(newHealth); // "this(newHealth)" launches the constructor that takes only newHealth and use it in that function
		attack = newAttack;
	}
	
}