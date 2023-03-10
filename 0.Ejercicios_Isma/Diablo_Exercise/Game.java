//Class Game
public class Game {
    
    //Initialize variables
    public Player player;
    public Enemy enemy;
    public Spell[] spells = new Spell[6];

    //---------------------------------------------------------------------------

    //Empty constructor
    public Game() {

    }

    //---------------------------------------------------------------------------

    //Functions

    //Function to load spells
    public void loadSpells() {
        spells[0] = new Spell("Fireball", 20, 5, 30);
        spells[1] = new Spell("Icecold", 30, 7, 40);
        spells[2] = new Spell("Thunderstorm", 15, 3, 25);
        spells[3] = new Spell("Earthquake", 50, 8, 80);
        spells[4] = new Spell("Whirlwind", 10, 3, 20);
        spells[5] = new Spell("Tackle", 1, 1, 0);
    }

    //Function to assign spells to a player
    public void assignSpell() {
        player.setSpell(spells[0]);
    }

    //Function to initialize everything
    public void init() {
        player = new Player("Albert", 100);
        enemy = new Enemy("Marrahy", 100);
        loadSpells();
        assignSpell();
    }

    public void startGame() {

    }
    
}
