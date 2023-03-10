//Class Spell
public class Spell {
    
    //Class Atributes
    private String name;
    private int damage;
    private int cooldown;
    private int manaCost;

    //---------------------------------------------------------------------------

    //Constructors

    //Empty constructor
    public Spell() {

    }

    //Full constructor
    public Spell(String name, int damage, int cooldown, int manaCost) {
        this.name = name;
        this.damage = damage;
        this.cooldown = cooldown;
        this.manaCost = manaCost;
    }

    //---------------------------------------------------------------------------

    //Functions

    //Function to show spell attributes
    public void showAttributes() {
        System.out.println("Name: " + getName());
        System.out.println("Damage: " + getDamage());
        System.out.println("Cooldown: " + getCooldown());
        System.out.println("Mana cost: " + getManaCost());
    }

    //Function to cast spell
    public void castSpell() {
        System.out.println("Casting " + getName() + "...");
    }

    //---------------------------------------------------------------------------

    //Setters and Getters
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getDamage() {
        return this.damage;
    }

    public void setCooldown(int cooldown) {
        this.cooldown = cooldown;
    }

    public int getCooldown() {
        return this.cooldown;
    }

    public void setManaCost(int manaCost) {
        this.manaCost = manaCost;
    }

    public int getManaCost() {
        return this.manaCost;
    }

}
