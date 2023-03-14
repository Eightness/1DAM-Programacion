public class manaPotion extends Consumable {

    //Class Attributes
    int restoredMana;

    //---------------------------------------------------------------------------

    //Constructors

    //Empty Constructor (restored health by default)
    public manaPotion() {
        this.restoredMana = 100;
    }

    //Full Constructor
    public manaPotion(int restoredMana) {
        this.restoredMana = restoredMana;
    }

    //---------------------------------------------------------------------------

    //Functions

    //Function to override the parent class "showItem" with new attributes
    @Override
    public void showItem() {
        super.showItem();
        System.out.println("Restores: " + getRestoredMana() + " mana.");
    }

    //---------------------------------------------------------------------------

    //Setters and Getters
    public void setRestoredMana(int restoredMana) {
        this.restoredMana = restoredMana;
    }

    public int getRestoredMana() {
        return restoredMana;
    }
    
}
