public class Player {

    //Variables
    private final int numSpells = 6;

    //Class Atributes
    private String playerName;
    private int health;
    private int mana;
    private int attackDamage;
    private Spell[] spells;

    //---------------------------------------------------------------------------

    //Constructor
    public Player(String playerName) {
        this.playerName = playerName;
        this.health = 100;
        this.mana = 100;
        this.attackDamage = 10;
        this.spells = new Spell[numSpells];
    }

    //---------------------------------------------------------------------------

    //Functions

    //Function to show player attributes
    public void showPlayerAttributes() {
        System.out.println("Player name: " + getPlayerName());
        System.out.println("Health: " + getHealth());
        System.out.println("Mana: " + getMana());
        System.out.println("Attack damage: " + getAttackDamage());
    }

    //Function to show added spells
    public void showPlayerSpells() {
        System.out.println("These are the spells available:");
        for (int i = 0; i < numSpells; i++) {
            if (spells[i] == null) {
                continue;
            }
            spells[i].showSpellAttributes();
        }
    }

    //Function to cast a spell
    public void castSpell(Spell spell) {
        System.out.println("I'm casting a spell, pew pew");
    }

    //---------------------------------------------------------------------------

    //Setters and Getters
    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getPlayerName() {
        return this.playerName;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getHealth() {
        return this.health;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getMana() {
        return this.mana;
    }

    public void setAttackDamage(int attackDamage) {
        this.attackDamage = attackDamage;
    }

    public int getAttackDamage() {
        return this.attackDamage;
    }
    
    public void setSpell(int index, Spell spell) {
        this.spells[index] = spell;
    }
    
    public Spell getSpell(int index) {
        return this.spells[index];
    }

}
