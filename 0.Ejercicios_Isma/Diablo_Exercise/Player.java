//Subclass Player
public class Player extends Character {

    //Class Atributes
    private int mana;
    private Spell spell;

    //---------------------------------------------------------------------------

    //Constructors

    //Empty constructor
    public Player() {

    }

    //Full constructor
    public Player(String name, int health, int attackDamage, int mana, Spell spell) {
        super(name, health, attackDamage);
        this.mana = mana;
        this.spell = spell;
    }

    //Constructor (only name and health)
    public Player(String name, int health) {
        super(name, health, 0);
        this.mana = 100;
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

    //Function to attack
    @Override
    public void attack(Character target) {
        if (!hasEnoughMana())
        {
            super.attack(target);
            return;
        }

        System.out.printf("%s casts %s on target %s and deals %d damage%n", getName(), getSpell().getName(), target.getName(), getSpell().getDamage());
        target.takeDamage(getSpell().getDamage());
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
    
    public void setSpell(Spell spell) {
        this.spell = spell;
    }
    
    public Spell getSpell() {
        return this.spell;
    }

}
