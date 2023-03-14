public class healthPotion extends Consumable {

    //Class Attributes
    int restoredHealth;

    //---------------------------------------------------------------------------

    //Constructors

    //Empty Constructor (restored health by default)
    public healthPotion() {
        this.restoredHealth = 100;
    }

    //Full Constructor
    public healthPotion(int restoredHealth) {
        this.restoredHealth = restoredHealth;
    }

    //---------------------------------------------------------------------------

    //Functions

    //Function to override the parent class "showItem" with new attributes
    @Override
    public void showItem() {
        super.showItem();
        System.out.println("Restores: " + getRestoredHealth() + " health.");
    }

    //---------------------------------------------------------------------------

    //Setters and Getters
    public void setRestoredHealth(int restoredHealth) {
        this.restoredHealth = restoredHealth;
    }

    public int getRestoredHealth() {
        return restoredHealth;
    }
    
}
