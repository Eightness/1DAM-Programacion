import java.util.ArrayList;
import java.util.List;

public class Game {
    
    //Initialize variables
    Player player1, player2;
    List<Spell> spells;

    //---------------------------------------------------------------------------

    //Empty constructor
    public Game() {

    }

    //---------------------------------------------------------------------------

    //Functions

    //Function to load spells
    private void loadSpells() {
        spells = new ArrayList<Spell>();
        spells.add(new Spell("Fireball", 20, 5, 80));
        spells.add(new Spell("Icecold", 30, 7, 15));
        spells.add(new Spell("Thunderstorm", 15, 3, 10));
        spells.add(new Spell("Earthquake", 50, 8, 20));
        spells.add(new Spell("Whirlwind", 10, 3, 10));
        spells.add(new Spell("Tackle", 1, 1, 0));
    }

    //Function to get a random integer between 0 and the specified number
    public int getRandomInt(int max) {
        int random = (int)(Math.random() * (max + 1));
        return random;
    }

    //Function to initialize everything
    public void init() {

        loadSpells();
        player1 = new Player("Albert");
        player1 = new Player("Marra");
        
    }
    
}
