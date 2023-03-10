//Class Game
public class Game {
    
    //Initialize variables
    public Player player1, player2;
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
    public void assignSpell(Player player) {
        player.setSpell(spells[(int)(Math.random() * 6)]);
    }

    //Function to initialize everything
    public void init() {
        player1 = new Player("Albert", 100);
        player2 = new Player("Marrahy", 100);
        loadSpells();
        assignSpell(player1);
        assignSpell(player2);
    }

    public void startGame() {
        while (true) {
            if (player1.hasEnoughMana()) {
                player2.takeDamage(player1.getSpell().getDamage());
            } else {
                player2.takeDamage(player1.getAttackDamage());
            }
    
            if(player2.isDead()) {
                break;
            }
            
            if (player2.hasEnoughMana()) {
                player1.takeDamage(player2.getSpell().getDamage());
            } else {
                player1.takeDamage(player2.getAttackDamage());
            }
    
            if (player1.isDead()) {
                break;
            }
        }
    }
    
}
