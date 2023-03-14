//Superclass Character
public class Character {

    //Superclass attributes
    private String name;
    private int health;
    private int attackDamage;

    //---------------------------------------------------------------------------

    //Constructors

    //Empty constructor
    public Character() {
    }

    //Full constructor
    public Character(String name, int health, int attackDamage) {
        this.name = name;
        this.health = health;
        this.attackDamage = attackDamage;
    }

    //Constructor (only name)
    public Character(String name) {
        this.name = name;
        this.health = 100;
        this.attackDamage = 10;
    }

    //---------------------------------------------------------------------------

    //Function to attack
    public void attack(Character target) {
        System.out.printf("%s attacks %s and deals %d damage%n", getName(), target.getName(), attackDamage);

        target.takeDamage(attackDamage);
    }

    //Function to take damage
    public void takeDamage(int amount) {
        this.health -= amount;
    }

    //Function to see if the character is dead
    public boolean isDead() {
        return this.health <= 0;
    }

    //Function to show attributes 
    public void showAttributes() {
        System.out.println("Name: " + getName());
        System.out.println("Health: " + getHealth());
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
    
    public void setAttackDamage(int attackDamage) {
        this.attackDamage = attackDamage;
    }

    public int getAttackDamage() {
        return this.attackDamage;
    }
}
