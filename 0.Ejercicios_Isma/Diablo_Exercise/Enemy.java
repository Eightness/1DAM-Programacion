//Subclass Enemy
public class Enemy extends Character {

    //Class Atributes
    private int attackDamage;

    //---------------------------------------------------------------------------

    //Constructors

    //Empty constructor
    public Enemy() {

    }

    //Full constructor
    public Enemy(String name, int health, int attackDamage) {
        super(name, health);
        this.attackDamage = attackDamage;
    }

    //Constructor (only name and health)
    public Enemy(String name, int health) {
        super(name, health);
        this.attackDamage = 10;
    }

    //---------------------------------------------------------------------------

    //Functions

    //Function to show enemy attributes (overriding function in superclass Character)
    @Override
    public void showAttributes() {
        super.showAttributes();
        System.out.println("Attack damage: " + getAttackDamage());
    }

    //---------------------------------------------------------------------------

    //Setters and Getters
    public void setAttackDamage(int attackDamage) {
        this.attackDamage = attackDamage;
    }

    public int getAttackDamage() {
        return this.attackDamage;
    }

}
