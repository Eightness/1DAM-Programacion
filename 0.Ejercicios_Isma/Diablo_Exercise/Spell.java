public class Spell {
    
    //Class Atributes
    private String spellName;
    private int damage;
    private int cooldown;
    private int manaCost;

    //---------------------------------------------------------------------------

    //Constructor
    public Spell(String spellName, int damage, int cooldown, int manaCost) {
        this.spellName = spellName;
        this.damage = damage;
        this.cooldown = cooldown;
        this.manaCost = manaCost;
    }

    //---------------------------------------------------------------------------

    //Functions

    //Function to show spell attributes
    public void showSpellAttributes() {
        System.out.println("Spell name: " + getSpellName());
        System.out.println("Base damage input: " + getDamage());
        System.out.println("Base cooldown: " + getCooldown());
        System.out.println("Base mana cost: " + getManaCost());
    }

    //---------------------------------------------------------------------------

    //Setters and Getters
    public void setSpellName(String spellName) {
        this.spellName = spellName;
    }

    public String getSpellName() {
        return this.spellName;
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
