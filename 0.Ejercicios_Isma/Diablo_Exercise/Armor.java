public class Armor extends Item {

    //Class Attributes
    int life;
    int armor; 
    int defense;
    int durability;

    //---------------------------------------------------------------------------

    //Constructors

    //Empty Constructor
    public Armor() {

    }

    //Full Constructor
    public Armor(int life, int armor, int defense, int durability) {
        this.life = life;
        this.armor = armor;
        this.defense = defense;
        this.durability = durability;
    }

    //Constructor (durability by default)
    public Armor(int life, int armor, int defense) {
        this.life = life;
        this.armor = armor;
        this.defense = defense;
        this.durability = 100;
    }

    //---------------------------------------------------------------------------

    //Functions

    //Function to override parent class "showAttributes" with new attributes
    @Override
    public void showItem() {
        super.showItem();
        System.out.println("Life: " + getLife());
        System.out.println("Armor: " + getArmor());
        System.out.println("Defense: " + getDefense());
        System.out.println("Durability: " + getDurability());
    }

    //Function to see if the armor is broken
    public boolean isBroken() {
        if (getDurability() == 0) {
            return true;
        }
        return false;
    }

    //Function to compare with another armor
    public boolean isBetter(Armor otherArmor) {
        if (getArmor() > otherArmor.getArmor()) {
            return true;
        }
        return false;
    }

    //---------------------------------------------------------------------------

    //Setters and Getters
    public void setLife(int life) {
        this.life = life;
    }

    public int getLife() {
        return life;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public int getArmor() {
        return armor;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getDefense() {
        return defense;
    }

    public void setDurability(int durability) {
        this.durability = durability;
    }
    
    public int getDurability() {
        return durability;
    }
    
}
