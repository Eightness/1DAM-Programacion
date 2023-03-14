public class Consumable extends Item {

    //Class Attributes
    int uses;

    //---------------------------------------------------------------------------

    //Constructors

    //Empty Constructor (uses by default)
    public Consumable() {
        this.uses = 3;
    }

    //Full Constructor
    public Consumable(int uses) {
        this.uses = uses;
    }

    //---------------------------------------------------------------------------

    //Functions

    //Function to override the parent class "showItem" with new attributes
    @Override
    public void showItem() {
        super.showItem();
        System.out.println("Uses: " + getUses());
    }

    //---------------------------------------------------------------------------

    //Setters and Getters
    public void setUses(int uses) {
        this.uses = uses;
    }

    public int getUses() {
        return uses;
    }
   
}
