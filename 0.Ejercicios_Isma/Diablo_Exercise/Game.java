import java.util.ArrayList;
import java.util.List;

public class Game {
    
    //Initialize variables
    Player player;
    Enemy enemy;
    List<Spell> baseSpells;

    //---------------------------------------------------------------------------

    //Constructor
    public Game() {
    }

    //---------------------------------------------------------------------------

    //Functions

    //Function to load spells
    private void loadSpells() {
        baseSpells = new ArrayList<Spell>();
        baseSpells.add(new Spell("Fireball", 20, 5, 80));
        baseSpells.add(new Spell("Icecold", 30, 7, 15));
        baseSpells.add(new Spell("Thunderstorm", 15, 3, 10));
        baseSpells.add(new Spell("Earthquake", 50, 8, 20));
        baseSpells.add(new Spell("Whirlwind", 10, 3, 10));
        baseSpells.add(new Spell("Tackle", 1, 1, 0));
    }

    //Function to see if player is dead
    public boolean playerIsDead() {
        return player.getHealth() <= 0;
    }

    //Function to see if enemy is dead
    public boolean enemyIsDead() {
        return enemy.getHealth() <= 0;
    }

    //Function to see if player's mana is enough to use a spell
    public boolean hasEnoughMana() {
        return player.getMana() >= player.getSpell(0).getManaCost();
    }

    //Function to fight
    private void playerVsEnemy(Player player, Enemy enemy) {

        System.out.println("TIME TO FIGHT");
        System.out.println();

        while(true) {

            int random = (int)(Math.random() * 2);

            switch (random) {
                //Player attacks first
                case 0:
                System.out.println(player.getPlayerName() + " attacks first!");
                if (hasEnoughMana()) {
                    System.out.println(player.getPlayerName() + " uses a spell!");
                    enemy.setHealth(enemy.getHealth() - player.getSpell(0).getDamage());
                    System.out.println(enemy.getEnemyName() + " has received " + player.getSpell(0).getDamage() + " damage!");
                    System.out.println(enemy.getEnemyName() + " 's health: " + enemy.getHealth());
                    player.setMana(player.getMana() - player.getSpell(0).getManaCost());
                } else {
                    enemy.setHealth(enemy.getHealth() - player.getAttackDamage());
                    System.out.println(enemy.getEnemyName() + " has received " + player.getAttackDamage() + " damage!");
                    System.out.println(enemy.getEnemyName() + " 's health: " + enemy.getHealth());
                }
                if (enemyIsDead()) {
                    System.out.println();
                    System.out.println(enemy.getEnemyName() + " has died (as always)");
                    System.exit(0);
                }
                System.out.println();
                System.out.println(enemy.getEnemyName() + " attacks now!");
                player.setHealth(player.getHealth() - enemy.getAttackDamage());
                System.out.println(player.getPlayerName() + " has received " + enemy.getAttackDamage() + " damage!");
                System.out.println(player.getPlayerName() + " 's health: " + player.getHealth());
                if (playerIsDead()) {
                    System.out.println();
                    System.out.println(player.getPlayerName() + " has unfortunately died...");
                    System.exit(0);
                }
                System.out.println();
                break;

                //Enemy attacks first
                case 1:
                System.out.println(enemy.getEnemyName() + " attacks first!");
                player.setHealth(player.getHealth() - enemy.getAttackDamage());
                System.out.println(player.getPlayerName() + " has received " + enemy.getAttackDamage() + " damage!");
                System.out.println(player.getPlayerName() + " 's health: " + player.getHealth());
                if (playerIsDead()) {
                    System.out.println();
                    System.out.println(player.getPlayerName() + " has unfortunately died...");
                    System.exit(0);
                }
                System.out.println();
                System.out.println(player.getPlayerName() + " attacks now!");
                if (hasEnoughMana()) {
                    System.out.println(player.getPlayerName() + " uses a spell!");
                    enemy.setHealth(enemy.getHealth() - player.getSpell(0).getDamage());
                    System.out.println(enemy.getEnemyName() + " has received " + player.getSpell(0).getDamage() + " damage!");
                    System.out.println(enemy.getEnemyName() + " 's health: " + enemy.getHealth());
                    player.setMana(player.getMana() - player.getSpell(0).getManaCost());
                } else {
                    enemy.setHealth(enemy.getHealth() - player.getAttackDamage());
                    System.out.println(enemy.getEnemyName() + " has received " + player.getAttackDamage() + " damage!");
                    System.out.println(enemy.getEnemyName() + " 's health: " + enemy.getHealth());
                }
                if (enemyIsDead()) {
                    System.out.println();
                    System.out.println(enemy.getEnemyName() + " has died (as always)");
                    System.exit(0);
                }
                System.out.println();
                break;

                default: System.out.println("Wtf just happened");
            }
            System.out.println("-------------------------------------------------");

        }
    }

    //Function to initialize everything
    public void init() {

        loadSpells();

        player = new Player("Albert");
        player.setSpell(0, baseSpells.get(0));
        System.out.println();
        player.showPlayerAttributes();
        System.out.println();
        player.showPlayerSpells();

        enemy = new Enemy("El Puto Thomas");
        System.out.println();
        enemy.showEnemyAttributes();
        System.out.println();

        playerVsEnemy(player, enemy);
    }
    
}
