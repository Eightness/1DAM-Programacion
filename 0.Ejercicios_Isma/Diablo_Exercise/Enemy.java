//Subclass Enemy
public class Enemy extends Character {

    //Class Atributes

    //---------------------------------------------------------------------------

    //Constructors

    //Empty constructor
    public Enemy() {

    }

    //Full constructor
    public Enemy(String name, int health, int attackDamage) {
        super(name, health, attackDamage);
    }

    //Constructor (only name and health)
    public Enemy(String name, int health) {
        super(name, health, 0);
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


}
