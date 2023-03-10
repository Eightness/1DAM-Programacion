import java.util.Arrays;

//Subclass Player
public class Player extends Character {

    //Variables
    private final int numSpells = 6;

    //Class Atributes
    private int attackDamage;
    private int mana;
    private Spell spell;

    //---------------------------------------------------------------------------

    //Constructors

    //Empty constructor
    public Player() {

    }

    //Full constructor
    public Player(String name, int health, int mana, int attackDamage, Spell spell) {
        super(name, health);
        this.mana = mana;
        this.attackDamage = attackDamage;
        this.spell = null;
    }

    //Constructor (only name and health)
    public Player(String name, int health) {
        super(name, health);
        this.mana = 100;
        this.attackDamage = 10;
        this.spell = null;
    }

    //---------------------------------------------------------------------------

    //Functions

    //Function to show player attributes (overriding function in superclass Character)
    @Override
    public void showAttributes() {
        super.showAttributes();
        System.out.println("Attack damage: " + getAttackDamage());
        System.out.println("Mana: " + getMana());
        showSpell();
    }

    //Function to show current spells
    public void showSpell() {
        System.out.println("Spell: ");
            spell.showAttributes();
        }

    //Function to cast a spell
    public void castSpell() {
        this.spell.castSpell();
    }

    //Function to see if player has mana
    public boolean hasMana() {
        return getMana() > 0;
    }

    //Function to see if player has enough mana
    public boolean hasEnoughMana() {
        return getMana() >= this.spell.getManaCost();
    }

    //---------------------------------------------------------------------------

    //Setters and Getters
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
    
    public void setSpell(Spell spell) {
        this.spell = spell;
    }
    
    public Spell getSpell() {
        return this.spell;
    }

}
