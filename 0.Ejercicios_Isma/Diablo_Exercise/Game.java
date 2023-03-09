import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.List;

public class Game {
    
    //Initialize variables
    public Player player1, player2;
    public List<Spell> spells;

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
        spells.add(new Spell("Icecold", 30, 7, 40));
        spells.add(new Spell("Thunderstorm", 15, 3, 40));
        spells.add(new Spell("Earthquake", 50, 8, 20));
        spells.add(new Spell("Whirlwind", 10, 3, 20));
        spells.add(new Spell("Tackle", 1, 1, 0));
    }

    //Function to get a random integer between 0 and the specified number
    public int getRandomInt(int max) {
        int random = (int)(Math.random() * (max + 1));
        return random;
    }

    //Function to get a random boolean
    public boolean getRandomBool() {
        return (int)(Math.random() * 2) == 1;
    }

    //Function to assign spells to a player
    private void assignSpells(Player player, List<Spell> spells) {
        for (int i = 0; i < 6; i++) {
            player.setSpell(i, spells.get(i));
        }
    }

    //Function to fight
    private void pvp(Player player1, Player player2) {

        System.out.println();
        System.out.println("Time to fight!");
        System.out.println();

        while (!player1.isDead(player1.getHealth()) || !player2.isDead(player2.getHealth())) {

            if (getRandomBool()) {
                //Player1 attacks
                int spell = getRandomInt(5);
                System.out.println(player1.getName() + " attacks!");
                if (player1.hasEnoughMana(spell))  {
                    System.out.println(player1.getName() + " uses a spell!");
                    player1.castSpell(spell);
                    player1.setMana(player1.getMana() - player1.getSpell(spell).getManaCost());
                    player2.setHealth((player2.getHealth() - player1.getSpell(spell).getDamage()));
                    System.out.println(player2.getName() + "'s health is: " + (player2.getHealth() - player1.getSpell(spell).getDamage()));
                } else {
                    player2.setHealth((player2.getHealth() - player1.getAttackDamage()));
                    System.out.println(player2.getName() + "'s health is: " + (player2.getHealth() - player1.getAttackDamage()));
                }
                System.out.println();

            } else {
                //Player2 attacks
                int spell = getRandomInt(5);
                System.out.println(player2.getName() + " attacks!");
                if (player2.hasEnoughMana(spell))  {
                    System.out.println(player2.getName() + " uses a spell!");
                    player2.castSpell(spell);
                    player2.setMana(player2.getMana() - player2.getSpell(spell).getManaCost());
                    player1.setHealth((player1.getHealth() - player2.getSpell(spell).getDamage()));
                    System.out.println(player1.getName() + "'s health is: " + (player1.getHealth() - player2.getSpell(spell).getDamage()));
                } else {
                    player1.setHealth((player1.getHealth() - player2.getAttackDamage()));
                    System.out.println(player2.getName() + "'s health is: " + (player1.getHealth() - player2.getAttackDamage()));
                }
                System.out.println();
            }
            
            if (player1.isDead(player1.getHealth())) {
                System.out.println(player1.getName() + " died...");
                break;
            }
            if (player2.isDead(player2.getHealth())) {
                System.out.println(player2.getName() + " died...");
                break;
            }
        }
    }

    //Function to initialize everything
    public void init() {

        loadSpells();

        player1 = new Player("Albert");
        player2 = new Player("Marra");

        assignSpells(player1, spells);
        assignSpells(player2, spells);
            
        pvp(player1, player2);
        

        
    }
    
}
