public class Weapon extends Item {

    //Class Attributes
    private int damage;
    private int critChance;
    private int critDamage;
    private int durability;

    //---------------------------------------------------------------------------

    //Constructors

    //Empty Constructor
    public Weapon() {
        
    }

    //Full Constructor
    public Weapon(int damage, int critChance, int critDamage, int durability) {
        this.damage = damage;
        this.critChance = critChance;
        this.critDamage = critDamage;
        this.durability = durability;
    }

    //Constructor (durability by default)
    public Weapon(int damage, int critChance, int critDamage) {
        this.damage = damage;
        this.critChance = critChance;
        this.critDamage = critDamage;
        this.durability = 100;
    }

    //---------------------------------------------------------------------------

    //Functions

    //Function to override patern class "showItem" with new attributes
    @Override
    public void showItem() {
        super.showItem();
        System.out.println("Damage: " + getDamage());
        System.out.println("Crit chance: " + getCritChance());
        System.out.println("Crit damage: " + getCritDamage());
        System.out.println("Durability: " + getDurability());
    }

    //Function to see if the weapon is broken
    public boolean isBroken() {
        if (getDurability() == 0) {
            return true;
        } else {
            return false;
        }
    }

    //Function to compare with another weapon
    public boolean isBetter(Weapon otherWeapon) {
        if (getDamage() > otherWeapon.getDamage()) {
            return true;
        }
        return false;
    }

    //---------------------------------------------------------------------------

    //Setters and Getters

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }

    public void setCritChance(int critChance) {
        this.critChance = critChance;
    }

    public int getCritChance() {
        return critChance;
    }

    public void setCritDamage(int critDamage) {
        this.critDamage = critDamage;
    }

    public int getCritDamage() {
        return critDamage;
    }

    public void setDurability(int durability) {
        this.durability = durability;
    }

    public int getDurability() {
        return durability;
    }
    
}
