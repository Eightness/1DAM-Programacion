public class Inventory {
    
    //Class Attributes
    private static int maxItems = 36;
    private Item[][] items = new Item[(int)Math.sqrt(maxItems)][(int)Math.sqrt(maxItems)];

    //---------------------------------------------------------------------------

    //Constructors

    //Empty constructor
    public Inventory() {

    }

    //Full constructor
    public Inventory(Item[][] items) {
        this.items = items;
    }

    //---------------------------------------------------------------------------

    //Functions

    //Function to see if the inventory is empty
    public boolean isEmpty() {
        for (int i = 0; i < items.length; i++) {
            for (int j = 0; j < items[i].length; j++) {
                if (items[i] != null) {
                    return false;
                }
            }
        }
        return true;
    }

    //Function to see if the inventory is full
    public boolean isFull() {
        for (int i = 0; i < items.length; i++) {
            for (int j = 0; j < items[i].length; j++) {
                if (items[i] == null) {
                    return false;
                }
            }
        }
        return true;
    }

    //Function to find a specific item within the inventory
    public boolean itemFinder(String itemName) {
        for (int i = 0; i < items.length; i++) {
            for (int j = 0; j < items[i].length; j++) {
                if (items[i][j] == null) {
                    continue;
                } else {
                    if (items[i][j].getName().equals(itemName)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    //Function to show full inventory
    public void showInventory() {
        for (int i = 0; i < items.length; i++) {
            for (int j = 0; j < items[i].length; j++) {
                if (items[i][j] == null) {
                    continue;
                } else {
                    System.out.println("Slot " + (i + 1) + ": ");
                    items[i][j].showItem();
                    System.out.println();
                }
            }
        }
    }


    //---------------------------------------------------------------------------

    //Setters and Getters
    public void setItems(Item[][] items) {
        this.items = items;
    }

    public Item[][] getItems() {
        return items;
    }

}
