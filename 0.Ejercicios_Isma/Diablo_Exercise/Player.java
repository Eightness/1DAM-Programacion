public class Player {

    //Variables
    private final int numSpells = 6;

    //Class Atributes
    private String name;
    private int health;
    private int mana;
    private int attackDamage;
    private Spell[] spells;

    //---------------------------------------------------------------------------

    //Constructors

    //Empty constructor
    public Player() {

    }

    //Full constructor
    public Player(String name, int health, int mana, int attackDamage, Spell[] spells) {
        this.name = name;
        this.health = health;
        this.mana = mana;
        this.attackDamage = attackDamage;
        this.spells = spells;
    }

    //Constructor (only name)
    public Player(String name) {
        this.name = name;
        this.health = 100;
        this.mana = 100;
        this.attackDamage = 10;
        this.spells = new Spell[numSpells];
    }

    //---------------------------------------------------------------------------

    //Functions

    //Function to show player attributes
    public void showAttributes() {
        System.out.println("Player name: " + getName());
        System.out.println("Health: " + getHealth());
        System.out.println("Mana: " + getMana());
        System.out.println("Attack damage: " + getAttackDamage());
    }

    //Function to get assign 6 spells
    public void getSpells() {
        for (int i = 0; i < numSpells; i++) {
            
        }
    }

    //Function to show current spells
    public void showSpells() {
        System.out.println("These are the spells available:");
        for (int i = 0; i < numSpells; i++) {
            if (spells[i] == null) {
                continue;
            }
            spells[i].showAttributes();
        }
    }

    //Function to cast a spell
    public void castSpell(Spell spell) {
        spell.castSpell();
    }

    //Function to see if player has mana
    public boolean hasMana() {
        return getMana() > 0;
    }

    //Function to see if player has enough mana
    public boolean hasEnoughMana(int index) {
        return getMana() >= getSpell(index).getManaCost();
    }

    //---------------------------------------------------------------------------

    //Setters and Getters
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
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
