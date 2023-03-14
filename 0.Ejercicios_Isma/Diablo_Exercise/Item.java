public class Item {

    //Class Attributes
    String name;
    String description;

    //---------------------------------------------------------------------------

    //Constructors

    //Empty Constructor
    public Item() {
        
    }

    //Full Constructor
    public Item(String name, String description) {
        this.name = name;
        this.description = description;
    }

    //---------------------------------------------------------------------------

    //Functions

    //Function to show item attributes
    public void showItem() {
        System.out.println("Name: " + getName());
        System.out.println("Description: " + getDescription());
    }
    //---------------------------------------------------------------------------
    
    //Setters and Getters
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
    
}
