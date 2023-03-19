//Subclass Player
public class Player extends Character {

    //Class Atributes
    private int mana;
    private Spell spell;
    private Inventory inventory;

    //---------------------------------------------------------------------------

    //Constructors

    //Empty constructor
    public Player() {
        
    }

    //Full constructor
    public Player(String name, int health, int attackDamage, int mana, Spell spell, Inventory inventory) {
        super(name, health, attackDamage);
        this.mana = mana;
        this.spell = spell;
        this.inventory = inventory;
    }

    //Constructor (without spell nor inventory)
    public Player(String name, int health, int attackDamage, int mana) {
        super(name, health, attackDamage);
        this.mana = mana;
        this.spell = null;
        this.inventory = new Inventory();
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
        showInventory();
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
            this.spell.showAttributes();
    }

    //Function to show inventory
    public void showInventory() {
        System.out.println("Inventory: ");
        this.inventory.showInventory();
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
